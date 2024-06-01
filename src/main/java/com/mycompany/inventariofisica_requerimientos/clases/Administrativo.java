/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.clases;

/**
 *
 * @author USUARIO
 */
public class Administrativo extends Persona{
   private String cargo;

    public Administrativo(String cargo) {
        this.cargo = cargo;
    }

    public Administrativo(String cargo, int id, String nombre, String apellido, String correo, String contrasena, int documentoIdentidad) {
        super(id, nombre, apellido, correo, contrasena, documentoIdentidad);
        this.cargo = cargo;
    }

    public Administrativo(String cargo, String nombre, String apellido, String correo, String contrasena, int documentoIdentidad) {
        super(nombre, apellido, correo, contrasena, documentoIdentidad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "cargo=" + cargo + '}';
    }
   
   
    
}
