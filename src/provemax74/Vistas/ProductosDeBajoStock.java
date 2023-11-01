/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax74.Vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import provemax74.AccesoADatos.ProductoData;
import provemax74.Entidades.Producto;

/**
 *
 * @author maria
 */
public class ProductosDeBajoStock extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProductosDeBajoStock
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

    public ProductosDeBajoStock() {
        initComponents();
        armarCabecera();
        refrescarTablaDeProductos();
        jPanel1.setBackground(new Color(131, 193, 227));
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            //centerRenderer.setFont(centerRenderer.getFont().deriveFont(Font.BOLD));
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1212, 738));

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
        jScrollPane1.setViewportView(jTabla);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Productos de Bajo Stock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(511, 511, 511))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


     private void armarCabecera(){
        model.addColumn("Producto");
        model.addColumn("Descripción");
        model.addColumn("Precio");
        model.addColumn("Stock");
        model.addColumn("Estado");
        
        jTabla.setModel(model);
    }
     
    public void refrescarTablaDeProductos() {
    // Borra todas las filas existentes en el modelo
    int filas = model.getRowCount();
    for (int i = filas - 1; i >= 0; i--) {
        model.removeRow(i);
    }
       
    // Llena el modelo con los productos actualizados
    List<Producto> productos = prodDat.listarProducotosEstado(); // Método para listar productos
    for (Producto producto : productos) {
        if (producto.getStock() < 25) {
        String estadoStr = producto.estado() ? "Activo" : "Inactivo";
        model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock(), estadoStr});
        jTabla.setDefaultRenderer(Object.class, centerRenderer); //para centrar los valores en las celdas de la tabla

    }
    }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
