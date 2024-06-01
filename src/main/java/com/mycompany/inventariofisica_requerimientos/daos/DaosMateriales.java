/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.daos;

import com.mycompany.inventariofisica_requerimientos.Interfaces.CRUDS;
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
public class DaosMateriales implements CRUDS<Material>{

    //se trae la conexion de donde se implemento el singleton
    
     ConexionBd conexionBd = ConexionBd.getInstance();
     Connection connection = conexionBd.getConnection();

    @Override
    public Boolean agregar(Material objeto) {
         
         try {

            String url = "INSERT INTO materiales (tipo,nombre,descripcion) VALUES (?,?,?)";
            
            PreparedStatement consulta = connection.prepareStatement(url);
            consulta.setString(1, objeto.getTipo());
              consulta.setString(2, objeto.getNombre());
                consulta.setString(3, objeto.getDescripcion());
            
               
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
         try {
            // preprar la consulta SQL para eliminar un usuario por su id
            String sql = "DELETE FROM materiales WHERE id_Material = ?";
            PreparedStatement consulta = connection.prepareStatement(sql);
            consulta.setInt(1, llavePrimaria);

            //ejecutar la consulta
            int filasAfectadas = consulta.executeUpdate();

            //comprobar si la eliminacion fue exitosa
            return filasAfectadas > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean actualizar(Material elObjeto) {
        
        try {
            String sql = "UPDATE materiales SET tipo = ?, nombre = ? , descripcion=? WHERE id_Material = ?";
            
            PreparedStatement consulta = connection.prepareStatement(sql);
            
            consulta.setString(2, elObjeto.getNombre());
            consulta.setString(1, elObjeto.getTipo());
            consulta.setString(3, elObjeto.getDescripcion());
            consulta.setInt(4, elObjeto.getIdMaterial());
            
            

            int filasAfectadas = consulta.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
       
    }
    @Override
    public List<Material> cosultar() {
        
          List<Material> materiales = new ArrayList<>();

        try {
          
            String url = "SELECT * FROM materiales";
            PreparedStatement consulta = connection.prepareStatement(url);

            // ejecutar la consulta y obtener resultados
            ResultSet resultados = consulta.executeQuery();
            

            while (resultados.next()) {

                int id_Material = resultados.getInt("id_Material");
                String nombre = resultados.getString("tipo");
                String codigo = resultados.getString("nombre");
                String marca = resultados.getString("descripcion");
               

               Material material = new Material(id_Material, codigo, nombre, marca);
               materiales.add(material);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return materiales;
    }

    @Override
    public Material buscar(Integer llavePrimaria) {
        Material material = new Material();
        try {
            
            String sql = "SELECT * FROM materiales where id_Material = ? ";
            PreparedStatement consulta = connection.prepareStatement(sql);
            consulta.setInt(1, llavePrimaria);

            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {
                int id_Material = resultados.getInt("id_Material");
                String tipo = resultados.getString("tipo");
                String nombre = resultados.getString("nombre");
                 String descripcion = resultados.getString("descripcion");
                

               

                material.setIdMaterial(id_Material);
                material.setTipo(tipo);
                material.setNombre(nombre);
                material.setDescripcion(descripcion);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return material;

    }
    @Override
    public Material findOne(int id) {
      return null;
    }
    
}
