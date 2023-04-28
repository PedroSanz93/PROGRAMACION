
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
                System.out.println("Introduce un nuevo producto");
                int opcionProd=1;
                while(opcionProd!=4){
                    System.out.println("Para agregar un nuevo producto: ");
                    System.out.println("Opcion 1: CAMISETA");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Opcion 2: PANTALON");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Opcion 3: ZAPATILLAS");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Opcion 4: VOLVER ATRAS");
                    System.out.println("---------------------------------------------------------------------");
                    opcionProd=sc.nextInt();
                    switch(opcionProd){
                        case 1: 
                        System.out.println("Producto/Camiseta");
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("PRECIO: ");
                        double precioA=sc.nextDouble();
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("CODIGO DEL MATERIAL");
                        int materialA=sc.nextInt();
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("FECHA DE LA COLECCION");
                        int fechaA=sc.nextInt();
                        
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("MARCA: ");
                        String marcaA=sc.nextLine();
                        // Aqui esta el problema, todo bien pero en el menu se salta MARCA y no deja meter el dato                     
                        Camiseta cNueva = new Camiseta(1, precioA, materialA, fechaA, marcaA);
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        String tallaA=sc.nextLine();
                        cNueva.setTalla(tallaA);
                        
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        String colorA=sc.nextLine();
                        cNueva.setColor(colorA);
                        
                        System.out.println("CAMISETA REGISTRADA EN ALMACEN");
                        break;
                        case 2:
                        System.out.println("Producto/Pantalon");
                        System.out.println("PRECIO: ");
                        double precioB=sc.nextDouble();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("CODIGO DEL MATERIAL");
                        int materialB=sc.nextInt();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("FECHA DE LA COLECCION");
                        int fechaB=sc.nextInt();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("MARCA: ");
                        String marcaB=sc.nextLine();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        int tallaB=sc.nextInt();
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        String colorB=sc.nextLine();
                        System.out.println("---------------------------------------------------------------------");  
                        Pantalon pNuevo = new Pantalon(1, precioB, materialB, fechaB, marcaB);
                        pNuevo.setTalla(tallaB);
                        pNuevo.setColor(colorB);
                        System.out.println("PANTALON REGISTRADA EN ALMACEN");
                        break;
                        case 3:
                        System.out.println("Producto/Zapatillas");
                        System.out.println("PRECIO: ");
                        double precioC=sc.nextDouble();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("CODIGO DEL MATERIAL");
                        int materialC=sc.nextInt();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("FECHA DE LA COLECCION");
                        int fechaC=sc.nextInt();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("MARCA: ");
                        String marcaC=sc.nextLine();
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        int tallaC=sc.nextInt();
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        String colorC=sc.nextLine();
                        System.out.println("---------------------------------------------------------------------");  
                        Zapatillas zNuevas = new Zapatillas(1, precioC, materialC, fechaC, marcaC);
                        zNuevas.setTalla(tallaC);
                        zNuevas.setColor(colorC);
                        System.out.println("ZAPATILLAS REGISTRADAS EN ALMACEN");
                        break;
                        case 4:
                        System.out.println("VOLVIENDO ATRAS");
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
