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
        Producto arroz = new Producto(111, "azucar", "morena", 123, 50, true);
        ProductoData pro = new ProductoData(con);

//        pro.agregarProducto(arroz);
        
        //////metodo eliminarProducto////// 
              //  pro.eliminarProducto(333);
        
        //////metodo modificarProducto////// 
             //   pro.modificarProducto(arroz);
        
        //////metodo obtenerProducto////// 
              Producto obtenerProducto =pro.obtenerProducto(111);
               if (obtenerProducto!=null) {    
        System.out.println("nombreProducto " + obtenerProducto.getNombreProducto());
        System.out.println("descripcion "+ obtenerProducto.getDescripcion());
        }
              
        //Alumno alumnoEncontrado=alu.buscarAlumno(1);
//        if (alumnoEncontrado!=null) {    
//        System.out.println("DNI "+ alumnoEncontrado.getDni());
//        System.out.println("Apellido "+alumnoEncontrado.getApellido());
//        }
              
              
    }
}
