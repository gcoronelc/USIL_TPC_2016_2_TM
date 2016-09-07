package pe.egcc.app.prueba;

import pe.egcc.app.model.SumaModel;
import pe.egcc.app.service.PruebaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    String cadena = new String("Hola Gustavo.");
    PruebaService service = new PruebaService();
    service.showMensaje(cadena);
    System.out.println("Cadena: " + cadena);
  }
}
