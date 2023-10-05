package provemax74;

import org.mariadb.jdbc.Connection;
import provemax74.AccesoADatos.Conexion;
import provemax74.AccesoADatos.ProductoData;
import provemax74.AccesoADatos.ProveedorData;
import provemax74.Entidades.Producto;
import provemax74.Entidades.Proveedor;

public class ProveMax74 {

    public static void main(String[] args) {
        // TODO code application logic here

        Connection con = Conexion.getConexion();
        
        //////metodo agregarProducto//////
//                                   idpro/nombrePro/descripcion/precioAct/Stok/estado

        Producto arroz = new Producto(111, "azucar", "morena", 123, 50, true);
        ProductoData pro = new ProductoData(con);

//        Producto arroz = new Producto(333, "azucar", "morena", 123, 50, true);
//        ProductoData pro = new ProductoData(con);


//        pro.agregarProducto(arroz);
        
        //////metodo eliminarProducto////// 
              //  pro.eliminarProducto(333);
        
        //////metodo modificarProducto////// 

             //   pro.modificarProducto(arroz);

//              pro.modificarProducto(arroz);


        //////metodo obtenerProducto////// 
//              Producto obtenerProducto =pro.obtenerProducto(111);
//               if (obtenerProducto!=null) {    
//        System.out.println("nombreProducto " + obtenerProducto.getNombreProducto());
//        System.out.println("descripcion "+ obtenerProducto.getDescripcion());
//        }
             
        //////metodo listarProductos////// 
                 for (Producto producto: pro.listarProducotos()) {
            System.out.println("idProducto: " + producto.getIdProducto());
            System.out.println("nombreProducto: " + producto.getNombreProducto());
            System.out.println("descripcion: " + producto.getDescripcion());
            System.out.println("precioActual: " + producto.getPrecioActual());
            System.out.println("stock: " + producto.getStock());
            System.out.println("------------------------------");
        }  
                 
                 //        for (Alumno alumno: alu.listarAlumnos()) {
//            System.out.println("DNI: " + alumno.getDni());
//            System.out.println("Apellido: " + alumno.getApellido());
//            System.out.println("Nombre: " + alumno.getNombre());
//            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNacimiento());
//            System.out.println("------------------------------");
//        }
              
//          Proveedor prove=new Proveedor(1,"Wachoski","Electro Mayor","Juan B Justo","011123456");
//          ProveedorData proveData=new ProveedorData();
//          
//          //proveData.guardarProveedor(prove);
//          
//          proveData.modificarProveedor(prove);
//          
//          proveData.eliminarProveedor(1);
//              
//              
    }
}

