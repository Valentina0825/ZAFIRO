/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Modelos;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class UsuarioDao implements Crud<Usuario>{
    
    Conexion conectar = new Conexion();
    java.sql.Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Usuario> datosUsrs = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setUsuario_id(rs.getInt(1));
                usu.setNombre_usu(rs.getString(2));
                usu.setCorreo_usu(rs.getString(3));
                usu.setPass_usu(rs.getString(4));
                usu.setUsername_usu(rs.getString(5));
                datosUsrs.add(usu);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString(), "Error al realizar la consulta" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return datosUsrs;
    }
    
    public boolean autenticarUsuario(String username, String password) {
        
        String sql = "SELECT username_usu , password_usu FROM usuarios WHERE username_usu=? AND password_usu=?";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error al autenticar el usuario: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            return false;
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public int setAgregar(Usuario i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int setActualizar(Usuario i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int setEliminar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
