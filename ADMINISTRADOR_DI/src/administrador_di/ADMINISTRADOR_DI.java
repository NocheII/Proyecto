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
    final static String ADMIN = "ALEJANDRO";
    final static String Chocolates [] = new String [10];
    final static int chocoCant [] = new int [10];
    final static double Precios [] = new double [10];
    static double Ganancia = 0;
    static int Ventas = 0;
    final static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicioSesion();
        int opcion;
        System.out.println("Sistema de gestion de ventas RED-CODE");
        Inventario();
        do{
            imprimirMenu();
            opcion = input.nextInt();
            if (opcion == 1){
                verExistencias();
            }else if(opcion == 2){
                añadirExistencias();
            }else if(opcion == 3){
                ventas();
            }else if(opcion == 4){
                Ganancias();
            }else if (opcion == 5){
                break;
            }else{
                System.out.println("Opcion no valida, intente de nuevo");
                System.out.println("---------------------------------------------");
            }
        }while(opcion != 5);
        
        // TODO code application logic here
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
                System.out.println("---------------------------------------------");
            }else{
                System.out.println ("Acceso denegado");
                System.out.println("---------------------------------------------");
            }
        }while(!(Usuario.equals(ADMIN)&& Contra.equals(CONTRASEÑA)));
    }
    
    public static void Inventario(){
        Chocolates [0] = "Kitkat";
        Chocolates [1] = "Snickers";
        Chocolates [2] = "Milkyway";
        Chocolates [3] = "Nugs";
        Chocolates [4] = "Hershey's";
        
        chocoCant[0] = 20;
        chocoCant[1] = 37;
        chocoCant[2] = 15;
        chocoCant[3] = 16;
        chocoCant[4] = 20;
        
        Precios[0] = 27.96;
        Precios[1] = 26.83;
        Precios[2] = 32.39;
        Precios[3] = 21.54;
        Precios[4] = 25.78;
    }
    public static void Ganancias(){
        System.out.println("Las ganancias totales han sido de :" + Ganancia);
        System.out.println("Las ventas totales han sido de :" + Ventas);
        System.out.println("---------------------------------------------");
    }
    
    public static void imprimirMenu (){
        System.out.println("Que desea ver o gestionar? (introduzca el numero)");
        System.out.println("1- Ver o agregar existencias");
        System.out.println("2- Agregar existencias");
        System.out.println("3- Ventas");
        System.out.println("4- Ganancias");
        System.out.println("5- Salir");
        System.out.println("---------------------------------------------");
    }
    
    public static void verExistencias (){
        String decision;
        input.nextLine();
        System.out.println ("En existencia: ");
        System.out.println (Chocolates [0] + " | Cantidad: " + chocoCant [0]);
        System.out.println (Chocolates [1] + " | Cantidad: " + chocoCant [1]);
        System.out.println (Chocolates [2] + " | Cantidad: " + chocoCant [2]);
        System.out.println (Chocolates [3] + " | Cantidad: " + chocoCant [3]);
        System.out.println (Chocolates [4] + " | Cantidad: " + chocoCant [4]);
        System.out.println ("Deseas agregar mas existencias?: (y/n)");
        decision = input.nextLine();
        if(decision.equals("y")){
            añadirExistencias();
        }
        System.out.println("---------------------------------------------");
        
    }
    public static void añadirExistencias(){
        int opcion, rellenar;
        System.out.println ("En existencia: ");
        System.out.println ("1- " + Chocolates [0] + " | Cantidad: " + chocoCant [0]);
        System.out.println ("2- " + Chocolates [1] + " | Cantidad: " + chocoCant [1]);
        System.out.println ("3- " + Chocolates [2] + " | Cantidad: " + chocoCant [2]);
        System.out.println ("4- " + Chocolates [3] + " | Cantidad: " + chocoCant [3]);
        System.out.println ("5- " + Chocolates [4] + " | Cantidad: " + chocoCant [4]);
        System.out.println ("6- Salir");
        System.out.println ("Cual chocolate desea agregar: ");
        opcion = input.nextInt();
        if(opcion == 1){
            System.out.println ("Cuantos desea añadir: ");
            rellenar = input.nextInt();
            chocoCant[0] += rellenar;
        }else if(opcion == 2){
            System.out.println ("Cuantos desea añadir: ");
            rellenar = input.nextInt();
            chocoCant[1] += rellenar;
        }else if(opcion == 3){
            System.out.println ("Cuantos desea añadir: ");
            rellenar = input.nextInt();
            chocoCant[2] += rellenar;
        }else if(opcion == 4){
            System.out.println ("Cuantos desea añadir: ");
            rellenar = input.nextInt();
            chocoCant[3] += rellenar;
        }else if(opcion == 5){
            System.out.println ("Cuantos desea añadir: ");
            rellenar = input.nextInt();
            chocoCant[4] += rellenar;
        }else{
            
        }
        
        
    }
    public static void ventas(){
        int opcion, venta;
        double precio;
        System.out.println ("En existencia: ");
        System.out.println ("1- " + Chocolates [0] + " | Cantidad: " + chocoCant [0] + " | precio: " + Precios[0] + "$");
        System.out.println ("2- " + Chocolates [1] + " | Cantidad: " + chocoCant [1] + " | precio: " + Precios[1] + "$");
        System.out.println ("3- " + Chocolates [2] + " | Cantidad: " + chocoCant [2] + " | precio: " + Precios[2] + "$");
        System.out.println ("4- " + Chocolates [3] + " | Cantidad: " + chocoCant [3] + " | precio: " + Precios[3] + "$");
        System.out.println ("5- " + Chocolates [4] + " | Cantidad: " + chocoCant [4] + " | precio: " + Precios[4] + "$");
        System.out.println ("6- Salir");
        System.out.println ("Cual chocolate se vendio: ");
        opcion = input.nextInt();
        if(opcion == 1){
            System.out.println ("Cuantos?: ");
            venta = input.nextInt();
            chocoCant[0] -= venta;
            precio = Precios[0];
            Ganancia += precio;
            Ventas += 1;
            if(chocoCant[0] == 0){
                System.out.println ("Sin existencias, vuelva a rellenar");
            }
        }else if(opcion == 2){
            System.out.println ("Cuantos?: ");
            venta = input.nextInt();
            chocoCant[1] -= venta;
            precio = Precios[0];
            Ganancia += precio;
            Ventas += 1;
            if(chocoCant[0] == 0){
                System.out.println ("Sin existencias, vuelva a rellenar");
            }
        }else if(opcion == 3){
            System.out.println ("Cuantos?: ");
            venta = input.nextInt();
            chocoCant[2] -= venta;
            precio = Precios[0];
            Ganancia += precio;
            Ventas += 1;
            if(chocoCant[0] == 0){
                System.out.println ("Sin existencias, vuelva a rellenar");
            }
        }else if(opcion == 4){
            System.out.println ("Cuantos?: ");
            venta = input.nextInt();
            chocoCant[3] -= venta;
            precio = Precios[0];
            Ganancia += precio;
            Ventas += 1;
            if(chocoCant[0] == 0){
                System.out.println ("Sin existencias, vuelva a rellenar");
            }
        }else if(opcion == 5){
            System.out.println ("Cuantos?: ");
            venta = input.nextInt();
            chocoCant[4] -= venta;
            precio = Precios[0];
            Ganancia += precio;
            Ventas += 1;
            if(chocoCant[0] == 0){
                System.out.println ("Sin existencias, vuelva a rellenar");
            }
        }else{
            
        }
    }
}
