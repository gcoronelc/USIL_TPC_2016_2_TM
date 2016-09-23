package pe.egcc.carrito.service;

import pe.egcc.carrito.model.Carrito;
import pe.egcc.carrito.model.Item;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class CarritoService {
  
  public static final String ART01 = "Coca Cola";
  public static final String ART02 = "Tamal";
  public static final String ART03 = "Empanada de Pollo";
  public static final String ART04 = "Empanada de Carne";
  public static final String ART05 = "Omelette";
  public static final String ART06 = "Chicha Morada";
  
  public String[] getArticulos(){
    String[] lista = {ART01,ART02,ART03,ART04,ART05,ART06};
    return lista;
  }
  
  
  public void addItem(Carrito carrito, Item item){
    // Proceso
    item.setImporte(item.getPrecio() * item.getCant());
    item.setImporte(redondear(item.getImporte()));
    carrito.getItems().add(item);
    double total = redondear(calcularTotal(carrito));
    double importe = redondear(total / 1.18);
    double impuesto = redondear(total - importe);
    // Actualizar carrito
    carrito.setImporte(importe);
    carrito.setImpuesto(impuesto);
    carrito.setTotal(total);
  } // Fin de addItem

  private double calcularTotal(Carrito carrito) {
    double total = 0.0;
    for(Item i: carrito.getItems()){
      total = total + i.getImporte();
    }
    return total;
  }

  private double redondear(double value) {
    value = value * 100;
    value = Math.round(value) / 100.0;
    return value;
  }

  
  
} // Fin de CarritoService
