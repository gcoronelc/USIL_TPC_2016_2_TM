package pe.egcc.app.model;

public class PromModel {

  // Datos
  private int promPract;
  private int exaParcial;
  private int exaFinal;
  // Resultado
  private int promFinal;
  private String condicion;

  public PromModel() {
  }

  public int getPromPract() {
    return promPract;
  }

  public void setPromPract(int promPract) {
    this.promPract = promPract;
  }

  public int getExaParcial() {
    return exaParcial;
  }

  public void setExaParcial(int exaParcial) {
    this.exaParcial = exaParcial;
  }

  public int getExaFinal() {
    return exaFinal;
  }

  public void setExaFinal(int exaFinal) {
    this.exaFinal = exaFinal;
  }

  public int getPromFinal() {
    return promFinal;
  }

  public void setPromFinal(int promFinal) {
    this.promFinal = promFinal;
  }

  public String getCondicion() {
    return condicion;
  }

  public void setCondicion(String condicion) {
    this.condicion = condicion;
  }

}
