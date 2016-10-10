package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Producto;
import service.Insertarservice;

/**
 *
 * @author Nemias
 */
@WebServlet(name = "Insertarcontroller", urlPatterns = {"/InsertarProductoForm","/InsertarProductoSave"})
public class Insertarcontroller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String path = request.getServletPath();
    switch(path){
      case "/InsertarProductoForm":
        insertarProductoForm(request,response);
        break;
      case "/InsertarProductoSave":
        insertarProductoSave(request,response);
        break;
    }
    }

    private void insertarProductoForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       // Proceso
Insertarservice service = new Insertarservice();
    request.setAttribute("categorias", service.getCategorias());
    // Forware
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("Insertar.jsp");
    rd.forward(request, response);
    }

    private void insertarProductoSave(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    try {
      // Datos
      Producto art = new Producto();
      art.setIdCat(Integer.parseInt(request.getParameter("cat")));
      art.setNombre(request.getParameter("nombre"));
      art.setPrecio(Double.parseDouble(request.getParameter("precio")));
      art.setStock(Integer.parseInt(request.getParameter("stock")));
      // Proceso
      Insertarservice  service = new Insertarservice();
      service.registrarProducto(art);
      request.setAttribute("codigo", art.getId());
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("Insertar.jsp");
    rd.forward(request, response);
    }

    
 
}
