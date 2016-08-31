package pe.egcc.app.prueba;

import pe.egcc.app.service.PruebaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    int a = 50;
    int b = 60;
    // Proceso
    PruebaService service = new PruebaService();
    int s = service.sumar(a, b);
    // Reporte
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("s: " + s);
  }
}
