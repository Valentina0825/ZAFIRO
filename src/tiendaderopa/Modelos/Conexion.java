/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/zafiro";
    String pass="";
    String user="root";
    
    public Connection getConection(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "problemas de conexion " + e.toString());
        }
        return con;
    }
}
