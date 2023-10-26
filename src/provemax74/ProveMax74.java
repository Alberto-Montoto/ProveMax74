package provemax74;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.mariadb.jdbc.Connection;
import provemax74.AccesoADatos.CompraData;
import provemax74.AccesoADatos.Conexion;
import provemax74.AccesoADatos.DetalleCompraData;
import provemax74.AccesoADatos.ProductoData;
import provemax74.AccesoADatos.ProveedorData;

import provemax74.Entidades.Compra;
import provemax74.Entidades.DetalleCompra;


import provemax74.Entidades.Producto;
import provemax74.Entidades.Proveedor;

public class ProveMax74 {

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Connection con = Conexion.getConexion();

        //////metodo agregarProducto//////
//                                   idpro/nombreP/descrip/precioAct/Stok/estado
//  Producto arroz = new Producto(333, "azucar", "morena", 123, 50, true);
        ProductoData pro = new ProductoData();
//        pro.agregarProducto(arroz);

        //////metodo eliminarProducto////// 
        //  pro.eliminarProducto(333);
        
        //////metodo modificarProducto////// 
//        pro.modificarProducto(arroz);


              
          //Proveedor prove=new Proveedor(1,"Wachoski","Electro Mayor","Juan B Justo","011123456");
         //ProveedorData proveData=new ProveedorData();
          
          //proveData.guardarProveedor(prove);
          
          //proveData.modificarProveedor(prove);
          
          //proveData.eliminarProveedor(1);
          
          

        //////metodo obtenerProducto////// 
//              Producto obtenerProducto =pro.obtenerProducto(111);
//               if (obtenerProducto!=null) {    
//        System.out.println("nombreProducto " + obtenerProducto.getNombreProducto());
//        System.out.println("descripcion "+ obtenerProducto.getDescripcion());
//        }

        //////metodo listarProductos////// 
//                 for (Producto producto: pro.listarProducotos()) {
//            System.out.println("idProducto: " + producto.getIdProducto());
//            System.out.println("nombreProducto: " + producto.getNombreProducto());
//            System.out.println("descripcion: " + producto.getDescripcion());
//            System.out.println("precioActual: " + producto.getPrecioActual());
//            System.out.println("stock: " + producto.getStock());
//            System.out.println("------------------------------");
//        } 

        //////metodo listarProductosStockMinimo////// 
//          int stockMinimo = 10; 
//          List<Producto> productos = pro.listarProductosStockMinimo(stockMinimo);



          ////metodo listar los productos de compra //////
//    try {
//        int idCompra = 1; // Reemplaza con el ID de la compra que deseas consultar.
//        List<Producto> productosDeCompra = pro.obtenerProductosDeCompra(idCompra);
//
//        for (Producto producto : productosDeCompra) {
//                        System.out.println("////prodcuto adquirido en la ultima compra////");
//            System.out.println("ID del Producto: " + producto.getIdProducto());
//            System.out.println("Nombre del Producto: " + producto.getNombreProducto());
//            System.out.println("Descripción: " + producto.getDescripcion());
//            System.out.println("Precio: " + producto.getPrecioActual());
//            System.out.println("Stock: " + producto.getStock());
//            System.out.println("------------------------------");
//        }
//    } catch (SQLException ex) {
//        ex.printStackTrace(); // Manejo de excepciones en caso de un error SQL.
//    }


        //////metodo listar los productos de ultima compra//////                                   dos metodos a elegir
        
//  try {
//            // Llama a obtenerIdUltimaCompra para obtener el ID de la última compra.
//            int idUltimaCompra = pro.obtenerIdUltimaCompra();
//
//            if (idUltimaCompra != -1) {
//                // Se encontró una última compra, así que obtenemos los productos de esa compra.
//                List<Producto> productosDeCompra = pro.obtenerProductosDeCompra(idUltimaCompra);
//
//                for (Producto producto : productosDeCompra) {
//                    System.out.println("Se encontró una última compra");
//                    System.out.println("ID del Producto: " + producto.getIdProducto());
//                    System.out.println("Nombre del Producto: " + producto.getNombreProducto());
//                    System.out.println("Descripción: " + producto.getDescripcion());
//                    System.out.println("Precio: " + producto.getPrecioActual());
//                    System.out.println("Stock: " + producto.getStock());
//                    System.out.println("------------------------------");
//                }
//            } else {
//                System.out.println("No se encontraron compras en la base de datos.");
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace(); // Manejo de excepciones en caso de un error SQL.
//        }

       
        ////////////////// Hasta aqui Metodos de productoData ////////////////
        
      
        
//       Proveedor prove=new Proveedor();
         ProveedorData proveData=new ProveedorData();
//          
//          //proveData.guardarProveedor(prove);
//          
//          proveData.modificarProveedor(prove);
//          
//           proveData.eliminarProveedor(1);

        //////metodo listarProveedor////// 
//        for (Proveedor proveedor : proveData.listarProveedor()) {
//            System.out.println("idProveedor: " + proveedor.getIdProveedor());
//            System.out.println("nombreCompleto: " + proveedor.getNombreCompleto());
//            System.out.println("razonSocial: " + proveedor.getRazonSocial());
//            System.out.println("domicilio: " + proveedor.getDomicilio());
//            System.out.println("telefono: " + proveedor.getTelefono());
//            System.out.println("------------------------------");
//        }
           
//        ////////////////// Hasta aqui Metodos de proveedorData ////////////////              

          //  Llamadas a metodos de DetalleCompra

        //        Producto prod = new Producto(222, "fideos", "tirabuzon", 200, 100, true); //
        
//        ProductoData proda = new ProductoData();
//        
//        ProductoData prodat = new ProductoData();
//      prodat.obtenerProducto(1);
//        
//        Producto pro = proda.obtenerProducto(1);
//        
//        DetalleCompra detalle = new DetalleCompra(2, 7, pro); //2, 56, pro.getPrecioActual(), pro.getIdProducto(), pro.getNombreProducto()
//        DetalleCompraData detalleData = new DetalleCompraData();
//        
//     detalleData.guardarDetalle(detalle);
//       detalleData.borrarDetalle(3);
//        detalleData.modificarDetalle(detalle);

//AGREGAR COMPRAS
        ProveedorData pd = new ProveedorData();
        DetalleCompraData dcd = new DetalleCompraData();
        CompraData cd = new CompraData();
//        
        Proveedor prove=pd.buscarProveedor(7);
        DetalleCompra det=dcd.buscarDetalle(501);
//        
//        
        String fechaString = "11/10/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);
//        
 //       Compra compra=new Compra(1, 111, fecha, 10, prove, det);
        
//        cd.agregarCompra(compra);
        
     
        
        //        Producto prod = new Producto(222, "fideos", "tirabuzon", 200, 100, true); //

        ProductoData prodat = new ProductoData();
//        prodat.obtenerProducto(1);

 //       Producto pro = prodat.obtenerProducto(111);

//        DetalleCompra detalle = new DetalleCompra(2, 7, pro); //2, 56, pro.getPrecioActual(), pro.getIdProducto(), pro.getNombreProducto()
        DetalleCompraData detalleData = new DetalleCompraData();

//        DetalleCompra detalle = detalleData.buscarDetalle1(6);

 //       DetalleCompra detalle = new DetalleCompra(5, 7, pro);

        Proveedor proveedor3 = new Proveedor();
        ProveedorData provedat = new ProveedorData();

//        provedat.guardarProveedor(proveedor3);

        CompraData comdat = new CompraData();

//        Compra compra = new Compra(1, proveedor3, LocalDate.now(), detalle);

//        comdat.nuevaCompra(compra);
//        comdat.eliminarCompra(23);
//        comdat.buscarCompra(1);
//        System.out.println("detalle " + comdat.buscarCompra(1).getIdCompra());
//        System.out.println("detalle " + comdat.buscarCompra(1).getFecha());
//        System.out.println("detalle " + comdat.buscarCompra(1).getProveedor());
//        System.out.println("detalle " + comdat.buscarCompra(1).getDetalleCompra().getIdDetalle());
        
//        comdat.listarCompra();
//        
//     
//        for (Compra comp: comdat.listarCompra()) {
//      
//        System.out.println("IdCompra - "+ comp.getIdCompra());
//        System.out.println("Fecha - " + comp.getFecha());
//        System.out.println("idProveedor - " + comp.getProveedor().getIdProveedor());
//        System.out.println("idDelalle - " + comp.getDetalleCompra().getIdDetalle());
//            System.out.println("-----------------");
//        }
//        
    }
    
  }
