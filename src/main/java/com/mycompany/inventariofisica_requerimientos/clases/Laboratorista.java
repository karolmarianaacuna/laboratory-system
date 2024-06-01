/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.clases;

/**
 *
 * @author USUARIO
 */
public class Laboratorista  extends Persona{

private String tituloProfesional;

    public Laboratorista(int id, String nombre) {
        super(id, nombre);
    }



    public Laboratorista() {
    }

    public Laboratorista(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public Laboratorista(String tituloProfesional, int id, String nombre, String apellido, String correo, String contrasena, int documentoIdentidad) {
        super(id, nombre, apellido, correo, contrasena, documentoIdentidad);
        this.tituloProfesional = tituloProfesional;
    }

    public Laboratorista(String tituloProfesional, String nombre, String apellido, String correo, String contrasena, int documentoIdentidad) {
        super(nombre, apellido, correo, contrasena, documentoIdentidad);
        this.tituloProfesional = tituloProfesional;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    


    
    
}
