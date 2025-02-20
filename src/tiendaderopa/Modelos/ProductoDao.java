/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author valen
 */
public class ProductoDao implements Crud<Producto> {
    
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Producto> listar() {
        List<Producto> datosProds = new ArrayList<>();
        String sql = 
                "SELECT p.* , t.nombre_tall , c.nombre_cat "
              + "FROM productos p JOIN tallas t ON p.id_talla = t.talla_id "
              + "JOIN categorias c ON p.id_categoria = c.categoria_id; ";
        
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Producto prod = new Producto();
                
                prod.setProducto_id(rs.getInt(1));
                prod.setNombre_prod(rs.getString(2));
                prod.setDescipcion_prod(rs.getString(3));
                prod.setCantidad_prod(rs.getInt(4));
                prod.setPrecio_prod(rs.getInt(5));
                prod.setId_talla(rs.getInt(6));
                prod.setImg_prod(rs.getString(7));
                prod.setCategoria_prod(rs.getInt(8));
                
               datosProds.add(prod);
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Ha ocurrido un error en la busqueda" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + E.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return datosProds;
    
    }

    @Override
    public int setAgregar(Producto i) {
        return 0;
    }

    @Override
    public int setActualizar(Producto i) {
        return 0;
    }

    @Override
    public int setEliminar(int i) {
        return 0;
    }
    
}
