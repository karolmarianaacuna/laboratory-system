/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.daos;

import com.mycompany.inventariofisica_requerimientos.Interfaces.CRUDS;
import com.mycompany.inventariofisica_requerimientos.clases.Laboratorista;
import com.mycompany.inventariofisica_requerimientos.clases.Material;
import com.mycompany.inventariofisica_requerimientos.conexionsBD.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class DaosRegistroLaboratorista implements CRUDS<Laboratorista> {

    // hay que llamar a ala instancia de la conexion 
    ConexionBd conexionBd = ConexionBd.getInstance();
    Connection connection = conexionBd.getConnection();

    @Override
    public Boolean agregar(Laboratorista objeto) {
        try {

            String url = "INSERT INTO laboratoristas (nombre,correo,contrasena,documento_Identidad,titulo_Profesional) VALUES (?,?,?,?,?)";

            PreparedStatement consulta = connection.prepareStatement(url);
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getCorreo());
            consulta.setString(3, objeto.getContrasena());
            consulta.setInt(4, objeto.getDocumentoIdentidad());
            consulta.setString(5, objeto.getTituloProfesional());

            // Ejecutar la consulta 
            int filasAfectadas = consulta.executeUpdate();

            //comprobar si la insercion fue exitosa 
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean eliminar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Laboratorista elObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Laboratorista> cosultar() {

        List<Laboratorista> laboratoristas = new ArrayList<>();

        try {
            String url = "SELECT * FROM laboratoristas ";

            PreparedStatement consulta = connection.prepareStatement(url);

            // ejecutar la consulta y obtener resultados
            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {

                int id_Laboratorista = resultados.getInt("id_Laboratorista");
                String nombre = resultados.getString("nombre");
                String correo = resultados.getString("correo");
                String contrasena = resultados.getString("contrasena");
                int documento_Identidad = resultados.getInt("documento_Identidad");
                String titulo_Profesional = resultados.getString("titulo_Profesional");
                

                Laboratorista laboratorista = new Laboratorista(titulo_Profesional, id_Laboratorista, nombre, correo, correo, contrasena, documento_Identidad);
                laboratoristas.add(laboratorista);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return laboratoristas;
    }

    @Override
    public Laboratorista buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Laboratorista findOne(int id) {
        
         Laboratorista LaboratoristaNueva = new Laboratorista();
        try {
            String sql = "SELECT * FROM laboratoristas where id_Laboratorista = ? ";
            PreparedStatement consulta = connection.prepareStatement(sql);
            consulta.setInt(1, id);

            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {
               int id_Laboratorista = resultados.getInt("id_Laboratorista");
                String nombre = resultados.getString("nombre");
                String correo = resultados.getString("correo");
                String contrasena = resultados.getString("contrasena");
                int documento_Identidad = resultados.getInt("documento_Identidad");
                String titulo_Profesional = resultados.getString("titulo_Profesional");
                
                

                LaboratoristaNueva.setNombre(nombre);
                LaboratoristaNueva.setId(id_Laboratorista);
                LaboratoristaNueva.setCorreo(correo);
                LaboratoristaNueva.setContrasena(contrasena);
                LaboratoristaNueva.setDocumentoIdentidad(documento_Identidad);
                LaboratoristaNueva.setTituloProfesional(titulo_Profesional);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return LaboratoristaNueva;
    }

    public boolean verificacionCredencialesAdministradores(int documento_Identidad, String contrasena) {

        try {

            String url = "SELECT * FROM  laboratoristas WHERE documento_Identidad = ? AND contrasena = ? ";
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
