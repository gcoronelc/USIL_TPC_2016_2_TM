package pe.egcc.carrito.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class Item {
  
  private String nombre;
  private double precio;
  private int cant;
  private double importe;

  public Item() {
  }

  public Item(String nombre, double precio, int cant) {
    this.nombre = nombre;
    this.precio = precio;
    this.cant = cant;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  @Override
  public String toString() {
    String texto = nombre + " | " + precio 
            + " | " + cant + " | " + importe;
    return texto;
  }
  
}
