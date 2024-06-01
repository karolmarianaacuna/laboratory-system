/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.Interfaces;

import com.mycompany.inventariofisica_requerimientos.clases.Material;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface CRUDS<T> {
    public Boolean agregar(T objeto);
    public Boolean eliminar(Integer llavePrimaria);
    public Boolean actualizar(T elObjeto);
    public List<T> cosultar();
    public T buscar(Integer llavePrimaria);
     public T findOne(int id); 

}
