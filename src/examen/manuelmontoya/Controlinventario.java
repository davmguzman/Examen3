/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen.manuelmontoya;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monto
 */
public class Controlinventario extends javax.swing.JFrame {
    
private ArrayList<String> tipos = new ArrayList<>(Arrays.asList("Desechables", "Mercancías", "Abarrotes", "Textil"));
    
    
    
    Datos Datos = new Datos();
    DefaultTableModel tabla = new DefaultTableModel();
    /**
     * Creates new form Controlinventario
     */
    public Controlinventario() {
        initComponents();
        String[] titulos = {"CODIGOS", "DESCRIPCION", "CANTIDAD", "TIPO", "ACTIVO", "PRECIO"};
        DefaultTableModel modelo = (DefaultTableModel) tabladatos.getModel();
        modelo.setColumnIdentifiers(titulos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vdescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vcantidad = new javax.swing.JTextField();
        vtipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        vactivosi = new javax.swing.JRadioButton();
        vactivono = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vprecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        bcodigo = new javax.swing.JButton();
        bborrar = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();
        breporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("    Control De Inventarios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 50, 264, 40);

        jPanel1.setLayout(null);

        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 50, 16);

        vcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(vcodigo);
        vcodigo.setBounds(90, 20, 90, 22);

        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 20, 70, 20);

        vdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vdescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(vdescripcion);
        vdescripcion.setBounds(330, 20, 200, 22);

        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 70, 50, 20);

        vcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcantidadActionPerformed(evt);
            }
        });
        jPanel1.add(vcantidad);
        vcantidad.setBounds(90, 70, 90, 22);

        vtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtipoActionPerformed(evt);
            }
        });
        jPanel1.add(vtipo);
        vtipo.setBounds(220, 90, 72, 22);

        jLabel5.setText("TIPO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 56, 70, 20);

        vactivosi.setText("SI");
        vactivosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vactivosiActionPerformed(evt);
            }
        });
        jPanel1.add(vactivosi);
        vactivosi.setBounds(320, 90, 40, 21);

        vactivono.setText("NO");
        vactivono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vactivonoActionPerformed(evt);
            }
        });
        jPanel1.add(vactivono);
        vactivono.setBounds(370, 90, 50, 21);

        jLabel6.setText("ACTIVO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 60, 60, 20);

        jLabel7.setText("Precio");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(460, 60, 60, 20);

        vprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vprecioActionPerformed(evt);
            }
        });
        jPanel1.add(vprecio);
        vprecio.setBounds(440, 90, 100, 22);

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 130, 530, 200);

        bcodigo.setText("AGREGAR");
        bcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(bcodigo);
        bcodigo.setBounds(30, 360, 120, 30);

        bborrar.setText("BORRAR");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });
        jPanel1.add(bborrar);
        bborrar.setBounds(190, 360, 110, 30);

        bmodificar.setText("MODIFICAR");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(bmodificar);
        bmodificar.setBounds(330, 360, 100, 30);

        breporte.setText("REPORTE");
        breporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breporteActionPerformed(evt);
            }
        });
        jPanel1.add(breporte);
        breporte.setBounds(470, 360, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 130, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void vcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcodigoActionPerformed
        Integer codigo = Integer.parseInt(vcodigo.getText());
    }//GEN-LAST:event_vcodigoActionPerformed

    private void vprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vprecioActionPerformed
       Integer precio = Integer.parseInt(vprecio.getText());
    }//GEN-LAST:event_vprecioActionPerformed

    private void vdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vdescripcionActionPerformed
       String descripcion = vdescripcion.getText();
    }//GEN-LAST:event_vdescripcionActionPerformed

    private void vcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcantidadActionPerformed
       Integer cantidad = Integer.parseInt(vcantidad.getText());
    }//GEN-LAST:event_vcantidadActionPerformed

    private void vtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtipoActionPerformed
      DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) vtipo.getModel();

// Agregar cada elemento de la lista de tipos al modelo
for (String tipo : tipos) {
    modeloCombo.addElement(tipo);
}

// Setear el modelo actualizado al JComboBox
vtipo.setModel(modeloCombo);
        
        String tipoSeleccionado = vtipo.getSelectedItem().toString();
    System.out.println("El tipo seleccionado es: " + tipoSeleccionado);
    }//GEN-LAST:event_vtipoActionPerformed

    private void vactivosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vactivosiActionPerformed
    int activosiSeleccionado = vactivosi.isSelected() ? 1 : 0;
    int activonoSeleccionado = vactivono.isSelected() ? 1 : 0;
    Datos.setActivos(activosiSeleccionado, activonoSeleccionado);
    }//GEN-LAST:event_vactivosiActionPerformed

    private void vactivonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vactivonoActionPerformed
     int activosiSeleccionado = vactivosi.isSelected() ? 1 : 0;
    int activonoSeleccionado = vactivono.isSelected() ? 1 : 0;
    Datos.setActivos(activosiSeleccionado, activonoSeleccionado);
    }//GEN-LAST:event_vactivonoActionPerformed

    private void bcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcodigoActionPerformed
     // Obtener los valores de los campos de texto
    int codigo = Integer.parseInt(vcodigo.getText());
    String descripcion = vdescripcion.getText();
    int cantidad = Integer.parseInt(vcantidad.getText());
    String tipo = vtipo.getSelectedItem().toString();
    String activo = (vactivosi.isSelected()) ? "SI" : "NO";
    int precio = Integer.parseInt(vprecio.getText());
    
    // Agregar los valores a la tabla
    DefaultTableModel modelo = (DefaultTableModel) tabladatos.getModel();
    Object[] fila = {codigo, descripcion, cantidad, tipo, activo, precio};
    modelo.addRow(fila);
    
    // Limpiar los campos de texto después de agregar los valores a la tabla
    vcodigo.setText("");
    vdescripcion.setText("");
    vcantidad.setText("");
    vtipo.setSelectedIndex(0);
    vactivosi.setSelected(true);
    vprecio.setText("");
    }//GEN-LAST:event_bcodigoActionPerformed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed
     // obtener la fila seleccionada
    int filaSeleccionada = tabladatos.getSelectedRow();
    
    if (filaSeleccionada >= 0) { // si hay una fila seleccionada
        // remover la fila del modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabladatos.getModel();
        modelo.removeRow(filaSeleccionada);
    }
    }//GEN-LAST:event_bborrarActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
     // Obtener el índice de la fila seleccionada
    int filaSeleccionada = tabladatos.getSelectedRow();

    // Verificar si se seleccionó una fila
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener los valores de los campos de texto
    int codigo = Integer.parseInt(vcodigo.getText());
    String descripcion = vdescripcion.getText();
    int cantidad = Integer.parseInt(vcantidad.getText());
    String tipo = (String) vtipo.getSelectedItem();
    boolean activo = vactivosi.isSelected();
    int precio = Integer.parseInt(vprecio.getText());

    // Actualizar los valores en la fila seleccionada de la tabla
    tabladatos.setValueAt(codigo, filaSeleccionada, 0);
    tabladatos.setValueAt(descripcion, filaSeleccionada, 1);
    tabladatos.setValueAt(cantidad, filaSeleccionada, 2);
    tabladatos.setValueAt(tipo, filaSeleccionada, 3);
    tabladatos.setValueAt(activo, filaSeleccionada, 4);
    tabladatos.setValueAt(precio, filaSeleccionada, 5);
    }//GEN-LAST:event_bmodificarActionPerformed

    private void breporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breporteActionPerformed
     Reportes ventanaReportes = new Reportes(tabladatos.getModel());                                           
    Reportes reportes = new Reportes();
    reportes.setVisible(true);
    reportes.setSize(1000, 500);

    }//GEN-LAST:event_breporteActionPerformed

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
            java.util.logging.Logger.getLogger(Controlinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controlinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controlinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controlinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controlinventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bcodigo;
    private javax.swing.JButton bmodificar;
    private javax.swing.JButton breporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    private javax.swing.JRadioButton vactivono;
    private javax.swing.JRadioButton vactivosi;
    private javax.swing.JTextField vcantidad;
    private javax.swing.JTextField vcodigo;
    private javax.swing.JTextField vdescripcion;
    private javax.swing.JTextField vprecio;
    private javax.swing.JComboBox<String> vtipo;
    // End of variables declaration//GEN-END:variables
}
