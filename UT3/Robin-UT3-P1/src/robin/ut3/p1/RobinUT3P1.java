package robin.ut3.p1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Robin
 */
public class RobinUT3P1 {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "pl4sencia");
            
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM departamentos";
            ResultSet resultado = sentencia.executeQuery(sql);
            
            while(resultado.next()){
                System.out.println(resultado.getInt(1)
                + " " + resultado.getString(2)
                + " " + resultado.getString(3));
            }
            
            conexion.close();
            sentencia.close();
            resultado.close();
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
