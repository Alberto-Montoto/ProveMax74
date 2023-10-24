/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax74.Vistas;

/**
 *
 * @author maria
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMGDP = new javax.swing.JMenu();
        jMGDProd = new javax.swing.JMenuItem();
        jMBDP = new javax.swing.JMenuItem();
        jMPDBS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMGDProv = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMGDC = new javax.swing.JMenuItem();
        jMBPC = new javax.swing.JMenuItem();
        jMBC = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jMGDP.setText("  Producto  ");
        jMGDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGDPActionPerformed(evt);
            }
        });

        jMGDProd.setText("Gestión de Productos");
        jMGDProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGDProdActionPerformed(evt);
            }
        });
        jMGDP.add(jMGDProd);

        jMBDP.setText("Busqueda de Producto");
        jMGDP.add(jMBDP);

        jMPDBS.setText("Productos de bajo Stock");
        jMPDBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPDBSActionPerformed(evt);
            }
        });
        jMGDP.add(jMPDBS);

        jMenuBar1.add(jMGDP);

        jMenu2.setText("  Proveedor  ");

        jMGDProv.setText("Gestión de Proveedores");
        jMGDProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGDProvActionPerformed(evt);
            }
        });
        jMenu2.add(jMGDProv);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("  Compra  ");

        jMGDC.setText("Gestión de Detalle");
        jMenu4.add(jMGDC);

        jMBPC.setText("Buscar Productos Comprados");
        jMenu4.add(jMBPC);

        jMBC.setText("Buscar Compras por Proveedor");
        jMenu4.add(jMBC);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("  Salir  ");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        System.exit(0); //Esto se usa para salir del menu
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMPDBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPDBSActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ProductosDeBajoStock pbs = new ProductosDeBajoStock();
        pbs.setVisible(true);
        escritorio.add(pbs);
        escritorio.moveToFront(pbs);
    }//GEN-LAST:event_jMPDBSActionPerformed

    private void jMGDProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGDProdActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeProducto gdp = new GestionDeProducto();
        gdp.setVisible(true);
        escritorio.add(gdp);
        escritorio.moveToFront(gdp);
        
    }//GEN-LAST:event_jMGDProdActionPerformed

    private void jMGDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMGDPActionPerformed

    private void jMGDProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGDProvActionPerformed
               // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeProveedores gdp = new  GestionDeProveedores();
        gdp.setVisible(true);
        escritorio.add(gdp);
        escritorio.moveToFront(gdp);
    }//GEN-LAST:event_jMGDProvActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMBC;
    private javax.swing.JMenuItem jMBDP;
    private javax.swing.JMenuItem jMBPC;
    private javax.swing.JMenuItem jMGDC;
    private javax.swing.JMenu jMGDP;
    private javax.swing.JMenuItem jMGDProd;
    private javax.swing.JMenuItem jMGDProv;
    private javax.swing.JMenuItem jMPDBS;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
