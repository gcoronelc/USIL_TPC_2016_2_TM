package pe.usil.pract01.service;

import pe.usil.pract01.model.AlmaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class AlmaService {

  // Cursos
  private final String CUR01 = "Gestión de Proyectos de Software";
  private final String CUR02 = "Gestión de TI bajo el enfoque ITIL";
  private final String CUR03 = "Inteligencia de Negocios con SQL Server";
  private final String CUR04 = "Desarrollo de Servicios Web REST";
  // Categorías
  private final String CAT01 = "FUNDAMENTOS";
  private final String CAT02 = "AVANZADO";
  private final String CAT03 = "EXPERTO";
  
  /**
   * 
   * @return Retorna un arreglo de los cursos
   */
  public String[] getCursos(){
    String[] cursos = {CUR01,CUR02,CUR03,CUR04};
    return cursos;
  }
  
  /**
   * 
   * @return Retorna un arreglo con las categorías
   */
  public String[] getCategorias(){
    String[] categorias = {CAT01,CAT02,CAT03};
    return categorias;
  }

  public void procesar(AlmaModel model) {
  
  
  }
  
  
  
  
}
