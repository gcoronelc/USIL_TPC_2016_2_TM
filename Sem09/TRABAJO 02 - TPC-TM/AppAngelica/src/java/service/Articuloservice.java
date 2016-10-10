
package service;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nemias
 */
public class Articuloservice {
    
      public List<Map<String,Object>> getArticulos(String NomCategoria){
    List<Map<String,Object>> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "SELECT IdArticulo, IdCategoria, "
              +"NomArticulo, PreArticulo, Stock "
              + "FROM articulo "             
              + "where NomArticulo= ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, NomCategoria);
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        Map<String,Object> rec = new HashMap<>();
        rec.put("IdArticulo", rs.getString("IdArticulo"));
        rec.put("IdCategoria", rs.getInt("IdCategoria"));
        rec.put("NomArticulo", rs.getString("NomArticulo"));
        rec.put("PreArticulo", rs.getString("PreArticulo"));
        rec.put("Stock", rs.getString("Stock"));
        lista.add(rec);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  } 
}
