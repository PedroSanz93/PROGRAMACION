package Practica_09_Clases;

import java.util.ArrayList;
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
        
        while(opcion!=4){
            System.out.println("--------<<Bienvenido a TiendaRopa>>--------");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Este es el punto de acceso para la gestion de inventario del almacen");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Opcion 1: Mostrar Inventario");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Opcion 2: Agregar un Producto");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Opcion 3: Comprar producto");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Opcion 4: Salir de Gestion de inventario");
            System.out.println("---------------------------------------------------------------------");
            opcion=sc.nextInt();
            switch(opcion){
                
                case 1:
                System.out.println("Accediendo al almacen...");
                System.out.println(" ");
                System.out.println("Las existencias disponibles son: ");
                System.out.println("Camisetas disponibles: ");
                System.out.println(c1.toString());
                System.out.println(c2.toString());
                System.out.println(c3.toString());
                System.out.println("Pantalones Disponibles: ");
                System.out.println(p1.toString());
                System.out.println(p2.toString());
                System.out.println(p3.toString());
                System.out.println("Zapatillas disponibles: ");
                System.out.println(z1.toString());
                System.out.println(z2.toString());
                System.out.println(z3.toString());
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
                        // Al haber estado metiendo valores enteros por teclado hay que meter un Scanner vacio
                        // Para limpiar cache del Scanner y empezar a meter valores String
                        sc.nextLine();
                        String marcaA=sc.nextLine();               
                        Camiseta cNueva = new Camiseta(1, precioA, materialA, fechaA, marcaA);
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        String tallaA=sc.nextLine();
                        cNueva.setTalla(tallaA);
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        String colorA=sc.nextLine();
                        cNueva.setColor(colorA);
                        System.out.println("---------------------------------------------------------------------"); 
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
                        sc.nextLine(); // limpia cache de Scanner
                        String marcaB=sc.nextLine();
                        Pantalon pNuevo = new Pantalon(1, precioB, materialB, fechaB, marcaB);
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        int tallaB=sc.nextInt();
                        pNuevo.setTalla(tallaB);
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        sc.nextLine(); // limpia cache de Scanner
                        String colorB=sc.nextLine();
                        pNuevo.setColor(colorB);
                        System.out.println("---------------------------------------------------------------------");  
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
                        sc.nextLine(); // limpia cache de Scanner
                        String marcaC=sc.nextLine();
                        Zapatillas zNuevas = new Zapatillas(1, precioC, materialC, fechaC, marcaC);
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("TALLA: ");
                        int tallaC=sc.nextInt();
                        zNuevas.setTalla(tallaC);
                        System.out.println("---------------------------------------------------------------------");    
                        System.out.println("COLOR: ");
                        sc.nextLine(); // limpia cache de Scanner
                        String colorC=sc.nextLine();
                        zNuevas.setColor(colorC);
                        System.out.println("---------------------------------------------------------------------"); 
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
                // creo una lista usando la herramienta ArrayList donde voy a guardad los objetos del inventario creado antes
                // El ArrayList va a ser del tipo TiendaRopa puesto que es la SuperClase de los objetos que se van guardar ahi
                ArrayList<TiendaRopa> inventario = new ArrayList<>(); 
                // Aqui meto todos los objetos de camiseta a la lista de Array
                inventario.add(c1);
                inventario.add(c2);    
                inventario.add(c3);    
                // Aqui meto todos los objetos de pantalon a la lista de Array
                inventario.add(p1);
                inventario.add(p2);
                inventario.add(p3);
                // Aqui meto todos los objetos de zapatillas a la lista de Array
                inventario.add(z1);
                inventario.add(z2);
                inventario.add(z3);
                
                System.out.println("Selecciona un producto de la lista para agregar al carrito de la compra");
                // En este FOR EACH, creo una variable tipo Objeto que se llama producto que va a recorrer el Array Inventario 
                // y va a ir valiendo lo que valga cada objeto del inventario por ejemplo en la posicion 1 valdra c1
                
                // Deeclaro una variable contador para que vaya contando las posiciones del Array donde estaran los productos
                // Y el cliente pueda seleccionar por el numero en el que este el contador el producto que es
                
                int contador=1;
                for(Object producto : inventario){
                    // en este sout muestra posicion del contador y producto que es con los datos de todos los atributos
                    System.out.println(contador+".Producto-> "+producto.toString());
                    // va aumentando de uno en uno
                    contador++;
                }
                
                System.out.println("Cuantos productos vas a comprar");
                int numProductos=sc.nextInt();
                
                ArrayList<TiendaRopa> carritoCompra = new ArrayList<>(); 
                
                for(int i=0;i<numProductos;i++){
                    System.out.println("Selecciona que producto quieres");
                    int prodElegido=sc.nextInt();
                    // carritoCompra es la lista vacia con el .add vamos a añadir un producto 
                    // y ahora para añadir el producto busca en el ArrayList inventario la posicion guardada en prodElegido
                    // y resto -1 porque el Array empieza en 0 y el contador empieza en 1
                    carritoCompra.add(inventario.get(prodElegido-1));
                }
                
                System.out.println("Los productos elegidos son: ");
                // en la variable precioCompra se va a guardar el total del precio de los productos elegidos
                double precioCompra=0; 
                // con este FOR EACH se obtienen 2 cosas
                // 1º imprimo todos los productos seleccionados que se han guardado en carritoCompra
                // 2º y obtengo los precios de cada producto y los sumo guardandolos en precioCompra
                for(TiendaRopa producto : carritoCompra){
                    System.out.println(producto.toString());
                    // en esta operacion obtengo el precio del producto y lo sumo a lo que valgaprecio compra
                    // en la primera vez valdra 0 y despues va guardado la suma los productos seleccionados
                    precioCompra+=producto.getPrecio();
                    
                }
                System.out.println("Total: "+precioCompra);
                // aqui igualo la opcion del while a 4 para que salga del bucle, controlando de esta manera la salida del switch y el bucle
                opcion=4;
                
                break;
                
                case 4:
                    
                System.out.println("Saliendo de Gestion de inventario");
                break;
                
                default:
                System.err.println("Introduce opcion correcta");
                break;        
            }
        } 
    }
}
