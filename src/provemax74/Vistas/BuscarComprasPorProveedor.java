package provemax74.Vistas;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import provemax74.AccesoADatos.CompraData;
import provemax74.AccesoADatos.DetalleCompraData;
import provemax74.AccesoADatos.ProveedorData;
import provemax74.Entidades.Compra;
import provemax74.Entidades.DetalleCompra;
import provemax74.Entidades.Proveedor;

public class BuscarComprasPorProveedor extends javax.swing.JInternalFrame {

    ProveedorData pd = new ProveedorData();
    Proveedor prove = new Proveedor();
    DetalleCompraData dcd = new DetalleCompraData();
    CompraData cd = new CompraData();
    DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();

    DefaultTableModel tabla3 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

    };
    DefaultTableModel tabla4 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

    };
    
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

    public BuscarComprasPorProveedor() {
        initComponents();
        cargarCombo();
        armarCabecera();
        armarCabecera2();
        getContentPane().setBackground(new Color(131, 193, 227));
        jPanel1.setBackground(new Color(131, 193, 227));
        
        jTDetalleCompras.getColumnModel().getColumn(1).setPreferredWidth(150); //Para agrandar el ancho de columan de nombre de nombre de producto
        jTDetalleCompras.getColumnModel().getColumn(2).setPreferredWidth(150); //Para agrandar el ancho de columan de nombre de descripcion
        jTDetalleCompras.getColumnModel().getColumn(3).setPreferredWidth(150); //Para agrandar el ancho de columan de nombre de cantidad
        jTDetalleCompras.getColumnModel().getColumn(4).setPreferredWidth(150); //Para agrandar el ancho de columan de nombre de costo total

        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
         for (int i = 0; i < jTCompras.getColumnModel().getColumnCount(); i++) {
                jTCompras.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
            }
         
         for (int i = 0; i < jTDetalleCompras.getColumnModel().getColumnCount(); i++) {
                jTDetalleCompras.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
            }

        // Configura la propiedad "Editable" de la tabla jTProveedor
        jTCompras.setModel(tabla3);
        jTCompras.setEnabled(true);  // Habilitar la edición o selección de celdas


        // Agrega el listener al evento de clic en la tabla jTProveedor
        jTCompras.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTProveedorMouseClicked(e);
            }
        });
    }
    

    private void cargarCombo() {
        List<Proveedor> proveedores = pd.listarProveedor(); // Obtiene la lista de proveedores desde la base de datos

        for (Proveedor prove : proveedores) {
            modeloComboBox.addElement(prove.getRazonSocial()); // Agrega el nombre del proveedor al ComboBox
        }

        jCBProveedor.setModel(modeloComboBox); // Establece el modelo del ComboBox
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCompras = new javax.swing.JTable();
        jCBProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDetalleCompras = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1212, 738));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Compras a Proveedores");

        jTCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jTCompras.setEnabled(false);
        jTCompras.setRowHeight(20);
        jTCompras.setRowMargin(2);
        jTCompras.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTComprasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTCompras);

        jCBProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProveedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Seleccionar un proveedor:");

        jTDetalleCompras.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTDetalleCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jTDetalleCompras.setName(""); // NOI18N
        jTDetalleCompras.setRowHeight(20);
        jTDetalleCompras.setRowMargin(2);
        jScrollPane2.setViewportView(jTDetalleCompras);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Productos comprados:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Seleccionar una compra:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jCBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1)))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
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

    private void jCBProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProveedorActionPerformed
        // Obtiene la Razon Social en el ComboBox
        String razonSocial = (String) jCBProveedor.getSelectedItem();

        if (razonSocial != null) {
            // Aquí se obtiene el ID del proveedor en base al nombre seleccionado,
            // ya que el ComboBox muestra los nombres, no los IDs.
            // Método para obtener el ID por Razon Social.
            int idProveedor = pd.obtenerIdProveedorPorRazonSocial(razonSocial);

            // Llama a un método para obtener la lista de compras por proveedor
            List<Compra> compras = cd.listarCompraPorProveedor(idProveedor);

            // Llena la tabla con la lista de compras
            DefaultTableModel model = (DefaultTableModel) jTCompras.getModel();
            model.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

            for (Compra compra : compras) {
                // Se usa ',' para separar los valores en la fila
                model.addRow(new Object[]{compra.getIdCompra(), compra.getFecha(), compra.getProveedor()});
                jTCompras.setDefaultRenderer(Object.class, centerRenderer); //para centrar los valores en las celdas de la tabla

            }
        }

//        if (proveedorSeleccionado != null) {
//            // Aquí debes obtener el ID del proveedor en base al nombre seleccionado,
//            // ya que el ComboBox muestra los nombres, no los IDs.
//            // Supongamos que tienes un método para obtener el ID por nombre.
//            int idProveedor = pd.obtenerIdProveedorPorRazonSocial(proveedorSeleccionado);
//
//            // Llama a un método para obtener la lista de compras por proveedor
//            List<Compra> compras = cd.listarCompraPorProveedor(idProveedor);
//
//            // Llena la tabla de compras con la lista de compras
//            DefaultTableModel modelCompras = (DefaultTableModel) jTProveedor.getModel();
//            modelCompras.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
//
//            for (Compra compra : compras) {
//                modelCompras.addRow(new Object[]{compra.getIdCompra(), compra.getFecha()});
//            }
//
//            // Llama a un método para obtener el detalle de compras
//            List<DetalleCompra> detalles = dcd.listarDetalleCompraPorProveedor(idProveedor);
//
//            // Llena la tabla de detalles de compras con la lista de detalles
//            DefaultTableModel modelDetalles = (DefaultTableModel) jTDetalleCompras.getModel();
//            modelDetalles.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos
//
//            for (DetalleCompra detalle : detalles) {
//                modelDetalles.addRow(new Object[]{detalle.getCantidad(), detalle.getPrecioCosto(), detalle.getProducto().getIdProducto()});
//            }
//        }

    }//GEN-LAST:event_jCBProveedorActionPerformed

    private void jTComprasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTComprasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTComprasAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jCBProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCompras;
    private javax.swing.JTable jTDetalleCompras;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        tabla3.addColumn("ID");
        tabla3.addColumn("Fecha");
        jTCompras.setModel(tabla3);
    }

    private void armarCabecera2() {
        tabla4.addColumn("ID");
        tabla4.addColumn("Producto");
        tabla4.addColumn("Descripcion");
        tabla4.addColumn("Cantidad");
        tabla4.addColumn("Costo Total");

        jTDetalleCompras.setModel(tabla4);
    }
    

    private void jTProveedorMouseClicked(java.awt.event.MouseEvent evt) {
        // Obtén la fila seleccionada
        int filaSeleccionada = jTCompras.getSelectedRow();

        // Verifica si se ha seleccionado una fila
        if (filaSeleccionada != -1) {
            // Obtén el ID de la compra seleccionada en la tabla jTProveedor
            int idCompra = (int) jTCompras.getValueAt(filaSeleccionada, 0);

            // Llama a un método para obtener los detalles de compra por ID de compra
            List<DetalleCompra> detalles = dcd.listarDetalleCompraPorCompra(idCompra);

            // Limpia la tabla de detalles antes de agregar nuevos datos
            DefaultTableModel modelDetalles = (DefaultTableModel) jTDetalleCompras.getModel();
            modelDetalles.setRowCount(0);

            // Llena la tabla de detalles de compras con los detalles obtenidos
            for (DetalleCompra detalle : detalles) {
                modelDetalles.addRow(new Object[]{detalle.getProducto().getIdProducto(),detalle.getProducto().getNombreProducto(), detalle.getProducto().getDescripcion(), 
                    detalle.getCantidad(), detalle.getPrecioCosto()});
                 
                jTDetalleCompras.setDefaultRenderer(Object.class, centerRenderer); //para centrar los valores en las celdas de la tabla

            }
        }
    }
}
