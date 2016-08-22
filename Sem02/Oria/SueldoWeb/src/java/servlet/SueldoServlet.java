package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jacob
 */
@WebServlet(name = "SueldoServlet", urlPatterns = {"/SueldoServlet"})
public class SueldoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
        try{
            //Variables
            String nombre = request.getParameter("nombre");
            double ht = Double.parseDouble(request.getParameter("ht"));
            double pagoh = Double.parseDouble(request.getParameter("pagoh"));
            
            double he = Double.parseDouble(request.getParameter("horaExtra"));
            double grati = Double.parseDouble(request.getParameter("grati"));
            double bRes = Double.parseDouble(request.getParameter("bonoRespo"));
            double bPro = Double.parseDouble(request.getParameter("bonoPro"));
            //Proceso
            double totalHaberes = ((ht + he) * pagoh) + grati;
            double totalBonos = (bRes + bPro);
            double subTotal = (totalHaberes + totalBonos);
            double igv = subTotal * 0.18;
            double afp = subTotal * 0.1;
            double seg = subTotal * 0.03;
            double totalDesc = (igv + afp + seg);
            double sueldoTotal = subTotal - totalDesc;
            //Salida
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SueldoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center> Resultado </center></h1>");
            out.println("<p><center> Sr(a)." + nombre + ", sus resultados son:</center></p>");
            out.println("<p><center>HABERES</center></p>");
            out.println("<p>Horas Trabajadas: " + ht + "</p>");
            out.println("<p>Pago por hora: " + pagoh + "</p>");
            out.println("<p>Gratificacion: " + grati + "</p>");
            out.println("<p>Total Haberes: " + totalHaberes + "</p>");
           
            out.println("<p><center>BONOS</center></p>");
            out.println("<p>Bono Responsable: " + bRes + "</p>");
            out.println("<p>Bono Produccion: " + bPro + "</p>");
            out.println("<p>Total Bonos: " + totalBonos + "</p>");
            
            out.println("<p><center>DESCUENTO:</center></p>");
            out.println("<p>IGV(18%): " + igv + "</p>");
            out.println("<p>AFG(10%): " + afp + "</p>");
            out.println("<p>Seguro(3%): " + seg + "</p>");
            out.println("<p>Total Descuento: " + totalDesc + "</p>");
            out.println("<p>IGV(18%): " + igv + "</p>");
            out.println("<p>Sueldo Total: " + sueldoTotal + "</p>");
            out.println("<p>IGV(18%): " + igv + "</p>");
            out.println("<a href ='index.html'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
          e.printStackTrace();
            //Salida
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SueldoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p style=''color:red;'>Error: " + e.getMessage() + "</p>");
            out.println("<a href ='index.html'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Debes ir al formulario</p>");
            out.println("<a href ='index.html'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
