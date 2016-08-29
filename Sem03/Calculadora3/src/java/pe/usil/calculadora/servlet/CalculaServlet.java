package pe.usil.calculadora.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.usil.calculadora.model.MateModel;
import pe.usil.calculadora.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
@WebServlet(name = "CalculaServlet", urlPatterns = {"/CalculaServlet"})
public class CalculaServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException {
    // Datos
    String opera = request.getParameter("opera");
    int n1 = Integer.parseInt(request.getParameter("num1"));
    int n2 = Integer.parseInt(request.getParameter("num2"));
    // Proceso
    MateModel model = new MateModel(opera, n1, n2, 0);
    MateService service = new MateService();
    service.procesar(model);
    // Datos para el JSP
    request.setAttribute("model", model);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("calcula.jsp");
    rd.forward(request, response);
  }

  

}