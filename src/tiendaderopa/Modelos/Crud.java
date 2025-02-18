/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tiendaderopa.Modelos;

import java.util.List;

/**
 *
 * @author Daniel
 */
public interface Crud<I> {
     public List<I> listar();
    public int setAgregar(I i);
    public int setActualizar(I i);
    public int setEliminar(int i);
}
