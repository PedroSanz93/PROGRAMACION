
package Practica_09_Clases;

import java.util.Scanner;


public class ProgramaTiendaRopa {

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        
        // Creo objetos de los productos como ejemplos que "Estarian" almacenados en una base de datos donde el empleado puede consultar la disponibilad
        Camiseta c1 = new Camiseta(1, 10, 1, 2023, "Nike"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        c1.setTalla("M");  
        c1.setColor("BLANCO"); 
        Camiseta c2 = new Camiseta(1, 19.9, 1, 2023, "Adidas"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        c2.setTalla("M");
        c2.setColor("NEGRO");
        Camiseta c3 = new Camiseta(1, 25.99, 2, 2022, "Ellesse"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        c3.setTalla("M");
        c3.setColor("ROJO");                            
        
        Pantalon p1 = new Pantalon(1, 39.9, 15, 2023,"Levis"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        p1.setTalla(34);
        p1.setColor("Vaquero Claro");
        Pantalon p2 = new Pantalon(1, 59.9, 9, 2022, "Guchy"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        p2.setTalla(36);
        p2.setColor("Negro");
        Pantalon p3 = new Pantalon(1, 19.9, 10, 2022, "Grimey"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        p3.setTalla(40);
        p3.setColor("Vaquero Clasico"); 
        
        Zapatillas z1 = new Zapatillas(1, 259.9, 521, 2019, "Air Jordan"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        z1.setTalla(42);
        z1.setColor("ROJO/NEGRO");
        Zapatillas z2 = new Zapatillas(1, 179.9, 519, 2021, "Nike Air Max"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        z2.setTalla(43);
        z2.setColor("BLANCO");
        Zapatillas z3 = new Zapatillas(1, 599.9, 505, 2018, "Reebook Pump"); // los atributos heredados de las subclase y superclase
        // atributos propios de camiseta los llamo desde el metodo propio de la clase
        z3.setTalla(45);
        z3.setColor("NEGRA/BLANCA");
        
        int opcion=1;
        
        while(opcion!=3){
            System.out.println("--------<<Bienvenido a TiendaRopa>>--------");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Este es el punto de acceso para la gestion de inventario del almacen");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Opcion 1: Mostrar Inventario");
            System.out.println("Opcion 2: Agregar un Producto");
            System.out.println("Opcion 3: Salir de Gestion de inventario");
            opcion=sc.nextInt();
            switch(opcion){
                
                case 1:
                System.out.println("Accediendo al almacen...");
                System.out.println(" ");
                System.out.println("Las existencias disponibles son: ");
                System.out.println("Camisetas disponibles: ");
                c1.DatosProducto();
                c2.DatosProducto();
                c3.DatosProducto();
                System.out.println("Pantalones Disponibles: ");
                p1.DatosProducto();
                p2.DatosProducto();
                p3.DatosProducto();
                System.out.println("Zapatillas disponibles: ");
                z1.DatosProducto();
                z2.DatosProducto();
                z3.DatosProducto();
                break;
                case 2:
                //Camiseta cNueva = new Camiseta(sc.nextInt(), sc.nextDouble(),sc.nextInt() , sc.nextInt(), sc.nextLine());
                System.out.println("Introduce un nuevo producto");
                
                int opcionProd=1;
                while(opcionProd!=3){
                    
                    switch(opcionProd){
                        case 1:
                        System.out.println("Producto/Camiseta");
                        Camiseta cNueva;
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("PRECIO: ");
                        double precioN=sc.nextDouble();
                        cNueva.precio(precioN);
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("CODIGO DEL MATERIAL");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("FECHA DE LA COLECCION");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("MARCA: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        
                        System.out.println("---------------------------------------------------------------------");                       
                            
                        break;
                        case 2:
                        System.out.println("Producto/Pantalon");
                                                System.out.println("IDTIENDA: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("PRECIO: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("CODIGO DEL MATERIAL");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("FECHA DE LA COLECCION");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("MARCA: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        
                        System.out.println("---------------------------------------------------------------------");  
                        break;
                        case 3:
                        System.out.println("Producto/Zapatillas");
                                                System.out.println("IDTIENDA: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("PRECIO: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("CODIGO DEL MATERIAL");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("FECHA DE LA COLECCION");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("MARCA: ");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        
                        System.out.println("---------------------------------------------------------------------");  
                        break;
                        
                        default:
                        System.err.println("OPCION INCORRECTA");
                        break;
                    }
                    
                }
                    
                break;
                case 3:
                System.out.println("Saliendo de Gestion de inventario");
                break;
                default:
                System.err.println("Introduce opcion correcta");
                break;    
                
            }
                
  
        }

        
    }
}
