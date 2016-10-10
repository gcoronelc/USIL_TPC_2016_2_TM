package tpc.ep.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tpc.ep.model.Item;
import tpc.ep.service.ServiceLuz;

/**
 *
 * @author alumno
 */
@WebServlet(name = "Luz", urlPatterns = {"/Luz"})
public class LuzController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Item model = new Item();
            // Dato
            model.setAnterior(Integer.parseInt(request.getParameter("anterior")));
            model.setActual(Integer.parseInt(request.getParameter("actual")));
            // Proceso
          ServiceLuz service = new ServiceLuz();
          service.procesar(model);
            // Reporte
            request.setAttribute("model",model);
            
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }
        // Forward
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
