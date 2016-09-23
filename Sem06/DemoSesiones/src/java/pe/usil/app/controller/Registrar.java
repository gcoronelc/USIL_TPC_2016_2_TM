package pe.usil.app.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Registrar", 
        urlPatterns = {"/Registrar","/FinSession"})
public class Registrar extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    String path = request.getServletPath();
    if( path.equals("/Registrar")){
      registrar(request, response);
    } else if(path.equals("/FinSession")){
      finSession(request,response);
    }
  } // Fin de service

  
 
  protected void registrar(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String nombre = request.getParameter("nombre");
    // Obtener session
    HttpSession session = request.getSession();
    session.setAttribute("nombre", nombre);
    // Forward        
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("resultado.jsp");
    rd.forward(request, response);
  } // Fin de registrar

  private void finSession(HttpServletRequest request, 
          HttpServletResponse response) throws IOException {
    // Finalizar session
    HttpSession session = request.getSession();
    session.invalidate();
    // Cargando el index.html
    response.sendRedirect("index.html");
  }

} // Fin del servlet
