/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.clases;

/**
 *
 * @author USUARIO
 */
public class Laboratorio {
    
    private int idLaboratorio;
     private String nombre;
     private String tipo;
     private String descripcion;
     private Persona persona;
     private Material material;

    public Laboratorio() {
    }

    public Laboratorio(String nombre, String tipo, String descripcion, Persona persona, Material material) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.persona = persona;
        this.material = material;
    }
    

    public Laboratorio(int idLaboratorio, String nombre, String tipo, String descripcion, Persona persona, Material material) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.persona = persona;
        this.material = material;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "idLaboratorio=" + idLaboratorio + ", nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion + ", persona=" + persona + ", material=" + material + '}';
    }
     
     
     
    
    
}
