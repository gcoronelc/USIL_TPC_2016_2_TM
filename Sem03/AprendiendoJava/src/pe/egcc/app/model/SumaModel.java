package pe.egcc.app.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email egcc.usil@gmail.com
 */
public class SumaModel {

  private int num1;
  private int num2;
  private int suma;

  /**
   * Constructor por defecto
   */
  public SumaModel() {
  }

  /**
   * Constructor adicional
   *
   * @param num1
   * @param num2
   * @param suma
   */
  public SumaModel(int num1, int num2, int suma) {
    this.num1 = num1;
    this.num2 = num2;
    this.suma = suma;
  }

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getSuma() {
    return suma;
  }

  public void setSuma(int suma) {
    this.suma = suma;
  }

}
