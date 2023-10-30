package provemax74.Vistas;

import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import provemax74.AccesoADatos.ProveedorData;
import provemax74.AccesoADatos.ProveedorData;
import provemax74.Entidades.Proveedor;

public class GestionDeProveedores extends javax.swing.JInternalFrame {

    ProveedorData pd = new ProveedorData();
    Proveedor prove = new Proveedor();
    DefaultTableModel tabla2 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

    };

    public GestionDeProveedores() {
        initComponents();
        armarCabecera();
        noEditable1();
        refrescarTablaDeProveedores();
        jPanel1.setBackground(new Color(131, 193, 227));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTRazon = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaprove = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1212, 738));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 778));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de Proveedores");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Razon Social:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Domicilio:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Teléfono:");

        jTRazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRazonActionPerformed(evt);
            }
        });

        jTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoActionPerformed(evt);
            }
        });

        jBAgregar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.setPreferredSize(new java.awt.Dimension(150, 70));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setPreferredSize(new java.awt.Dimension(150, 70));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setPreferredSize(new java.awt.Dimension(150, 70));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setPreferredSize(new java.awt.Dimension(150, 70));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTablaprove.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaprove.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTablaproveAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTablaprove);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(jTRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        
                
        int filasS = jTablaprove.getSelectedRow();
        if (filasS != -1) {
        String razonSocial = (String) tabla2.getValueAt(filasS, 0);
        
        // Eliminar el producto de la base de datos
        pd.eliminarProveedorPorRazonSocial(razonSocial);
        
        
        // Eliminar la fila de la tabla local
        tabla2.removeRow(filasS);

        }else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila");
        }
        limpiarCampos1();
        noEditable1();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        editable1();
        limpiarCampos1();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTRazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRazonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRazonActionPerformed

    private void jTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        try {
            if (jTRazon.getText().isEmpty() || jTDomicilio.getText().isEmpty() || jTTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Falta llenar un campo");
                return;
            }

            String razonSocial = jTRazon.getText();
            String domicilio = jTDomicilio.getText();
            String telefono = jTTelefono.getText();

            if (!telefono.matches("\\d+")) { // Comprueba si contiene solo números
                JOptionPane.showMessageDialog(this, "Error, datos de teléfono inválidos. Ingrese solo números");
                return;
            }
            // Validación para comprobar si el teléfono contiene solo números y tiene al menos 8 dígitos
            if (!telefono.matches("\\d{10,}")) {
                JOptionPane.showMessageDialog(this, "Número de teléfono inválido. Debe contener al menos 10 dígitos");
                return;
            }
//            double precio = (Double.parseDouble(jTPrecio.getText())); parcear un objeto

            prove.setRazonSocial(razonSocial);
            prove.setDomicilio(domicilio);
            prove.setTelefono(telefono);

            pd.guardarProveedor(prove);

            tabla2.addRow(new Object[]{razonSocial, domicilio, telefono});

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos, intente nuevamente");

    }//GEN-LAST:event_jBAgregarActionPerformed
        limpiarCampos1();
        noEditable1();
    }

    
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
       try {
            if (jTRazon.getText().isEmpty() || jTDomicilio.getText().isEmpty() || jTTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Falta llenar un campo");
                return;
            }
        // Recupera los datos modificados de los campos
            String razonSocial = jTRazon.getText();
            String domicilio = jTDomicilio.getText();
            String telefono = jTTelefono.getText();
        
        // Actualiza el producto en la base de datos
            prove.setRazonSocial(razonSocial);
            prove.setDomicilio(domicilio);
            prove.setTelefono(telefono);
           
            tabla2.addRow(new Object[]{razonSocial, domicilio, telefono});

            int filasS = jTablaprove.getSelectedRow();
        if (filasS != -1) {
        String razonSociall = (String) tabla2.getValueAt(filasS, 0);
        
        // Eliminar el producto de la base de datos
        pd.RazonSocialModificado(razonSociall);
        
        // Eliminar la fila de la tabla local
        tabla2.removeRow(filasS);
        }

        pd.guardarProveedor(prove);
        // Limpia los campos y deshabilita la edición
        limpiarCampos1();
        noEditable1();
    } catch (NumberFormatException nf) {
        JOptionPane.showMessageDialog(this, "Error al ingresar los datos, intente nuevamente");
    }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTablaproveAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablaproveAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaproveAncestorAdded



public void refrescarTablaDeProveedores() {
    // Borra todas las filas existentes en el modelo
    int filas = jTablaprove.getRowCount();
    for (int i = filas - 1; i >= 0; i--) {
        tabla2.removeRow(i);
    }

    // Llena el modelo con los productos actualizados
    List<Proveedor> proveedores = pd.listarProveedor(); // Suponiendo que tienes un método para listar proveedores
    for (Proveedor proveedor : proveedores) {
        tabla2.addRow(new Object[]{proveedor.getRazonSocial(), proveedor.getDomicilio(), proveedor.getTelefono()});
    }
}

    private void armarCabecera() {
        tabla2.addColumn("Razonsocial");
        tabla2.addColumn("Domicilo");
        tabla2.addColumn("Telefono");
        jTablaprove.setModel(tabla2);
    }

    public void limpiarCampos1() {
        jTRazon.setText("");
        jTDomicilio.setText("");
        jTTelefono.setText("");
    }

    public void noEditable1() {
        jTRazon.setEnabled(false);
        jTDomicilio.setEnabled(false);
        jTTelefono.setEnabled(false);
    }
    
        public void editable1(){
        jTRazon.setEnabled(true);
        jTDomicilio.setEnabled(true);
        jTTelefono.setEnabled(true);
    }

    private void cargarDatoss(Proveedor proveedor) {
        tabla2.addRow(new Object[]{proveedor.getRazonSocial(), proveedor.getDomicilio(), proveedor.getTelefono()});
    }
    
    public void llenarTextFieldd (){
    jTablaprove.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int filaSeleccionada = jTablaprove.getSelectedRow();
            if (filaSeleccionada >= 0) {
                // Obtén los valores de las celdas en la fila seleccionada
                String razonSocial = jTablaprove.getValueAt(filaSeleccionada, 0).toString();
                String domicilio = jTablaprove.getValueAt(filaSeleccionada, 1).toString();
                String telefono = jTablaprove.getValueAt(filaSeleccionada, 2).toString();

                // Establece estos valores en tus campos de texto
                jTRazon.setText(razonSocial);
                jTDomicilio.setText(domicilio);
                jTTelefono.setText(telefono);
            }
        }
    }
});

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTRazon;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable jTablaprove;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
