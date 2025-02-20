/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private Connection con;
    private final String url = "jdbc:mysql://localhost:3306/zafiro";
    private final String user = "root";
    private final String pass = "";

    public Connection getConexion() {
        try {
            // Carga el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("La Conexion ha sido Exitosa");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el driver de MySQL");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

//    public static void main(String[] args) {
//        Conexion conexion = new Conexion();
//        conexion.getConexion();
//    }
}