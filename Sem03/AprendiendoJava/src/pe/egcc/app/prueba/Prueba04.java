package pe.egcc.app.prueba;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    Double a = 15.0;
    Double b = 15.0;
    
    // Compara direcciones de memoria
    System.out.println("Caso 1");
    if( a == b ){
      System.out.println("Son iguales");
    } else {
      System.out.println("son diferentes");
    }
    
    // Compara los valores
    System.out.println("Caso 2");
    if( a.doubleValue() == b.doubleValue() ){
      System.out.println("Son iguales");
    } else {
      System.out.println("son diferentes");
    }
  }
}
