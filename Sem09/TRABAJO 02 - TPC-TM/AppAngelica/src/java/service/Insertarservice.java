
package service;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;
import model.Producto;



/**
 *
 * @author Nemias
 */
public class Insertarservice {
     public void registrarProducto(Producto bean) {
         Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      String sql = "select prefijo, conCategoria "
              + "from categoria where idcategoria = ? "
              + "for update ";
        PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, bean.getIdCat());
        ResultSet rs = pstm.executeQuery();
      if (!rs.next()) {
        throw new Exception("Categoría incorrecta.");
      }
      String prefijo = rs.getString("prefijo");
      int cont = rs.getInt("conCategoria");
      rs.close();
      pstm.close();
      cont = cont + 1;
      sql = "update categoria set conCategoria = ? where idcategoria = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setInt(1, cont);
      pstm.setInt(2, bean.getIdCat());
      int filas = pstm.executeUpdate();
      pstm.close();
      if (filas != 1) {
        throw new Exception("Parece que la categoría es incorrecta.");
      }
      String patron = "00000";
        NumberFormat format = new DecimalFormat(patron);
      String codArt = prefijo + format.format(cont);
      // Paso 4: Insertar articulo
      sql = "insert into Articulo(IdArticulo,IdCategoria,NomArticulo,"
              + "PreArticulo, Stock) values(?,?,?,?,?)";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, codArt);
      pstm.setInt(2, bean.getIdCat());
      pstm.setString(3, bean.getNombre());
      pstm.setDouble(4, bean.getPrecio());
      pstm.setInt(5, bean.getStock());
      pstm.execute();
      pstm.close();
      // Confirmar Tx
      cn.commit();
      bean.setId(codArt);
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      String texto = "Error en la transacción. ";
      texto += e.getMessage();
      throw new RuntimeException(texto);
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }
      public List<Categoria> getCategorias() {
    List<Categoria> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select IdCategoria, NomCategoria, "
              + "Prefijo, ConCategoria "
              + "from Categoria ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Categoria bean = new Categoria();
        bean.setIdCat(rs.getInt("IdCategoria"));
        bean.setNombre(rs.getString("NomCategoria"));
        bean.setPrefijo(rs.getString("Prefijo"));
        bean.setCont(rs.getInt("ConCategoria"));
        lista.add(bean);
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
