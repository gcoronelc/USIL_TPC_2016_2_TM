package pe.egcc.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.db.AccesoDB;
import pe.egcc.app.model.Cliente;

public class ClienteService {

  public List<Cliente> leer(Cliente bean) {
    List<Cliente> lista = new ArrayList();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo,vch_cliepaterno,"
              + "vch_cliematerno,vch_clienombre,"
              + "chr_cliedni,vch_clieciudad,"
              + "vch_cliedireccion,vch_clietelefono,"
              + "vch_clieemail from cliente "
              + "where vch_cliepaterno like concat(?,'%') "
              + "and vch_cliematerno like concat(?,'%') "
              + "and vch_clienombre like concat(?,'%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getPaterno());
      pstm.setString(2, bean.getMaterno());
      pstm.setString(3, bean.getNombre());
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        lista.add(rowToBean(rs));
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

  private Cliente rowToBean(ResultSet rs)
          throws SQLException {
    Cliente bean = new Cliente();
    bean.setCodigo(rs.getString("chr_cliecodigo"));
    bean.setPaterno(rs.getString("vch_cliepaterno"));
    bean.setMaterno(rs.getString("vch_cliematerno"));
    bean.setNombre(rs.getString("vch_clienombre"));
    bean.setDni(rs.getString("chr_cliedni"));
    bean.setCiudad(rs.getString("vch_clieciudad"));
    bean.setDireccion(rs.getString("vch_cliedireccion"));
    bean.setTelefono(rs.getString("vch_clietelefono"));
    bean.setEmail(rs.getString("vch_clieemail"));
    return bean;
  }

  public Cliente leer(String codigo) {
    Cliente bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo,vch_cliepaterno,"
              + "vch_cliematerno,vch_clienombre,"
              + "chr_cliedni,vch_clieciudad,"
              + "vch_cliedireccion,vch_clietelefono,"
              + "vch_clieemail from cliente "
              + "where chr_cliecodigo = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        bean = rowToBean(rs);
      }
      rs.close();
      pstm.close();
      if (bean == null) {
        throw new Exception("Codigo " + codigo + " no existe.");
      }
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

  public void modificar(Cliente bean) {
    Connection cn = null;
    try {
      // Obtener objeto Connection
      cn = AccesoDB.getConnection();
      // Inicio de Tx
      cn.setAutoCommit(false);
      // Proceso
      String sql = "update cliente set "
              + "vch_cliepaterno = ?, "
              + "vch_cliematerno = ?, "
              + "vch_clienombre = ?, "
              + "chr_cliedni = ?, "
              + "vch_clieciudad = ?, "
              + "vch_cliedireccion = ?, "
              + "vch_clietelefono = ?, "
              + "vch_clieemail = ? "
              + "where chr_cliecodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getPaterno());
      pstm.setString(2, bean.getMaterno());
      pstm.setString(3, bean.getNombre());
      pstm.setString(4, bean.getDni());
      pstm.setString(5, bean.getCiudad());
      pstm.setString(6, bean.getDireccion());
      pstm.setString(7, bean.getTelefono());
      pstm.setString(8, bean.getEmail());
      pstm.setString(9, bean.getCodigo());
      int filas = pstm.executeUpdate();
      if(filas == 0){
        throw new Exception("Datos incorrectos.");
      }
      // Confirmar Tx
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      String texto = "Error en el proceso crear empleado. ";
      texto += e.getMessage();
      throw new RuntimeException(texto);
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

}
