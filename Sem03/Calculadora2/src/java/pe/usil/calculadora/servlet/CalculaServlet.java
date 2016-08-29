package pe.usil.calculadora.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    int rpta = 0;
    MateService service = new MateService();
    switch(opera){
      case "S":
        opera = "Suma";
        rpta = service.sumar(n1, n2);
        break;
      case "R":
        opera = "Resta";
        rpta = service.restar(n1, n2);
        break;
      default:
        opera = "No se";
    }
    // Datos para el JSP
    request.setAttribute("opera", opera);
    request.setAttribute("n1", n1);
    request.setAttribute("n2", n2);
    request.setAttribute("rpta", rpta);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("calcula.jsp");
    rd.forward(request, response);
  }

  

}