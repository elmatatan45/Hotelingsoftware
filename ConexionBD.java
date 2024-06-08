
package Datos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexionBD {
    
    public static String bd = "inventoryDB";
    public static String user = "root";
    public static String pass = "";
    public static String url = "jdbc:mysql://localhost:3306/"+bd;
    
    public static boolean buscarID;
    public static boolean buscarNombre;
    
    public static Connection conn;
    public static Statement sentencia;
    
    
    
    public static void conectar(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("Conexion establecida con exito."+bd);
            }
        }catch (SQLException e){
            System.out.println("Error en la conexion.");
        }catch (ClassNotFoundException e){
            System.out.println(e);
            
        }
    }
    
    public static void desconectar() throws SQLException{
        
        conn.close();
        
    }
    
}
