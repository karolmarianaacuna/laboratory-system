/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.daos;

import com.mycompany.inventariofisica_requerimientos.Interfaces.CRUDS;
import com.mycompany.inventariofisica_requerimientos.clases.Laboratorio;
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
public class DaosInventario implements CRUDS<Laboratorio> {

    // hay que llamar a ala instancia de la conexion 
    ConexionBd conexionBd = ConexionBd.getInstance();
    Connection connection = conexionBd.getConnection();

    @Override
    public Boolean agregar(Laboratorio objeto) {

        try {

            String url = "INSERT INTO laboratorios (id_Laboratorio,nombre,tipo,descripcion,id_Laboratorista,id_Material) VALUES (?,?,?,?,?,?)";

            PreparedStatement consulta = connection.prepareStatement(url);
            consulta.setInt(1, objeto.getIdLaboratorio());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getTipo());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPersona().getId());
            consulta.setInt(6, objeto.getMaterial().getIdMaterial());

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
            String sql = "DELETE FROM laboratorios WHERE id_Laboratorio = ?";
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
    public Boolean actualizar(Laboratorio elObjeto) {
        
          try {
            String sql = "UPDATE laboratorios SET tipo = ?, nombre = ? , descripcion=?, id_Laboratorista=?, id_Material=?  WHERE id_Laboratorio = ?";
            
            PreparedStatement consulta = connection.prepareStatement(sql);
            
            consulta.setString(2, elObjeto.getNombre());
            consulta.setString(1, elObjeto.getTipo());
            consulta.setString(3, elObjeto.getDescripcion());
            consulta.setInt(4, elObjeto.getPersona().getId());
            consulta.setInt(5, elObjeto.getMaterial().getIdMaterial());
            consulta.setInt(6, elObjeto.getIdLaboratorio());
            
            

            int filasAfectadas = consulta.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Laboratorio> cosultar() {

        List<Laboratorio> elemnetosLaboratorio = new ArrayList<>();
        try {

            String url = "SELECT * FROM laboratorios";
            PreparedStatement consulta = connection.prepareStatement(url);

            // ejecutar la consulta y obtener resultados
            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {

                int id_Laboratorio = resultados.getInt("id_Laboratorio");
                String nombre = resultados.getString("nombre");
                String tipo = resultados.getString("tipo");
                String descripcion = resultados.getString("descripcion");
                int id_Laboratorista = resultados.getInt("id_Laboratorista");
                int id_Material = resultados.getInt("id_Material");

                DaosRegistroLaboratorista daosRegistroLaboratorista = new DaosRegistroLaboratorista();
                Laboratorista laboratorista = daosRegistroLaboratorista.findOne(id_Laboratorista);

                DaosMateriales DaosMateriales = new DaosMateriales();
                Material material = DaosMateriales.findOne(id_Material);

                Laboratorio laboratorio = new Laboratorio(id_Laboratorio, nombre, tipo, descripcion, laboratorista, material);
                elemnetosLaboratorio.add(laboratorio);

            }

        } catch (Exception e) {
        }
        return elemnetosLaboratorio;
    }

    @Override
    public Laboratorio buscar(Integer llavePrimaria) {
        Laboratorio Laboratorio = new Laboratorio();
        try {

            String sql = "SELECT * FROM laboratorios where id_Laboratorio = ? ";
            PreparedStatement consulta = connection.prepareStatement(sql);
            consulta.setInt(1, llavePrimaria);

            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {
                int id_Laboratorio = resultados.getInt("id_Laboratorio");
                String nombre = resultados.getString("nombre");
                String tipo = resultados.getString("tipo");
                String descripcion = resultados.getString("descripcion");
                int id_Laboratorista = resultados.getInt("id_Laboratorista");
                int id_Material = resultados.getInt("id_Material");

                DaosMateriales DaosMateriales = new DaosMateriales();
                Material material = DaosMateriales.findOne(id_Material);

                DaosRegistroLaboratorista daosRegistroLaboratorista = new DaosRegistroLaboratorista();
                Laboratorista laboratorista = daosRegistroLaboratorista.findOne(id_Laboratorista);

                Laboratorio.setIdLaboratorio(id_Laboratorio);
                Laboratorio.setTipo(tipo);
                Laboratorio.setNombre(nombre);
                Laboratorio.setDescripcion(descripcion);
                Laboratorio.setPersona(laboratorista);
                Laboratorio.setMaterial(material);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return Laboratorio;
    }

    @Override
    public Laboratorio findOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
