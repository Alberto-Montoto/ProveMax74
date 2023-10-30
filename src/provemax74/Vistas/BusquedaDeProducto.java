/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax74.Vistas;

import java.awt.Color;
import java.awt.Container;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.ContinueNode;
import jdk.nashorn.internal.objects.Global;
import provemax74.AccesoADatos.CompraData;
import provemax74.AccesoADatos.DetalleCompraData;
import provemax74.AccesoADatos.ProductoData;
import provemax74.Entidades.Compra;
import provemax74.Entidades.DetalleCompra;
import provemax74.Entidades.Producto;

/**
 *
 * @author maria
 */
public class BusquedaDeProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form BusquedaDeProducto
     */
    Producto produ = new Producto();
    Compra comp = new Compra();
    ProductoData prodDat = new ProductoData();
    CompraData compDat = new CompraData();
    DetalleCompra detaComp = new DetalleCompra();
    DetalleCompraData dcd = new DetalleCompraData();
    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

    };

    public BusquedaDeProducto() {
        initComponents();
        armarCabecera2();
        jDC3();
        jPanel1.setBackground(new Color(131, 193, 227));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBuscar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDC1 = new com.toedter.calendar.JDateChooser();
        jDC2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRB1 = new javax.swing.JRadioButton();
        jRB2 = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jRB3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jDC3 = new com.toedter.calendar.JDateChooser();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTBuscar1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jDC4 = new com.toedter.calendar.JDateChooser();
        jDC5 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRB4 = new javax.swing.JRadioButton();
        jRB5 = new javax.swing.JRadioButton();
        jBBuscar1 = new javax.swing.JButton();
        jRB6 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jDC6 = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(1217, 777));

        jTBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTBuscar);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Busqueda de Productos");

        jDC1.setEnabled(false);
        jDC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDC1MouseClicked(evt);
            }
        });
        jDC1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC1PropertyChange(evt);
            }
        });

        jDC2.setEnabled(false);
        jDC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDC2MouseClicked(evt);
            }
        });
        jDC2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC2PropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Buscar por fecha:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Buscar entre fechas:");

        buttonGroup1.add(jRB1);
        jRB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRB1MouseClicked(evt);
            }
        });
        jRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB2);
        jRB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRB2MouseClicked(evt);
            }
        });
        jRB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2ActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB3);
        jRB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRB3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Ultima compra");

        jDC3.setEnabled(false);
        jDC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDC3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 364, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRB2)
                                            .addComponent(jRB1)))
                                    .addComponent(jRB3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDC3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDC1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDC2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(415, 415, 415))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBBuscar)
                                .addGap(210, 210, 210))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(327, 327, 327))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRB1)
                        .addComponent(jLabel2)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jRB2)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRB3))
                    .addComponent(jLabel4))
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jBBuscar)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jInternalFrame1.setPreferredSize(new java.awt.Dimension(500, 420));

        jTBuscar1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTBuscar1);

        jLabel5.setText("Busqueda de Productos");

        jDC4.setEnabled(false);
        jDC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDC4MouseClicked(evt);
            }
        });
        jDC4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC4PropertyChange(evt);
            }
        });

        jDC5.setEnabled(false);
        jDC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDC5MouseClicked(evt);
            }
        });
        jDC5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC5PropertyChange(evt);
            }
        });

        jLabel6.setText("Buscar por fecha:");

        jLabel7.setText("Buscar entre fechas:");

        buttonGroup1.add(jRB4);
        jRB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRB4MouseClicked(evt);
            }
        });
        jRB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB5);
        jRB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRB5MouseClicked(evt);
            }
        });
        jRB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5ActionPerformed(evt);
            }
        });

        jBBuscar1.setText("Buscar");
        jBBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscar1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB6);
        jRB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRB6MouseClicked(evt);
            }
        });

        jLabel8.setText("Ultima compra");

        jDC6.setEnabled(false);
        jDC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDC6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRB5)
                                            .addComponent(jRB4)))
                                    .addComponent(jRB6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDC6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDC4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDC5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(415, 415, 415))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jBBuscar1)
                                .addGap(210, 210, 210)))
                        .addGap(327, 327, 327))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRB4)
                        .addComponent(jLabel6)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jRB5)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRB6))
                    .addComponent(jLabel8))
                .addGap(97, 97, 97)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jBBuscar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 378, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1ActionPerformed

    private void jDC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDC1MouseClicked
        // TODO add your handling code here:
        limpiar();


    }//GEN-LAST:event_jDC1MouseClicked

    private void jRB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB3MouseClicked
        // TODO add your handling code here:
        jDC1.setEnabled(false);
        jDC2.setEnabled(false);
//        jDC3.setDate(prodDat.obtenerFechaFin());
        
        limpiar();
        // Borra todas las filas existentes en el modelo
        int filas = model.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        //Llena el modelo con los productos actualizados
        if (jRB3.isSelected()) {

            List<Producto> productos = prodDat.listarProductosDeUltimaCompra();

//        System.out.println("tamaño" + productos.size());
            for (Producto producto : productos) {

                model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(),
                    producto.getPrecioActual(), producto.getStock()});

            }
        }

    }//GEN-LAST:event_jRB3MouseClicked

    private void jRB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB2MouseClicked
        // TODO add your handling code here:
        editable();
        limpiar();


    }//GEN-LAST:event_jRB2MouseClicked

    private void jRB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2ActionPerformed

    private void jDC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDC2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDC2MouseClicked

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        int filas = model.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        try {
            if ((jDC1 != null) && (jDC2 != null)) {

                LocalDate fecha1 = jDC1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha2 = jDC2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

//                System.out.println("fecha 1: " + fecha1);
//                System.out.println("fecha 2: " + fecha2);
                List<Producto> productos = prodDat.listarProductosEntreFechas(fecha1, fecha2);
                List<DetalleCompra> detalle = dcd.listarDetalleCompra();
//            System.out.println("tamaño" + productos.size());
                if (fecha2.isBefore(fecha1)) {
                    // La fecha 2 es anterior a la fecha 1, muestra una advertencia.
                    JOptionPane.showMessageDialog(null, "La segunda fecha no puede ser anterior a la primera fecha.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {

//                for (Producto producto : productos) {
//                    
////                    Map<Integer, Integer> productosComprados = prodDat.sumarCantidadProductosCompradosEntreFechas(fecha1, fecha2);
//                    
//                    model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(),
//                        producto.getPrecioActual(), prodDat.sumarCantidadProductosCompradosEntreFechas(fecha1, fecha2).values()});
//                    for (Producto producto : productos) {
//                        Map<Integer, Integer> productosComprados = prodDat.sumarCantidadProductosCompradosEntreFechas(fecha1, fecha2);
//                        int cantidadComprada = productosComprados.get(producto.getIdProducto()); // Obtener la cantidad comprada para este producto
//

//            List<DetalleCompra> detalle = detaComp.getCantidad();
                    for (Producto producto : productos) {
                        
//                        model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(),
//                            producto.getPrecioActual(), detaComp.getCantidad()});
                        model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(),
                            producto.getPrecioActual(), detaComp.getCantidad() });

                    }
                }

                
            
                
            
            
            
            
            
//                Map<Integer, Integer> productosComprados = prodDat.sumarCantidadProductosCompradosEntreFechas(fecha1, fecha2);
//                for (Map.Entry<Integer, Integer> entry : productosComprados.entrySet()) {
//                    int idProducto = entry.getKey(); // ID del producto
//                    int cantidadComprada = entry.getValue(); // Cantidad total comprada
//
//                    // Agrega una fila a la tabla con los datos
//                    model.addRow(new Object[]{idProducto, cantidadComprada});
                }
                
//            } else if (jDC1 != null && jDC2.isEnabled()) {
////                LocalDate fecha1 = jDC1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//                List<Producto> productos = prodDat.listarProductosPorFecha();
////            System.out.println("tamaño" + productos.size());
//

//            }
            
            
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Falta ingresar una fecha", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
        
            
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jDC1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC1PropertyChange

    }//GEN-LAST:event_jDC1PropertyChange

    private void jDC2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC2PropertyChange

    }//GEN-LAST:event_jDC2PropertyChange

    private void jDC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDC3MouseClicked
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jDC3MouseClicked

    private void jRB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB1MouseClicked
        // TODO add your handling code here:
        limpiar();
        noEditable();
        jDC1.setEnabled(true);
    }//GEN-LAST:event_jRB1MouseClicked

    private void jDC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDC4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDC4MouseClicked

    private void jDC4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC4PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDC4PropertyChange

    private void jDC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDC5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDC5MouseClicked

    private void jDC5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC5PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDC5PropertyChange

    private void jRB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4MouseClicked

    private void jRB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4ActionPerformed

    private void jRB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5MouseClicked

    private void jRB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5ActionPerformed

    private void jBBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscar1ActionPerformed

    private void jRB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6MouseClicked

    private void jDC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDC6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDC6MouseClicked

    private void armarCabecera() {
        model.addColumn("Producto");
        model.addColumn("Descripción");
        model.addColumn("Precio");
        model.addColumn("Stock");
        model.addColumn("Cantidad");

        jTBuscar.setModel(model);
    }
    
    private void armarCabecera2() {
        
        model.addColumn("Producto");
        model.addColumn("Descripción");
        model.addColumn("Precio");
        model.addColumn("Cantidad");

        jTBuscar.setModel(model);
    }

    // Método para refrescar la tabla de productos
    public void refrescarTablaDeProductos() {
        // Borra todas las filas existentes en el modelo
        int filas = model.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        // Llena el modelo con los productos actualizados
        List<Producto> productos = prodDat.listarProducotosEstado();
        for (Producto producto : productos) {

            model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscar1;
    private com.toedter.calendar.JDateChooser jDC1;
    private com.toedter.calendar.JDateChooser jDC2;
    private com.toedter.calendar.JDateChooser jDC3;
    private com.toedter.calendar.JDateChooser jDC4;
    private com.toedter.calendar.JDateChooser jDC5;
    private com.toedter.calendar.JDateChooser jDC6;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRB1;
    private javax.swing.JRadioButton jRB2;
    private javax.swing.JRadioButton jRB3;
    private javax.swing.JRadioButton jRB4;
    private javax.swing.JRadioButton jRB5;
    private javax.swing.JRadioButton jRB6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTBuscar;
    private javax.swing.JTable jTBuscar1;
    // End of variables declaration//GEN-END:variables

    private void jDC3() {
// Obtén la fecha de la última compra
        LocalDate fechaUltimaCompra = prodDat.obtenerFechaUltimaCompra();

// Convierte LocalDate a java.util.Date
        java.util.Date utilDate = Date.from(fechaUltimaCompra.atStartOfDay(ZoneId.systemDefault()).toInstant());

// Establece la fecha en el JDateChooser
        jDC3.setDate(utilDate);
    }

    public void editable() {
        jDC2.setEnabled(true);
        jDC1.setEnabled(true);
        jDC1.setDate(null);
    }
    
        public void noEditable() {
        jDC2.setEnabled(false);
        jDC1.setDate(null);
    }
    
    public void limpiar(){
        jDC1.setDate(null);
        jDC2.setDate(null);
//        jDC3.setDate(null);
        int filas = model.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
}
