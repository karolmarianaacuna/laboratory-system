/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventariofisica_requerimientos.formularios;

import com.mycompany.inventariofisica_requerimientos.InventarioFisica_Requerimientos;
import com.mycompany.inventariofisica_requerimientos.clases.Laboratorio;
import com.mycompany.inventariofisica_requerimientos.clases.Laboratorista;
import com.mycompany.inventariofisica_requerimientos.clases.Material;
import com.mycompany.inventariofisica_requerimientos.daos.DaosInventario;
import com.mycompany.inventariofisica_requerimientos.daos.DaosMateriales;
import com.mycompany.inventariofisica_requerimientos.daos.DaosRegistroAdmi;
import com.mycompany.inventariofisica_requerimientos.daos.DaosRegistroLaboratorista;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class FrmInventario extends javax.swing.JFrame {

    DaosInventario daosInventario = new DaosInventario();
    
   private String[] titulos ={"id_Laboratorio","nombre","tipo","descripcion"};
   private DefaultTableModel modeloTabla = new DefaultTableModel(titulos, 0);

    /**
     * Creates new form FrmInventario
     */
    public FrmInventario() {
        initComponents();
        tablaInventario.setModel(modeloTabla);
        cargarDatosPrincipal();
        cargarUsuarios();
        cargarMateriales();
        
    }
      private void cargarDatosPrincipal() {
          
          System.out.println("1111111111111111111");
        List<Laboratorio> materiales;

        modeloTabla.setNumRows(0);

        materiales = daosInventario.cosultar();
        materiales.forEach((elLugar) -> {

            Object filita[] = new Object[4];
            filita[0] = elLugar.getIdLaboratorio();
            filita[1] = elLugar.getTipo();
            filita[2] = elLugar.getNombre();
            filita[3] = elLugar.getDescripcion();

            modeloTabla.addRow(filita);

        });}
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreLaboratorio = new javax.swing.JTextField();
        txtTipoLaboratorio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcionLaboratorio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboBoxUsuarios = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxMateriales = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 31, 128, 90));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 119, 191));
        jLabel1.setText("INVENTARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 53, 144, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("Inventario ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 66, 79, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("Materiales");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 66, 67, -1));

        jPanel2.setBackground(new java.awt.Color(80, 242, 242));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("cerrar sesión ");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 53, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Nombre Laboratorio ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 139, -1, -1));
        jPanel1.add(txtNombreLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, 299, 32));
        jPanel1.add(txtTipoLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 299, 32));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de laboratorio  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 209, -1, -1));
        jPanel1.add(txtDescripcionLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 305, 299, 32));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel8.setText("Descripción laboratorio ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 279, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel9.setText("Nombre Usuarios ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 349, -1, -1));

        ComboBoxUsuarios.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        ComboBoxUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 381, 299, 32));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel11.setText("Nombre de materiales ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 419, -1, -1));

        ComboBoxMateriales.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        ComboBoxMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMaterialesActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxMateriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 451, 299, 32));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar.png"))); // NOI18N
        jLabel10.setText("jLabel9");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 504, 50, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        jLabel12.setText("jLabel9");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 504, 50, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar.png"))); // NOI18N
        jLabel13.setText("jLabel9");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 504, 50, -1));

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaInventario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        FrmInicio frmInicio = new FrmInicio();
        frmInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ComboBoxUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxUsuariosActionPerformed

    private void ComboBoxMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMaterialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxMaterialesActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        FrmMateriales FrmMateriales = new FrmMateriales();
        FrmMateriales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        FrmInventario frmInventario = new FrmInventario();
        frmInventario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // boton para guardar los archivos de inventario 

        // realizaremos el casteo de los datos que vienen de los combos 
        Laboratorista laboratorista = (Laboratorista) ComboBoxUsuarios.getSelectedItem();
        Material material = (Material) ComboBoxMateriales.getSelectedItem();
        
        Laboratorio laboratorio = new Laboratorio(txtNombreLaboratorio.getText(), txtTipoLaboratorio.getText(), txtDescripcionLaboratorio.getText(), laboratorista, material);// llenamos el constructor para obtener los datos que vienen de las cajas

        if (daosInventario.agregar(laboratorio)) {
            JOptionPane.showMessageDialog(null, "Guardado!", "Exito", JOptionPane.INFORMATION_MESSAGE); // mensaje de que no hubo ninguna falla durante la insercion de datos a la base de datos 
            vaciarCajas();// metodo para vaciar las cajas 
            cargarDatosPrincipal();
            
        } else {
             JOptionPane.showMessageDialog(null, "Oops!", "Error", JOptionPane.INFORMATION_MESSAGE); // mensaje de que  hubo falla durante la insercion de datos a la base de datos 
        }
        

    }//GEN-LAST:event_jLabel12MouseClicked

    private void tablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioMouseClicked
           int filaSeleccionada = tablaInventario.getSelectedRow();
        String llavePrimaria = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        System.out.println("11111111111111111");

        int id = Integer.parseInt(llavePrimaria);
        Laboratorio objeto = daosInventario.buscar(id);
        
 

        txtNombreLaboratorio.setText(objeto.getNombre());
        txtTipoLaboratorio.setText(objeto.getTipo());
        txtDescripcionLaboratorio.setText(objeto.getDescripcion());
    
    }//GEN-LAST:event_tablaInventarioMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // Obtener el modelo de la tabla
        DefaultTableModel tableModel = (DefaultTableModel) tablaInventario.getModel();

// Obtener el índice de la fila seleccionada
        int rowIndex = tablaInventario.getSelectedRow();

        if (rowIndex != -1) {
            // Obtener el ID del objeto InventarioConsumible correspondiente a la fila seleccionada
            int idSeleccionado = (int) tableModel.getValueAt(rowIndex, 0); // Suponiendo que el ID está en la primera columna

            // Eliminar la fila del modelo
            tableModel.removeRow(rowIndex);

            // Llamar al método eliminar del DAO pasando el ID seleccionado
            if (daosInventario.eliminar(idSeleccionado)) {
                JOptionPane.showMessageDialog(jPanel1, "¡Elemento eliminado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarDatosPrincipal();
            } else {
                JOptionPane.showMessageDialog(jPanel1, "Hubo un error al eliminar el elemento.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Por favor, selecciona una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
          int posicionSelecionada = tablaInventario.getSelectedRow();
        Laboratorio Laboratorio = new Laboratorio();

        if (posicionSelecionada != -1) {

            int idSeleccionado = (int) tablaInventario.getValueAt(posicionSelecionada, 0); // Suponiendo que el ID está en la primera columna
            String nombre = txtNombreLaboratorio.getText();
            String tipo = txtTipoLaboratorio.getText();
            String descripcion = txtDescripcionLaboratorio.getText();
               Laboratorista laboratorista = (Laboratorista) ComboBoxUsuarios.getSelectedItem();
        Material material = (Material) ComboBoxMateriales.getSelectedItem();

            Laboratorio.setIdLaboratorio(idSeleccionado);
            Laboratorio.setNombre(nombre);
            Laboratorio.setTipo(tipo);
            Laboratorio.setDescripcion(descripcion);
            Laboratorio.setMaterial(material);
            Laboratorio.setPersona(laboratorista);

            if (daosInventario.actualizar(Laboratorio)) {
                JOptionPane.showMessageDialog(jPanel1, "¡Actualizado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarDatosPrincipal();

            } else {

                JOptionPane.showMessageDialog(jPanel1, "¡intenta nuevamente!", "Error", JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }//GEN-LAST:event_jLabel13MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Material> ComboBoxMateriales;
    private javax.swing.JComboBox<Laboratorista> ComboBoxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtDescripcionLaboratorio;
    private javax.swing.JTextField txtNombreLaboratorio;
    private javax.swing.JTextField txtTipoLaboratorio;
    // End of variables declaration//GEN-END:variables

    private void cargarUsuarios() {
        
        DaosRegistroLaboratorista daosRegistroLaboratorista = new DaosRegistroLaboratorista();
        List<Laboratorista> listaUsuarios = daosRegistroLaboratorista.cosultar();
        for (Laboratorista usuario : listaUsuarios) {
            ComboBoxUsuarios.addItem(usuario);
        }
        
    }
    
    private void cargarMateriales() {
        
        DaosMateriales daosMateriales = new DaosMateriales();
        List<Material> listaMateriales = daosMateriales.cosultar();
        for (Material material : listaMateriales) {
            
            ComboBoxMateriales.addItem(material);
            
        }
    }
    
    private void vaciarCajas() {
        
        txtNombreLaboratorio .setText("");
        txtDescripcionLaboratorio .setText("");
        txtTipoLaboratorio .setText("");
    }

   
}
