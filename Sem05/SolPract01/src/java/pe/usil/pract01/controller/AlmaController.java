package pe.usil.pract01.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.usil.pract01.model.AlmaModel;
import pe.usil.pract01.service.AlmaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
@WebServlet(urlPatterns = {"/AlmaFormulario", "/AlmaProcesar"})
public class AlmaController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {
    String path = request.getServletPath();
    if (path.equals("/AlmaFormulario")) {
      almaFormulario(request, response);
    } else if (path.equals("/AlmaProcesar")) {
      almaProcesar(request, response);
    }
  }

  private void almaFormulario(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {

    AlmaService service = new AlmaService();
    request.setAttribute("cursos", service.getCursos());
    request.setAttribute("categorias", service.getCategorias());

    RequestDispatcher rd;
    rd = request.getRequestDispatcher("formulario.jsp");
    rd.forward(request, response);
  }

  private void almaProcesar(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {
    try {
      // Datos
      AlmaModel model = new AlmaModel();
      model.setCurso(request.getParameter("curso"));
      model.setCategoria(request.getParameter("categoria"));
      model.setVacantes(Integer.parseInt(request.getParameter("vacantes")));
      // Proceso
      AlmaService service = new AlmaService();
      service.procesar(model);
      request.setAttribute("model", model);
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
      almaFormulario(request, response);
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("resultado.jsp");
    rd.forward(request, response);
  }

}
