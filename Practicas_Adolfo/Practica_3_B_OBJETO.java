
package Practicas_Adolfo;

import Practicas_Adolfo.Practica_3_B_CLASE;
// Importo la clase previamente creada para las operaciones de la calculadora
import java.util.Scanner;

public class Practica_3_B_OBJETO {

    public static void main(String[] args) {
    // He reutilizado parte del codigo de la APP creada con funciones para hacer esta version con Clases y objetos
        Scanner sc;
        sc =new Scanner(System.in);
        // Entrada de datos del Scanner
        int opcion=0;
        // Declaro variable opcion para elegir en el Switch que opcion queremos y cada opcion seria una operacion
        while(opcion!=4){
        // Meto un While para poder seguir operando mas de una vez
        System.out.println("Bienvenido a la calculadora");
        System.out.println("***************************");
        // Salida por pantalla de la presentacion de la calculadora en el Switch
        System.out.println("Introduce 0 para SUMA");
        System.out.println("Introduce 1 para RESTA");
        System.out.println("Introduce 2 para MULTIPLICACION");
        System.out.println("Introduce 3 para DIVIDIR");
        System.out.println("Introduce 4 para SALIR de la calculadora");
        opcion=sc.nextInt();
        // Entrada de la opcion que queremos para hacer operacion
        System.out.println("***************************");
         
        // Entrada de dos numeros Double con los que quiero operar
            switch (opcion){
        // Para elegir operaciones meto un Switch    
            case 0:
                Practica_3_B_CLASE suma = new Practica_3_B_CLASE("suma"); // constructor de la operacion suma
                System.out.println("Introduce el Primer Numero");
                double a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                double b = sc.nextDouble();
                suma.setSuma(a, b);
                System.out.println("El resultado de la suma es: "+suma.getSuma()); 
                // en el caso 0 en la salida por pantalla llamo a la funcion suma de la clase con los 2 numeros para operar
                break; // break para saltar de opcion
            case 1:
                Practica_3_B_CLASE resta = new Practica_3_B_CLASE("resta"); // constructor de la operacion resta
                System.out.println("Introduce el Primer Numero");
                a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                b = sc.nextDouble(); 
                resta.setResta(a, b);
                System.out.println("El resultado de la RESTA es: "+resta.getResta()); 
                // en el caso 1 en la salida por pantalla llamo a la funcion resta de la clase con los 2 numeros para operar
                break; // break para saltar de opcion
            case 2:
                Practica_3_B_CLASE producto = new Practica_3_B_CLASE("producto");// constructor de la operacion multiplicacion
                System.out.println("Introduce el Primer Numero");
                a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                b = sc.nextDouble(); 
                producto.setProducto(a, b);
                System.out.println("El resultado de la MULTIPLICACION es: "+producto.getProducto()); 
                // en el caso 2 en la salida por pantalla llamo a la funcion prodcuto de la clase con los 2 numeros para operar
                break; // break para saltar de opcion
            case 3: 
                Practica_3_B_CLASE division = new Practica_3_B_CLASE("division"); // constructor de la operacion division
                System.out.println("Introduce el Primer Numero");
                a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                b = sc.nextDouble();
                division.setDivision(a, b);
                System.out.println("El resultado de la DIVISION es: "+division.getDivision()); 
                // en el caso 3 en la salida por pantalla llamo a la funcion division de la clase con los 2 numeros para operar
                break; // break para saltar de opcion
            case 4:
                System.out.println("Saliendo de la Calculadora"); // Mensaje de salir de la calculadora
                break;
            default:
                System.err.println("ERROR introduce una opcion correcta"); // salida del programa para el default
                break; // break para saltar de opcion
            }
        }
    }
}