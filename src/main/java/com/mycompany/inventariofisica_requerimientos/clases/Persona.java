/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.clases;

/**
 *
 * @author USUARIO
 */
public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private int documentoIdentidad;

    public Persona() {
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public Persona(int id, String nombre, String apellido, String correo, String contrasena, int documentoIdentidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.documentoIdentidad = documentoIdentidad;
    }

    public Persona(String nombre, String apellido, String correo, String contrasena, int documentoIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.documentoIdentidad = documentoIdentidad;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
}
