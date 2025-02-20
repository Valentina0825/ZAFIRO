/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Modelos;

/**
 *
 * @author valen
 */
public class Producto {
    
    private int producto_id;
    private String nombre_prod;
    private String descipcion_prod;
    private int cantidad_prod;
    private int precio_prod;
    private int id_talla;
    private String img_prod;
    private int categoria_prod;

    public Producto(int producto_id, String nombre_prod, String descipcion_prod, int cantidad_prod,int precio_prod, int id_talla, String img_prod, int categoria_prod) {
        this.producto_id = producto_id;
        this.nombre_prod = nombre_prod;
        this.descipcion_prod = descipcion_prod;
        this.cantidad_prod = cantidad_prod;
        this.precio_prod = precio_prod;
        this.id_talla = id_talla;
        this.img_prod = img_prod;
        this.categoria_prod = categoria_prod;
    }
    
    public Producto(){}

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public String getDescipcion_prod() {
        return descipcion_prod;
    }

    public void setDescipcion_prod(String descipcion_prod) {
        this.descipcion_prod = descipcion_prod;
    }

    public int getCantidad_prod() {
        return cantidad_prod;
    }

    public void setCantidad_prod(int cantidad_prod) {
        this.cantidad_prod = cantidad_prod;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }
    
    

    public int getId_talla() {
        return id_talla;
    }

    public void setId_talla(int id_talla) {
        this.id_talla = id_talla;
    }

    public String getImg_prod() {
        return img_prod;
    }

    public void setImg_prod(String img_prod) {
        this.img_prod = img_prod;
    }

    public int getCategoria_prod() {
        return categoria_prod;
    }

    public void setCategoria_prod(int categoria_prod) {
        this.categoria_prod = categoria_prod;
    }
    
}
