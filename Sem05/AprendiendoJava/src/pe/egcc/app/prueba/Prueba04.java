/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase01;
import pe.egcc.app.model.Clase02;
import pe.egcc.app.model.Clase03;

/**
 *
 * @author profesor
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    Clase01 a = new Clase02();
    
    Object b = a; // Upcasting
    
    Clase02 c = (Clase02) a; // Downcasting
    
    
    Clase03 d = (Clase03) a;
    
    System.out.println("Jejejeje");
    
    
    Clase02 x = new Clase03();
        
  }
  
  
}
