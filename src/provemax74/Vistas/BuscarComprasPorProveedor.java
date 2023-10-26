package provemax74.Vistas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import provemax74.AccesoADatos.CompraData;
import provemax74.AccesoADatos.DetalleCompraData;
import provemax74.AccesoADatos.ProveedorData;
import provemax74.Entidades.Compra;
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

    public BuscarComprasPorProveedor() {
        initComponents();
        cargarCombo(); // Llama al método para cargar el ComboBox en el constructor.
        armarCabecera();
    }

    private void cargarCombo() {
        List<Proveedor> proveedores = pd.listarProveedor(); // Obtener la lista de proveedores desde la base de datos

        for (Proveedor prove : proveedores) {
            modeloComboBox.addElement(prove.getRazonSocial()); // Agregar el nombre del proveedor al ComboBox
        }

        jCBProveedor.setModel(modeloComboBox); // Establecer el modelo del ComboBox
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProveedor = new javax.swing.JTable();
        jCBProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setText("Buscar Compras por Proveedor");

        jTProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jTProveedor.setEnabled(false);
        jTProveedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTProveedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTProveedor);

        jCBProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProveedorActionPerformed(evt);
            }
        });

        jLabel2.setText("Proveedores:");

        jBLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(jCBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jBLimpiar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBLimpiar)
                .addGap(46, 46, 46))
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
        // Obtén el proveedor seleccionado en el ComboBox
        String proveedorSeleccionado = (String) jCBProveedor.getSelectedItem();

        if (proveedorSeleccionado != null) {
            // Aquí debes obtener el ID del proveedor en base al nombre seleccionado,
            // ya que el ComboBox muestra los nombres, no los IDs.
            // Supongamos que tienes un método para obtener el ID por nombre.
            int idProveedor = pd.obtenerIdProveedorPorRazonSocial(proveedorSeleccionado);

            // Llama a un método para obtener la lista de compras por proveedor
            List<Compra> compras = cd.listarCompraPorProveedor(idProveedor);

            // Llena la tabla con la lista de compras
            DefaultTableModel model = (DefaultTableModel) jTProveedor.getModel();
            model.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

            for (Compra compra : compras) {
                // Corrección: Debes usar ',' para separar los valores en la fila
                model.addRow(new Object[]{compra.getIdCompra(), compra.getFecha(), compra.getProveedor()});
            }
        }

    }//GEN-LAST:event_jCBProveedorActionPerformed

    private void jTProveedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTProveedorAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProveedorAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProveedor;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        tabla3.addColumn("idCompra");
        tabla3.addColumn("fecha");
                jTProveedor.setModel(tabla3);
    }
}

