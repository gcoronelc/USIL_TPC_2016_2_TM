package pe.egcc.app.service;

import pe.egcc.app.model.PromModel;

public class PromService {

  public void procesar(PromModel model) {
    // Proceso
    int pf = (model.getPromPract() + 
            model.getExaParcial() + model.getExaFinal())/3;
    String condicion;
    if(pf >= 13){
      condicion = "Aprobado";
    } else if( pf >= 11){
      condicion = "Sustitutorio";
    } else {
      condicion = "Desaprobado";
    }
    // Reporte
    model.setPromFinal(pf);
    model.setCondicion(condicion);
  }
}
