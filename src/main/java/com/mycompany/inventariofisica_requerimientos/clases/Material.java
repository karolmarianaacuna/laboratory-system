/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.clases;

/**
 *
 * @author USUARIO
 */
public class Material {
    private int idMaterial;
    private String tipo;
    private String nombre;
    private String descripcion;

    public Material() {
    }
    
    

    public Material(int idMaterial, String tipo, String nombre, String descripcion) {
        this.idMaterial = idMaterial;
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Material(String tipo, String nombre, String descripcion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
    
    
    
}
