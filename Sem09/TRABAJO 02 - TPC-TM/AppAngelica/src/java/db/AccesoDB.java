
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nemias
 */
public class AccesoDB {
    
    private AccesoDB(){
        
    }
    public static Connection getConnection() throws SQLException{

    String driver = "com.mysql.jdbc.Driver";
    String urlDB = "jdbc:mysql://localhost:3306/fastfood";
    String user = "fastfood";
    String pass = "admin";

    Connection cn = null;

    try {

      Class.forName(driver).newInstance();

      cn = DriverManager.getConnection(urlDB, user, pass);
    } catch (ClassNotFoundException e) {
      throw new SQLException("No se ha encontrado el driver de BD.");
    } catch(SQLException e){
      throw e;
    } catch(Exception e){
      throw new SQLException("No se tiene acceso al servidor de BD.");
    }
    return cn;
  }
    
}
