
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Articuloservice;

/**
 *
 * @author Nemias
 */
@WebServlet(name = "Articulocontroller", urlPatterns = {"/Articulocontroller"})
public class Articulocontroller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
            // Dato
            String NomArticulo = request.getParameter("producto");
            // Proceso
            Articuloservice service = new Articuloservice();
              request.setAttribute("lista",service.getArticulos(NomArticulo));
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }

        RequestDispatcher rd;
        rd = request.getRequestDispatcher("Articulo.jsp");
        rd.forward(request, response);
    }

    
}
