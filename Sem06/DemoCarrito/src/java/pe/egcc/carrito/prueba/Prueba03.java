package pe.egcc.carrito.prueba;

import pe.egcc.carrito.model.Carrito;
import pe.egcc.carrito.model.Item;
import pe.egcc.carrito.service.CarritoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    Carrito carrito = new Carrito();
    carrito.setCliente("JESUS");
    CarritoService service = new CarritoService();
    
    service.addItem(carrito, new Item(service.ART01, 4.50, 10));
    service.addItem(carrito, new Item(service.ART03, 5.50, 15));
    service.addItem(carrito, new Item(service.ART06, 3.50, 20));
    
    mostrar(carrito);
    
  }

  private static void mostrar(Carrito c) {
    System.out.println("Cliente: " + c.getCliente());
    System.out.println("Importe: " + c.getImporte());
    System.out.println("Impuesto: " + c.getImpuesto());
    System.out.println("Total: " + c.getTotal());
    for(Item i: c.getItems()){
      System.out.println(i.toString());
    }
  }
  
  
}
