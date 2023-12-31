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
import provemax74.Entidades.Producto;

/**
 *
 * @author maria
 */
public class DetalleCompraData {
    
       private Connection con = null;
  //     private CompraData compraData = new CompraData();
//       private ProductoData prodData = new ProductoData();
  //     private DetalleCompra detalleData = new DetalleCompra();
       
    public DetalleCompraData() {

        con = Conexion.getConexion();
    }
    
    
    
    //Guardar Detalle
    public void guardarDetalle(DetalleCompra detalle){
        String sql =  "INSERT INTO detallecompra (cantidad, precioCosto, idProducto, idCompra)"//
                + "VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioCosto()* detalle.getCantidad());
            ps.setInt(3, detalle.getIdProducto());
            ps.setInt(4, detalle.getIdProducto());
            ps.executeUpdate();
            
            ResultSet rs =  ps.getGeneratedKeys();
            
            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle agregado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla DetalleCompra");
        }
    }
    
    //Borrar Detalle
    public void borrarDetalle(int idDetalle) {
        String sql =  "DELETE FROM detallecompra WHERE idDetalle = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idDetalle);
            
            int borrado = ps.executeUpdate();
                                   
            if (borrado == 1) {
               JOptionPane.showMessageDialog(null, "Detalle borrado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla DetalleCompra");
        }
    }
    
    
    //Modificar Detalle
    public void modificarDetalle(DetalleCompra detalle) {
        String sql = "UPDATE detallecompra SET  cantidad = ?, precioCosto = ?,  nombreProducto = ?," //precioCosto = ?,
                + " idProducto = ? WHERE idDetalle = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
//            ps.setInt(1, detalle.getIdDetalle());
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getProducto().getPrecioActual()* detalle.getCantidad()); //detalle.getPrecioCosto()); 
            ps.setString(3, detalle.getProducto().getNombreProducto());
            ps.setInt(4, detalle.getProducto().getIdProducto());
            ps.setInt(5, detalle.getIdDetalle());
            
//            ps.setInt(1, detalle.getCantidad());
//            ps.setDouble(2, detalle.getCantidad()* detalle.getProducto().getPrecioActual());
//            ps.setString(3, detalle.getNombreProducto());
//            ps.setInt(4, detalle.getIdProducto());
//            ps.setInt(5, detalle.getIdDetalle());
            
            int modificado = ps.executeUpdate();
                                   
            if (modificado == 1) {
               JOptionPane.showMessageDialog(null, "Detalle modificado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla DetalleCompra" + ex.getMessage());
        }
      
    }
    
    public DetalleCompra buscarDetalle(int id){
        
        String sql="SELECT cantidad, precioCosto, nombreProducto, idProducto FROM detallecompra WHERE idDetalle=?";
        
        DetalleCompra detalle=null;
        
           try {
               PreparedStatement ps=con.prepareStatement(sql);
               
               ps.setInt(1, id);
               
               ResultSet rs=ps.executeQuery();
               
               if (rs.next()) {
                   
                   detalle=new DetalleCompra();
                   
                   detalle.setIdDetalle(id);
                   detalle.setCantidad(rs.getInt("cantidad"));
                   detalle.setPrecioCosto(rs.getDouble("precioCosto"));
                   detalle.setNombreProducto(rs.getString("nombreProducto"));
                   detalle.setIdProducto(rs.getInt("idProducto"));
                   
               } else{
                   JOptionPane.showMessageDialog(null, "No existe un detalle con ese ID");
               }
                
               ps.close(); 
               
           } catch (SQLException ex) {
               
               JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detallecompra: "+ex.getMessage());
           }
       
        return detalle;
    }
    
   

    
    
//    public void modificarDetalle(int idDetalleCompra, int nuevaCantidad, double nuevoPrecio, int nuevoIdProducto, String nuevoNombre) {
//    String sql = "UPDATE detallecompra SET precio=?, cantidad=?, idProducto=? WHERE idDetalleCompra=?";
//
//    try (PreparedStatement ps = con.prepareStatement(sql)) {
//        ps.setDouble(1, nuevoPrecio);
//        ps.setInt(2, nuevaCantidad);
//        ps.setInt(3, idDetalleCompra);
//        ps.setInt(4, nuevoIdProducto);
//        ps.setString(5, nuevoNombre);
//
//        int exito = ps.executeUpdate();
//
//        if (exito == 1) {
//            JOptionPane.showMessageDialog(null, "Detalle de compra modificado con éxito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "No se encontró el detalle de compra para modificar.");
//        }
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al modificar el detalle de compra: " + ex.getMessage());
//    }
//}
    
    
    
   

    
    
//    public DetalleCompra buscarDetalle1(int idDetalle) {
//        String sql = "SELECT cantidad, precioCosto, idProducto FROM detallecompra WHERE idDetalleCompra = ?";
//        DetalleCompra detalleCompra = null;
//
//    try {
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, idDetalle);
//        ResultSet rs = ps.executeQuery();
//
//        if (rs.next()) {
//            detalleCompra = new DetalleCompra();
//            detalleCompra.setIdDetalle(idDetalle);
//            detalleCompra.setCantidad(rs.getInt("cantidad"));
//            detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
//            
//            // Aquí necesitas obtener el idProducto del resultado y luego buscar el producto correspondiente
//            int idProducto = rs.getInt("idProducto");
//            Producto producto = buscarProductoPorId(idProducto); // Debes implementar este método
//            detalleCompra.setProducto(producto);
//        } else {
//            JOptionPane.showMessageDialog(null, "No existe ese detalle de compra");
//        }
//        ps.close();
//
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al acceder al detalle de compra");
//    }
//    return detalleCompra;
//}
//
//    public Producto buscarProductoPorId(int idProducto) {
//    String sql = "SELECT idProducto, nombreProducto, descripcion, precioActual, stock, estado FROM producto WHERE idProducto = ?";
//    Producto producto = null;
//
//    try {
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, idProducto);
//        ResultSet rs = ps.executeQuery();
//
//        if (rs.next()) {
//            producto = new Producto();
//            producto.setIdProducto(idProducto);
//            producto.setNombreProducto(rs.getString("nombreProducto"));
//            producto.setDescripcion(rs.getString("descripcion"));
//            producto.setPrecioActual(rs.getDouble("precioActual"));
//            producto.setStock(rs.getInt("stock"));
//            producto.setEstado(rs.getBoolean("estado"));
//        } else {
//            JOptionPane.showMessageDialog(null, "No existe ese producto");
//        }
//        ps.close();
//
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al buscar el producto por ID: " + ex.getMessage());
//    }
//    return producto;
//}
    
public List<DetalleCompra> listarDetalleCompraPorProveedor(int idProveedor) {
    List<DetalleCompra> detalles = new ArrayList<>();

    try {
        String consulta = "SELECT idProducto, cantidad, precioCosto FROM detallecompra WHERE idProveedor = ?";
        PreparedStatement ps = con.prepareStatement(consulta);
        ps.setInt(1, idProveedor);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            DetalleCompra detalle = new DetalleCompra();
            detalle.setIdProducto(rs.getInt("idProducto"));
            detalle.setCantidad(rs.getInt("cantidad"));
            detalle.setPrecioCosto(rs.getDouble("precioCosto"));

            detalles.add(detalle);
        }

        ps.close();
    } catch (SQLException ex) {
        // Manejo de errores aquí
        ex.printStackTrace();
    }

    return detalles;
}

public void guardarDetalleVista(DetalleCompra detalle){
        String sql =  "INSERT INTO detallecompra (cantidad, precioCosto, nombreProducto, idProducto)"//
                + "VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioCosto()* detalle.getCantidad());
//            JOptionPane.showMessageDialog(null, detalle.getNombreProducto());
            ps.setString(3, detalle.getNombreProducto());
            ps.setInt(4, detalle.getIdProducto());
            ps.executeUpdate();
            
            ResultSet rs =  ps.getGeneratedKeys();
            
            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle agregado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla DetalleCompra");
        }
    }
    
    
    
    
    
    

    
    
    public List<DetalleCompra> listarDetalleCompra(){
        
        String sql = "SELECT idDetalle, cantidad, precioCosto FROM detalleCompra ";
        ArrayList<DetalleCompra> detalleCompras=new ArrayList<>();
        
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                
                detalleCompras.add(detalleCompra);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al detalle de compra");
        }
            return detalleCompras;
        
    }
public List<DetalleCompra> listarDetalleCompraPorCompra(int idCompra) {
    List<DetalleCompra> detalles = new ArrayList<>();

    String query =  "SELECT cantidad, precioCosto, producto.idProducto, producto.nombreProducto, producto.descripcion "
        + "FROM detallecompra JOIN producto ON detallecompra.idProducto=producto.idProducto "
        + "WHERE idCompra=?";
    try (PreparedStatement statement = con.prepareStatement(query)) {
        statement.setInt(1, idCompra);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                DetalleCompra detalle = new DetalleCompra();
                detalle.setCantidad(resultSet.getInt("cantidad"));
                detalle.setPrecioCosto(resultSet.getDouble("precioCosto"));

                // Obtén el producto asociado al detalle utilizando su ID de producto
              //  int idProducto = resultSet.getInt("idProducto");
                Producto producto = new Producto();  // Utiliza el constructor sin parámetros

                // Asigna el ID del producto (supongo que hay un método setIdProducto en la clase Producto)
                producto.setIdProducto(resultSet.getInt("idProducto"));
                producto.setNombreProducto(resultSet.getString("nombreProducto"));
                producto.setDescripcion(resultSet.getString("descripcion"));

                detalle.setProducto(producto);

                detalles.add(detalle);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return detalles;
}
   
//    public void cargarDetalle(Double cantidad, double precioCosto, int idProducto, int idCompra) {
//        String sql = "INSERT INTO DetalleCompra (cantidad, precioCosto, idProducto, idCompra) VALUES (?, ?, ?, ?)";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setDouble(1, cantidad);
//            ps.setDouble(2, precioCosto);
//            ps.setInt(3, idProducto); // Sustituye idProducto con el valor correspondiente
//            ps.setInt(4, idCompra); // Sustituye idCompra con el valor correspondiente
//            ps.executeUpdate();
//
//            // Obtener el ID autogenerado si es necesario
//            ResultSet generatedKeys = ps.getGeneratedKeys();
//            if (generatedKeys.next()) {
//                int idDetalleGenerado = generatedKeys.getInt(1);
//                System.out.println("ID de detalle generado: " + idDetalleGenerado);
//            }
//
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al insertar en la tabla DetalleCompra");
//        }
//
//    }
    
    
    
    public void cargarDetalle(Double cantidad, double precioCosto, int idProducto, int idCompra) {
    String sql = "INSERT INTO DetalleCompra (cantidad, precioCosto, idProducto, idCompra) VALUES (?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setDouble(1, cantidad);
        ps.setDouble(2, precioCosto);
        ps.setInt(3, idProducto);
        ps.setInt(4, idCompra);
        
        // Registro de la consulta SQL antes de la ejecución
        System.out.println("Consulta SQL: " + ps.toString());

        int filasAfectadas = ps.executeUpdate();

        // Verificar si la consulta de inserción fue exitosa
        if (filasAfectadas > 0) {
            System.out.println("DetalleCompra insertado correctamente.");
        } else {
            System.out.println("Error al insertar en DetalleCompra.");
        }

        ps.close();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Registrar la traza de la excepción
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}
}
