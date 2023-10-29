/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax74.Vistas;

import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import provemax74.AccesoADatos.ProductoData;
import provemax74.Entidades.Producto;

/**
 *
 * @author maria
 */
public class GestionDeProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Producto
     */
    Producto produ = new Producto();
    ProductoData prodDat = new ProductoData();
    DefaultTableModel model = new DefaultTableModel(){

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
        
    };
    
     DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

    
    public GestionDeProducto() {
        initComponents();
        noEditable();
        armarCabecera();
        refrescarTablaDeProductos();
        jPanel1.setBackground(new Color(131, 193, 227));
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
         for (int i = 0; i < jTabla.getColumnModel().getColumnCount(); i++) {
                jTabla.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTProducto = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1212, 738));

        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 738));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Nombre de producto:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Stock:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Estado:");

        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
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

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.setRowHeight(30);
        jTabla.setRowMargin(2);
        jTabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jTablaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTablaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("Gestión de Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jRBEstado)))))
                        .addGap(10, 10, 10)
                        .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jTProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jRBEstado))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
        try{
            if(jTProducto.getText().isEmpty()||jTDescripcion.getText().isEmpty()||jTPrecio.getText().isEmpty()||jTStock.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Falta llenar un campo");
                return;
            }
                
            String producto = jTProducto.getText();
            String descripcion = jTDescripcion.getText();
            double precio = (Double.parseDouble(jTPrecio.getText()));
            int stock = (Integer.parseInt(jTStock.getText()));
            boolean estado = jRBEstado.isSelected();
            
            produ.setNombreProducto(producto);
            produ.setDescripcion(descripcion);
            produ.setPrecioActual(precio);
            produ.setStock(stock);
            produ.setestado(estado);
            String estadoStr = estado ? "Activo" : "Inactivo"; // Convierte el booleano en un String
            
            prodDat.agregarProductoSinID(produ);
            
            model.addRow(new Object[]{producto, descripcion, precio, stock, estadoStr});
                        
            } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos, intente nuevamente");
            
        }
        limpiarCampos();
        noEditable();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        editable();
        limpiarCampos();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        
        
        int filasS = jTabla.getSelectedRow();
        if (filasS != -1) {
        String nombreProducto = (String) model.getValueAt(filasS, 0);
        
        // Eliminar el producto de la base de datos
        prodDat.eliminarProductoPorNombre(nombreProducto);
        
        // Eliminar la fila de la tabla local
        model.removeRow(filasS);

        }else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila");
        }
        limpiarCampos();
        noEditable();
        
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
//        llenarTextField();
        try {
            if(jTProducto.getText().isEmpty()||jTDescripcion.getText().isEmpty()||jTPrecio.getText().isEmpty()||jTStock.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Falta llenar un campo");
                return;
            }
        // Recupera los datos modificados de los campos
            String producto = jTProducto.getText();
            String descripcion = jTDescripcion.getText();
            double precio = (Double.parseDouble(jTPrecio.getText()));
            int stock = (Integer.parseInt(jTStock.getText()));
            boolean estado = jRBEstado.isSelected();
        
        // Actualiza el producto en la base de datos
            produ.setNombreProducto(producto);
            produ.setDescripcion(descripcion);
            produ.setPrecioActual(precio);
            produ.setStock(stock);
            produ.setestado(estado);
            String estadoStr = estado ? "Activo" : "Inactivo"; // Convierte el booleano en un String
        
//            prodDat.agregarProductoSinID(produ);
            
            model.addRow(new Object[]{producto, descripcion, precio, stock, estadoStr});
            int filasS = jTabla.getSelectedRow();
        if (filasS != -1) {
        String nombreProducto = (String) model.getValueAt(filasS, 0);
        
        // Eliminar el producto de la base de datos
        prodDat.eliminarProductoModificado(nombreProducto);
        
        // Eliminar la fila de la tabla local
        model.removeRow(filasS);
        }

        prodDat.agregarProductoSinID(produ);
        // Limpia los campos y deshabilita la edición
        limpiarCampos();
        noEditable();
    } catch (NumberFormatException nf) {
        JOptionPane.showMessageDialog(this, "Error al ingresar los datos, intente nuevamente");
    }
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        // TODO add your handling code here:
        editable();
        
        int filaS = jTabla.getSelectedRow();
        
        if (filaS != -1) {
            
            String nombre = (String) jTabla.getValueAt(filaS, 0);
            String descripcion = (String) jTabla.getValueAt(filaS, 1);
            double precio = (Double) jTabla.getValueAt(filaS, 2);
            int stock = (Integer) jTabla.getValueAt(filaS, 3);
            String estado = jTabla.getValueAt(filaS, 4).toString();
            if (estado.equals("Activo")) {
                jRBEstado.setSelected(true);
            } else {
                jRBEstado.setSelected(false);
}
            
            
            jTProducto.setText(nombre);
            jTDescripcion.setText(descripcion);
            jTPrecio.setText(precio+"");
            jTStock.setText(stock+"");
            jRBEstado.isSelected();
            
            
            
        }
        
//        llenarTextField();
    }//GEN-LAST:event_jTablaMouseClicked

    private void jTablaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaAncestorAdded

    private void jTablaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaAncestorMoved

    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBEstadoActionPerformed


    public void limpiarCampos(){
        jTProducto.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jTStock.setText("");
        jRBEstado.setSelected(false);
    }
    
    public void esconderCampos(){
        jTProducto.setVisible(false);
        jTDescripcion.setVisible(false);
        jTPrecio.setVisible(false);
        jTStock.setVisible(false);
        jRBEstado.setVisible(false);
    }
    
    public void mostrarCampos(){
        jTProducto.setVisible(true);
        jTDescripcion.setVisible(true);
        jTPrecio.setVisible(true);
        jTStock.setVisible(true);
        jRBEstado.setVisible(true);
    }
    
    public void noEditable(){
        jTProducto.setEnabled(false);
        jTDescripcion.setEnabled(false);
        jTPrecio.setEnabled(false);
        jTStock.setEnabled(false);
        jRBEstado.setEnabled(false);
    }
    
    public void editable(){
        jTProducto.setEnabled(true);
        jTDescripcion.setEnabled(true);
        jTPrecio.setEnabled(true);
        jTStock.setEnabled(true);
        jRBEstado.setEnabled(true);
    }
    
    private void armarCabecera(){
        model.addColumn("Producto");
        model.addColumn("Descripción");
        model.addColumn("Precio");
        model.addColumn("Stock");
        model.addColumn("Estado");
        
        jTabla.setModel(model);
    }
    
    // Método para refrescar la tabla de productos
public void refrescarTablaDeProductos() {
    // Borra todas las filas existentes en el modelo
    int filas = model.getRowCount();
    for (int i = filas - 1; i >= 0; i--) {
        model.removeRow(i);
    }

    // Llena el modelo con los productos actualizados
    List<Producto> productos = prodDat.listarProducotosEstado(); // Suponiendo que tienes un método para listar productos
    for (Producto producto : productos) {
        String estadoStr = producto.estado() ? "Activo" : "Inactivo";
        model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock(), estadoStr});
         jTabla.setDefaultRenderer(Object.class, centerRenderer); //para centrar los valores en las celdas de la tabla

    }
}

public void llenarTextField (){
    jTabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int filaSeleccionada = jTabla.getSelectedRow();
            if (filaSeleccionada >= 0) {
                // Obtén los valores de las celdas en la fila seleccionada
                String producto = jTabla.getValueAt(filaSeleccionada, 0).toString();
                String descripcion = jTabla.getValueAt(filaSeleccionada, 1).toString();
                String precio = jTabla.getValueAt(filaSeleccionada, 2).toString();
                String stock = jTabla.getValueAt(filaSeleccionada, 3).toString();
                String estado = jTabla.getValueAt(filaSeleccionada, 4).toString();

                // Establece estos valores en tus campos de texto
                jTProducto.setText(producto);
                jTDescripcion.setText(descripcion);
                jTPrecio.setText(precio);
                jTStock.setText(stock);
                jRBEstado.setSelected(estado.equals("Activo"));
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTProducto;
    private javax.swing.JTextField jTStock;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
