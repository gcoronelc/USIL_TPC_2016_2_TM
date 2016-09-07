package pe.egcc.app.service;

import pe.egcc.app.model.SumaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class PruebaService {
  
  /**
   * En este caso, los parametros se pasan por valor.
   * Los tipos primitivos se pasan por valor.
   * 
   * @param num1
   * @param num2
   * @return 
   */
  public int sumar(int num1, int num2){
    int suma = num1 + num2;
    num1 = 1000; // Solo dentro del método
    num2 = 2000; // Solo dentro del método
    return suma;
  }
  
  public void sumar(SumaModel model){
    model.setSuma(model.getNum1() + model.getNum2());
    model.setNum1(1000);
    model.setNum2(2000);
  }
  
  public void showMensaje(String mensaje){
    System.out.println("Mensaje: " + mensaje);
    mensaje = "Es un Gustavo.";
  }
}
