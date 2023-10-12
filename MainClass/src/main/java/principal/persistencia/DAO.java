/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.persistencia;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author andre
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "perros";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException {
        
        
        try { 
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/perros?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
                    
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
    protected void desconectarBase() throws Exception {
        
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarModificarEliminar(String sql) {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        } catch (Exception e) {
        }
    }
}
