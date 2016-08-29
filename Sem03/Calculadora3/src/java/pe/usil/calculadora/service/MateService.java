package pe.usil.calculadora.service;

import pe.usil.calculadora.model.MateModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class MateService {
  
  public int sumar(int n1, int n2){
    return n1 + n2;
  }
  
  public int restar(int n1, int n2){
    return n1 - n2;
  }
  
  public int multiplicar(int n1, int n2){
    return n1 * n2;
  }
  
  public int dividir(int n1, int n2){
    return n1 / n2;
  }
  
  public int resto(int n1, int n2){
    return n1 % n2;
  }

  public void procesar(MateModel model) {
    switch(model.getOpera()){
      case "S":
        model.setOpera("Suma");
        model.setRpta(sumar(model.getN1(), model.getN2()));
        break;
      case "R":
        model.setOpera("Resta");
        model.setRpta(restar(model.getN1(), model.getN2()));
        break;
      default:
        model.setOpera("NO SE");
    }
  }
  
}
