package pe.egcc.ventasweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EmpleadoController", 
urlPatterns = {"/EmpleadoConsulta", "/EmpleadoEliminar", 
  "/EmpleadoEditar"})
public class EmpleadoController extends HttpServlet {

  
  
} // Fin de EmpleadoController
