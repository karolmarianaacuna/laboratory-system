/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.daos;

import com.mycompany.inventariofisica_requerimientos.Interfaces.CRUDS;
import com.mycompany.inventariofisica_requerimientos.clases.Administrativo;
import com.mycompany.inventariofisica_requerimientos.conexionsBD.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class DaosRegistroAdmi implements CRUDS<Administrativo> {

    // hay que llamar a ala instancia de la conexion 
    ConexionBd conexionBd = ConexionBd.getInstance();
    Connection connection = conexionBd.getConnection();

    @Override
    public Boolean eliminar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Administrativo elObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Administrativo> cosultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administrativo buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administrativo findOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean agregar(Administrativo objeto) {

        try {

            String url = "INSERT INTO administrativo (nombre,correo,contrasena,documento_Identidad,cargo) VALUES (?,?,?,?,?)";

            PreparedStatement consulta = connection.prepareStatement(url);
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getCorreo());
            consulta.setString(3, objeto.getContrasena());
            consulta.setInt(4, objeto.getDocumentoIdentidad());
            consulta.setString(5, objeto.getCargo());

            // Ejecutar la consulta 
            int filasAfectadas = consulta.executeUpdate();

            //comprobar si la insercion fue exitosa 
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean verificacionCredencialesAdministradores( int documento_Identidad, String contrasena){
        
        try {
            
           String url = "SELECT * FROM  administrativo WHERE documento_Identidad = ? AND contrasena = ? ";
           PreparedStatement consulta = connection.prepareStatement(url);
            consulta.setInt(1, documento_Identidad);
            consulta.setString(2, contrasena);
            
            
              // Ejecutar la consulta y obtener el conjunto de resultados
            ResultSet resultado = consulta.executeQuery();

            Boolean credencialesValidas = resultado.next();

            return credencialesValidas;
                    
            
        } catch (SQLException e) {
              e.printStackTrace();
            return false;
        }
    }

}
