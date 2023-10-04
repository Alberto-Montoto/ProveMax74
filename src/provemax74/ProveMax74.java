package provemax74;

import org.mariadb.jdbc.Connection;
import provemax74.AccesoADatos.Conexion;
import provemax74.AccesoADatos.ProductoData;
import provemax74.Entidades.Producto;

public class ProveMax74 {

    public static void main(String[] args) {
        // TODO code application logic here

        Connection con = Conexion.getConexion();
        
        //////metodo agregarProducto//////
//                                   idpro/nombrePro/descripcion/precioAct/Stok/estado
        Producto arroz = new Producto(333, "azucar", "morena", 1000, 50, true);
        ProductoData pro = new ProductoData(con);

        pro.agregarProducto(arroz);
    }
}
