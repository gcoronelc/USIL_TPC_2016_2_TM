package pe.egcc.ventasweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
@WebServlet(name = "ProductoController",
        urlPatterns = {"/ProductoTraerUno", "/fsdfsdfs", "/sdfsdfsd"})
public class ProductoController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

    switch (request.getServletPath()) {
      case "/ProductoTraerUno":
        traerUno(request, response);
        break;
    }

  }

  private void traerUno(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/plain");
    ServletOutputStream out = response.getOutputStream();
    out.println("La proxima clase se resuelve");
    out.close();
    out.flush();
  }

}
