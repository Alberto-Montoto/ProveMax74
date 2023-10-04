package provemax74.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemax74.Entidades.Producto;
import provemax74.Entidades.Proveedor;

public class ProductoData {

    private Connection con = null;

    public ProductoData(Connection conexion) {

        con = Conexion.getConexion();
    }

    public ProductoData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /////////////////// agregar un producto a la base de datos 
    public void agregarProducto(Producto producto) {

        String sql = "INSERT INTO Producto (idProducto, NombreProducto, Descripcion, PrecioActual, Stock, estado ) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, producto.getIdProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecioActual());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.estado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "producto guardado");
            }

            ps.close();

        } catch (SQLException ex) {
            // Manejo de excepciones en caso de error
            JOptionPane.showMessageDialog(null, "Error al guardar el producto" + ex.getMessage());
        }

    }

    /////////////////// metodo eliminar un producto por id
    public void eliminarProducto(int id) {
        String sql = "UPDATE producto set estado = 0 WHERE idProducto=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El producto ha sido eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

        }
    }
}
