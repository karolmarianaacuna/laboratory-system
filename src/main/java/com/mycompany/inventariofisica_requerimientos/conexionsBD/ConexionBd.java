/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.conexionsBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ConexionBd {

    // para la base de datos se va implementar el patron de diseño singleton
    
    private String usuario = "root";
    private String  clave = "";
    private String    driver = "com.mysql.cj.jdbc.Driver";
    private String    url = "jdbc:mysql://localhost:3306/ inventario_fisica";

    private static ConexionBd instance;
    
     protected String cadenaSQL;
    protected ResultSet registros;
    protected Integer filas;
    protected Connection conexion;
    protected PreparedStatement consulta;
    
    // Constructor privado para evitar la creación de instancias
    private ConexionBd() {
        validacionConexion();
    }

   
    private void validacionConexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, " Error conexion base de datos", "alerta!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    

    public static ConexionBd getInstance() {
        if (instance == null) {
            instance = new ConexionBd();
        }
        return instance;
    }
    
   // Método para obtener la conexión a la base de datos
    public Connection getConnection() {
        return conexion;
    }

    
  
    }
