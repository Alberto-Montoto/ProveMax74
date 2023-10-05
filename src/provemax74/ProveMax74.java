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
              
          Proveedor prove=new Proveedor(1,"Wachoski","Electro Mayor","Juan B Justo","011123456");
          ProveedorData proveData=new ProveedorData();
          
          //proveData.guardarProveedor(prove);
          
          proveData.modificarProveedor(prove);
          
          proveData.eliminarProveedor(1);
          
          
        

        
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

