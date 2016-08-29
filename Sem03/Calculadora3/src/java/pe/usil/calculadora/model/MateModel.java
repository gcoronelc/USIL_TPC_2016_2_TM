package pe.usil.calculadora.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class MateModel {
  
  private String opera;
  private int n1;
  private int n2;
  private int rpta;

  public MateModel() {
  }

  public MateModel(String opera, int n1, int n2, int rpta) {
    this.opera = opera;
    this.n1 = n1;
    this.n2 = n2;
    this.rpta = rpta;
  }

  
  public String getOpera() {
    return opera;
  }

  public void setOpera(String opera) {
    this.opera = opera;
  }

  public int getN1() {
    return n1;
  }

  public void setN1(int n1) {
    this.n1 = n1;
  }

  public int getN2() {
    return n2;
  }

  public void setN2(int n2) {
    this.n2 = n2;
  }

  public int getRpta() {
    return rpta;
  }

  public void setRpta(int rpta) {
    this.rpta = rpta;
  }
  
  
}
