package pe.egcc.app.prueba;

import pe.egcc.app.model.SumaModel;
import pe.egcc.app.service.PruebaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    // Datos
    SumaModel model = new SumaModel(50, 60, 0);
    // Proceso
    PruebaService service = new PruebaService();
    service.sumar(model);
    // Reporte
    System.out.println("a: " + model.getNum1());
    System.out.println("b: " + model.getNum2());
    System.out.println("s: " + model.getSuma());
  }
}
