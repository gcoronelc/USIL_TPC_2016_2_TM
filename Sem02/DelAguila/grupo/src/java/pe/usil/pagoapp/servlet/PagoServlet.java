package pe.usil.pagoapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nemias
 */
@WebServlet(name = "PagoServlet", urlPatterns = {"/PagoServlet"})
public class PagoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //datos
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        int horas_trabajadas = Integer.parseInt(request.getParameter("ht"));
        int horas_extras = Integer.parseInt(request.getParameter("he"));
        int pagoht, pagohe;
        String cbiafp = request.getParameter("cbiafp");
        String cbisegurovida = request.getParameter("cbisegurovida");
        String cbicts = request.getParameter("cbicts");
        String cbifiestaspatrias = request.getParameter("cbifiestaspatrias");
        String cbiescolaridad= request.getParameter("cbiescolaridad");
        String cbinavidad = request.getParameter("cbinavidad");
        //proceso
        int vafp = 0, vseguro = 0, vcts = 0;
        if (cbiafp != null && cbiafp.equals("x")) {
           vafp = 250;
        }
        if (cbisegurovida != null && cbisegurovida.equals("y")) {
            vseguro = 200;
        }
        if (cbicts != null && cbicts.equals("z")) {
            vcts = 300;
        }
        int vfp = 0, vnavidad = 0, vescolaridad = 0;
        if (cbifiestaspatrias != null && cbifiestaspatrias.equals("a")) {
            vfp = 280;
        }
        if (cbiescolaridad != null && cbiescolaridad.equals("b")) {
            vescolaridad = 400;
        }
        if (cbinavidad != null && cbinavidad.equals("c")) {
            vnavidad = 380;
        }

        int descuento = vafp + vseguro + vcts;
        int bonos = vfp + vescolaridad + vnavidad;
        pagoht = 20 * horas_trabajadas;
        pagohe = 30 * horas_extras;
        double total = pagohe + pagoht + bonos - descuento;
        //reporte

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>INFORME DE PAGO</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>INFORME DE PAGO</h1>");
        out.println("<p>Pago de horas trabajadas: " + pagoht + "</p>");
        out.println("<p>Pago de horas extras: " + pagohe + "</p>");
        out.println("<p>AFP: " + vafp + "</p>");
        out.println("<p>Seguro de vida: " + vseguro + "</p>");
        out.println("<p>CTS: " + vcts + "</p>");
        out.println("<p>Fiestas Patrias: " + vfp + "</p>");
        out.println("<p>Escolaridad: " + vescolaridad + "</p>");
        out.println("<p>Navidad: " + vnavidad + "</p>");
        out.println("<p>sueldo: " + total + "</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
