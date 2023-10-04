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
        Producto arroz = new Producto(333, "azucar", "morena", 123, 50, true);
        ProductoData pro = new ProductoData(con);

//        pro.agregarProducto(arroz);
        
        //////metodo eliminarProducto////// 
              //  pro.eliminarProducto(333);
        
        //////metodo modificarProducto////// 
              pro.modificarProducto(arroz);
        
        
    }
}
        //Alumno mariana=new Alumno(6,43253000,"Gonzalez","Mario",LocalDate.of(2010, 3, 15),true);
        // AlumnoData alu = new AlumnoData();
        //alu.guardarAlumno(mariana);
        //alu.modificarAlumno(mariana);
        //alu.eliminarAlumno(3);