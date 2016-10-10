package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Empleado;
import service.Loginservice;

/**
 *
 * @author Nemias
 */
@WebServlet(name = "Logincontroller", urlPatterns = {"/LoginIngreso", "/LoginSalir"})
public class Logincontroller extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException {
    String path = request.getServletPath();
    if(path.equals("/LoginIngreso")){
      loginIngreso(request,response);
    } else if(path.equals("/LoginSalir")){
      loginSalir(request,response);
    }
    
  }
  
    private void loginIngreso(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    String destino = "";
    try {

      String usuario = request.getParameter("usuario");
      String clave = request.getParameter("clave");

      Loginservice service = new Loginservice();
      Empleado bean = service.validar(usuario, clave);

      HttpSession session = request.getSession();
      session.setAttribute("usuario", bean);
      destino = "main.jsp";
    } catch (Exception e) {
      e.printStackTrace();
      request.setAttribute("error", e.getMessage());
      destino = "index.jsp";
    }

    RequestDispatcher rd = request.getRequestDispatcher(destino);
    rd.forward(request, response);
  }

  private void loginSalir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    HttpSession session = request.getSession();
    session.invalidate();

    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
    
  }
}
