/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Modelos;

/**
 *
 * @author valen
 */
public class Usuario {
    
    private int usuario_id;
    private String nombre_usu;
    private String correo_usu;
    private String pass_usu;
    private int rolID_usu;
    private String username_usu;

    public Usuario(String nombre_usu, String correo_usu, String pass_usu, int rolID_usu, String username_usu) {
        this.nombre_usu = nombre_usu;
        this.correo_usu = correo_usu;
        this.pass_usu = pass_usu;
        this.rolID_usu = rolID_usu;
        this.username_usu = username_usu;
    }

    public Usuario() {
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre_usu() {
        return nombre_usu;
    }

    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public String getCorreo_usu() {
        return correo_usu;
    }

    public void setCorreo_usu(String correo_usu) {
        this.correo_usu = correo_usu;
    }

    public String getPass_usu() {
        return pass_usu;
    }

    public void setPass_usu(String pass_usu) {
        this.pass_usu = pass_usu;
    }

    public int getrolID_usu() {
        return rolID_usu;
    }

    public void setRol_usu(int rol_usu) {
        this.rolID_usu = rol_usu;
    }

    public String getUsername_usu() {
        return username_usu;
    }

    public void setUsername_usu(String username_usu) {
        this.username_usu = username_usu;
    }
    
}
