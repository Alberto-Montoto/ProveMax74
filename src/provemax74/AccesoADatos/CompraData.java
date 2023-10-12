/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax74.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemax74.Entidades.Compra;
import provemax74.Entidades.DetalleCompra;
import provemax74.AccesoADatos.ProveedorData;
import provemax74.AccesoADatos.DetalleCompraData;
import provemax74.Entidades.Proveedor;

/**
 *
 * @author maria
 */
public class CompraData {
    

    ProveedorData pd = new ProveedorData();
    DetalleCompraData dcd = new DetalleCompraData();
    
    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();
        
    }
    
    public void agregarCompra(Compra compra){
    
        String sql="INSERT INTO compra (fecha, idDetalle, idProveedor)"+
            "VALUES(?,?,?)";
    
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(compra.getFecha()));
            ps.setInt(2, compra.getDetalleCompra().getIdDetalle());
            ps.setInt(3, compra.getProveedor().getIdProveedor());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                compra.setIdCompra(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Compra registrada");
            }
            
            ps.close();
            
            
            
        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra: " + ex.getMessage());
        }
    }
        
        //Eliminar compra por Id
    public void eliminarCompra(int id) {
        try {
            String sql = "DELETE FROM compra WHERE idCompra = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int resultado = ps.executeUpdate();
            
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La compra se eliminó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la compra.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra. " + ex.getMessage());
        }
    }
    

//Buscar compra por Id
    public Compra buscarCompra(int id) {
        Compra compra = null;
        try {
            String sql = "SELECT * FROM compra WHERE idCompra = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                ProveedorData proveedor = new ProveedorData();
                DetalleCompraData detalle = new DetalleCompraData();
                compra = new Compra();
                compra.setIdCompra(id); 
                compra.setProveedor(proveedor.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setDetalleCompra(detalle.buscarDetalle(rs.getInt("idDetalle")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la compra.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra. " + ex.getMessage());
        }
        return compra;
    }

    //Listar compra
    public List<Compra> listarCompra() {
        List<Compra> compras = new ArrayList();
        try {
            String listar = "SELECT * FROM compra";
            
            PreparedStatement ps = con.prepareStatement(listar);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                
                DetalleCompra det = dcd.buscarDetalle(rs.getInt("idDetalle"));
                Proveedor prove=pd.buscarProveedor(rs.getInt("idProveedor"));
                
                compra.setDetalleCompra(det);
                compra.setProveedor(prove);

                compras.add(compra);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra. " + ex.getMessage());
        }
        return compras;
    }



    
//    //Listar compra
//    public List<Compra> listarCompra() {
//        List<Compra> compras = new ArrayList();
//        try {
//            String listar = "SELECT * FROM compra";
//            
//            PreparedStatement ps = con.prepareStatement(listar);
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                ProveedorData proveedor = new ProveedorData();
//                Compra compra = new Compra();
//                compra.setIdCompra(rs.getInt("idCompra"));
//                compra.setProveedor(proveedor.buscarProveedor(rs.getInt("idProveedor")));
//                compra.setFecha(rs.getDate("fecha").toLocalDate());
//                
//                compras.add(compra);
//            }
//            
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra. " + ex.getMessage());
//        }
//        return compras;
//    }

    
}
