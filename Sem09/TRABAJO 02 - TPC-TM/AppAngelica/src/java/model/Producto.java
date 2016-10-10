package model;

/**
 *
 * @author Nemias
 */
public class Producto {
    
   private String id;
    private int idCat;
    private String Nombre;
    private double precio;
    private int stock;
    
     public Producto(int idCat, String Nombre, double precio, int stock) {
        this.idCat = idCat;
        this.Nombre = Nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public Producto(){
        
    }
    
}
