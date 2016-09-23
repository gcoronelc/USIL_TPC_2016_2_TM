package pe.egcc.carrito.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>();
    
    lista.add(20);
    lista.add(9);
    lista.add(17);
    lista.add(6);
    lista.add(8);
    lista.add(15);
    lista.add(55);
    
    int suma = 0;
    for (Integer n : lista) {
      suma += n;
    }
    
    System.out.println("Suma: " + suma);
  }
  
}
