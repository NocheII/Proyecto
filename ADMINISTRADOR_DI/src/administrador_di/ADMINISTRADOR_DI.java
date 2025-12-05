/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package administrador_di;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class ADMINISTRADOR_DI {
    final static String CONTRASEÑA = "12345";
    final static String ADMIN = "ADMIN";
    final static String CONTRAEMP = "54321";
    final static String EMP = "EMPLEADO";
    static int SESION = 0;
    final static String Productos [] = new String [10];
    final static int ProductosCant [] = new int [10];
    static int totalProductos = 0;
    final static double Precios [] = new double [10];
    static double Ganancia = 0;
    static int Ventas = 0;
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inicioSesion();
        int opcion;
        if (SESION == 1){
            System.out.println("Sistema de gestion de ventas RED-CODE");
            System.out.println("Bienvenido Administrador");
            Inventario();
            do{
                imprimirMenu();
                opcion = input.nextInt();
                if (opcion == 1){
                    verInventario();
                }else if(opcion == 2){
                    agregaralInventario();
                }else if(opcion == 3){
                    modificarArticulo();
                }else if(opcion == 4){
                    eliminarArticulo();
                }else if(opcion == 5){
                    añadirExistencias();
                }else if(opcion == 6){
                    ventas();
                }else if (opcion == 7){
                    Ganancias();
                }else if (opcion == -1){
                    break;
                }else{
                    System.out.println("Opcion no valida, intente de nuevo");
                    System.out.println("---------------------------------------------");
                }
            }while(opcion != 8);
        }else if(SESION == 2){
            System.out.println("Sistema de gestion de ventas RED-CODE");
            System.out.println("Bienvenido Empleado");
            Inventario();
            do{
                imprimirMenu();
                opcion = input.nextInt();
                if (opcion == 1){
                    verInventario();
                }else if (opcion == -1){
                    break;
                }else{
                    System.out.println("Opcion no valida, intente de nuevo");
                    System.out.println("---------------------------------------------");
                }
            }while(opcion != 2);
        }
    }
    public static void inicioSesion(){
        String Usuario;
        String Contra;
        do{
            System.out.println ("Usuario: ");
            Usuario = input.nextLine();

            System.out.println ("Contraseña: ");
            Contra = input.nextLine();
            
            if (Usuario.equals(ADMIN)&& Contra.equals(CONTRASEÑA)){
                System.out.println ("Acceso concedido");
                SESION += 1;
                System.out.println("---------------------------------------------");
            }else if (Usuario.equals(EMP)&& Contra.equals(CONTRAEMP)){
                System.out.println ("Acceso concedido");
                SESION += 2;
                System.out.println("---------------------------------------------");
            }else{
                System.out.println ("Acceso denegado");
                System.out.println("---------------------------------------------");
            }
        }while(!(Usuario.equals(ADMIN)&& Contra.equals(CONTRASEÑA)) && !(Usuario.equals(EMP)&& Contra.equals(CONTRAEMP)));
    }
    
    public static void Inventario(){
        
        Productos [0] = "Kitkat";
        Productos [1] = "Snickers";
        Productos [2] = "Mazapan";
        Productos [3] = "Panditas";
        Productos [4] = "vacio";
        Productos [5] = "vacio";
        Productos [6] = "vacio";
        Productos [7] = "vacio";
        Productos [8] = "vacio";
        Productos [9] = "vacio";
        
        for(int i = 0; i < Productos.length; i++){
            if(Productos[i].equals("vacio")){
                break;
            }else{
                totalProductos += 1;
            }
        }
        
        ProductosCant[0] = 20;
        ProductosCant[1] = 37;
        ProductosCant[2] = 15;
        ProductosCant[3] = 16;
        ProductosCant[4] = 0;
        ProductosCant[5] = 0;
        ProductosCant[6] = 0;
        ProductosCant[7] = 0;
        ProductosCant[8] = 0;
        ProductosCant[9] = 0;
       
        
        Precios[0] = 27.96;
        Precios[1] = 26.83;
        Precios[2] = 32.39;
        Precios[3] = 21.54;
        Precios[4] = 0;
        Precios[5] = 0;
        Precios[6] = 0;
        Precios[7] = 0;
        Precios[8] = 0;
        Precios[9] = 0;
        
    }
    public static void Ganancias(){
        System.out.println("Las ganancias totales han sido de : $" + Ganancia);
        System.out.println("Las ventas totales han sido de : " + Ventas);
        System.out.println("---------------------------------------------");
    }
    
    public static void imprimirMenu (){
        if (SESION == 1){
            System.out.println("Que desea ver o gestionar? (introduzca el numero)");
            System.out.println("1- Ver inventario");
            System.out.println("2- Agregar al inventario");
            System.out.println("3- Modificar articulo");
            System.out.println("4- Eliminar articulo");
            System.out.println("5- Agregar existencias");
            System.out.println("6- Ventas");
            System.out.println("7- Ganancias");
            System.out.println("-1 - Salir");
            System.out.println("---------------------------------------------");
        }else if(SESION == 2){
            System.out.println("Que desea ver? (introduzca el numero)");
            System.out.println("1- Ver inventario");
            System.out.println("-1 - Salir");
            System.out.println("---------------------------------------------");
        }
    }
    

    
    public static void agregaralInventario (){
        String nomProd;
        int opcion, cantProd;
        double precioPro;
        do{
            input.nextLine();
            System.out.println ("En existencia: ");
            productosAgregados ();
            System.out.println ("Introduzca el nombre del producto: ");
            nomProd = input.nextLine();
            System.out.println ("Introduzca la cantidad del producto nuevo agregado (Piezas): ");
            cantProd = input.nextInt();
            System.out.println ("Introduzca el precio del producto nuevo agregado: ");
            precioPro = input.nextDouble();
            Productos [totalProductos] = nomProd;
            ProductosCant [totalProductos] = cantProd;
            Precios [totalProductos] = precioPro;
            totalProductos += 1;
            System.out.println ("Producto agregado!!");
            System.out.println("---------------------------------------------");
            System.out.println ("-1 - Salir");
            System.out.println ("1 - Agregar otro producto");
            opcion = input.nextInt();

            if(opcion == -1){
                return;
            }
        }while(opcion != -1);
        
    }
    
    public static void modificarArticulo (){
        String nomProd;
        int cantProd, opcion;
        double precioPro;
        do{
            System.out.println ("En existencia: ");
            productosAgregados ();
            System.out.println ("-1 - Salir");
            System.out.println ("Que articulo desea modificar?: ");
            opcion = input.nextInt();

            if(opcion == -1){
                return;
            }
                if(opcion-1 < Productos.length && !Productos[opcion-1].equals("vacio")){
                    input.nextLine();
                    System.out.println ("Introduzca el nuevo nombre del producto: ");
                    nomProd = input.nextLine();
                    System.out.println ("Introduzca la nueva cantidad del producto nuevo agregado (Piezas): ");
                    cantProd = input.nextInt();
                    System.out.println ("Introduzca el precio nuevo del producto nuevo agregado: ");
                    precioPro = input.nextDouble();
                    Productos [opcion-1] = nomProd;
                    ProductosCant [opcion-1] = cantProd;
                    Precios [opcion-1] = precioPro;
                    System.out.println ("Producto modificado!!");
                    System.out.println("---------------------------------------------");
                }
        }while(opcion != -1);
    }
    
    public static void eliminarArticulo (){
        int opcion, MoverCant;
        String MoverPro;
        double MoverPre;
        do{
            System.out.println ("En existencia: ");
            productosAgregados ();
            System.out.println ("-1 - Salir");
            System.out.println ("Que articulo desea eliminar?: ");
            opcion = input.nextInt();

            if(opcion == -1){
                return;
            }
            if(opcion-1 < Productos.length && !Productos[opcion-1].equals("vacio")){
                Productos [opcion-1] = "vacio";
                ProductosCant [opcion-1] = 0;
                Precios [opcion-1] = 0;
                System.out.println ("Producto eliminado!!");
                System.out.println("---------------------------------------------");
            }
            for(int i = 0; i < Productos.length - 1; i++){
                if(Productos[i].equals("vacio") && !Productos[i+1].equals("vacio")){
                    MoverPro = Productos[i+1];
                    MoverCant = ProductosCant[i+1];
                    MoverPre = Precios[i+1];
                    Productos[i] = MoverPro;
                    ProductosCant[i] = MoverCant;
                    Precios[i] = MoverPre;
                    Productos[i+1] = "vacio";
                    ProductosCant[i+1] = 0;
                    Precios[i+1] = 0;
                }
            }   
                
        }while(opcion != -1);
    }
    
    public static void productosAgregados (){
        for(int i = 0; i < Productos.length; i++){
            if (Productos[i].equals("vacio")){
                break;
            }
            System.out.println (i + 1 + " - " + Productos [i] + " | Cantidad: " + ProductosCant [i] + " | precio: $" + Precios[i]);
        }
    }
    
    
    public static void verInventario (){
        System.out.println ("En existencia: ");
        productosAgregados ();
        System.out.println("---------------------------------------------");
        
    }
    public static void añadirExistencias(){
        int opcion, rellenar;
        do{
            System.out.println ("En existencia: ");
            productosAgregados ();
            System.out.println ("-1 - Salir");
            System.out.println ("A cual producto desea agregar: ");
            opcion = input.nextInt();

            if(opcion == -1){
                return;
            }

                System.out.println ("Cuantos desea añadir: ");
                rellenar = input.nextInt();

                if(opcion-1 < Productos.length && !Productos[opcion-1].equals("vacio")){
                    if(rellenar >= 0){
                        ProductosCant[opcion-1] += rellenar;
                        System.out.println ("Existencias agregadas!!");
                        System.out.println("---------------------------------------------");
                    }else{
                        System.out.println ("No se puede hacer esta accion");
                        System.out.println("---------------------------------------------");
                    }
                }
        }while(opcion != -1);  
    }
    public static void ventas(){
        int opcion;
        int venta;
        double precio;
        do{
            System.out.println ("En existencia: ");
            productosAgregados ();
            System.out.println ("-1 - Salir");
            System.out.println ("Cual producto se vendio: ");
            opcion = input.nextInt();

            if(opcion == -1){
                break;
            }

            if(opcion-1 < Productos.length && !Productos[opcion-1].equals("vacio")){
                System.out.println ("Cuantas? (Piezas): ");
                venta = input.nextInt();
                if(ProductosCant[opcion-1] > venta){
                    ProductosCant[opcion-1] -= venta;
                    precio = Precios[opcion-1];
                    Ganancia += precio * venta;
                    Ventas += venta;
                    System.out.println ("Venta registrada!!");
                    System.out.println("---------------------------------------------");
                }else if (ProductosCant[opcion-1] == venta){
                    ProductosCant[opcion-1] -= venta;
                    precio = Precios[opcion-1];
                    Ganancia += precio * venta;
                    Ventas += venta;
                    System.out.println ("No hay existencias!!, Agregue mas");
                    System.out.println("---------------------------------------------");
                }else{
                    System.out.println ("No hay suficientes exitencias!!");
                    System.out.println("---------------------------------------------");
                }
            }else{
                System.out.println ("Opcion no valida");
                System.out.println("---------------------------------------------");
            }
        }while(opcion != -1);

    }
}