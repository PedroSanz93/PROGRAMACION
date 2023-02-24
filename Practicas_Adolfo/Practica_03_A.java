
package Practicas_Adolfo;
import java.util.Scanner;
// importo la clase Scanner
public class Practica_03_A {
    static double sumaCalculadora (double a , double b) // creo una funcion para la suma de 2 valores Double
    {             // indica que la funcion retorna un numero Double (Con decimales)  
        double suma = a+b; // variable que guarda la operacion para la suma
        return suma; // lo que va a retornar de la funcion seria la suma
    } 
    static double restaCalculadora (double a , double b) // creo una funcion para la resta de 2 valores Double
    {             // indica que la funcion retorna un numero Double (Con decimales)   
        double resta = a-b; // variable que guarda la operacion para la resta
        return resta; // lo que va a retornar de la funcion seria la resta
    }
    static double productoCalculadora (double a, double b) // creo una funcion para la multiplicacion de 2 valores Double
    {             // indica que la funcion retorna un numero Double (Con decimales)   
        double producto = a*b; // variable que guarda la operacion para la multiplicacion
        return producto; // lo que va a retornar de la funcion seria la multiplicacion
    }
    static double divisionCalculador (double a , double b) // creo una funcion para la division de 2 valores Double
    {             // indica que la funcion retorna un numero Double (Con decimales)    
        double divisor = a/b; // variable que guarda la operacion para la division
        return divisor; // lo que va a retornar de la funcion seria la division
    }
    public static void main(String[] args) {
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
                System.out.println("Introduce el Primer Numero");
                double a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                double b = sc.nextDouble(); 
                System.out.println("El resultado de la suma es: "+sumaCalculadora(a,b)); // en el caso 0 en la salida por pantalla llamo a la funcion de suma con los 2 numeros para operar
                break; // break para saltar de opcion
            case 1:
                System.out.println("Introduce el Primer Numero");
                a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                b = sc.nextDouble(); 
                System.out.println("El resultado de la RESTA es: "+restaCalculadora(a,b)); // en el caso 1 en la salida por pantalla llamo a la funcion de resta con los 2 numeros para operar
                break; // break para saltar de opcion
            case 2:
                System.out.println("Introduce el Primer Numero");
                a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                b = sc.nextDouble(); 
                System.out.println("El resultado de la MULTIPLICACION es: "+productoCalculadora(a,b)); // en el caso 2 en la salida por pantalla llamo a la funcion de multiplicacion con los 2 numeros para operar
                break; // break para saltar de opcion
            case 3: 
                System.out.println("Introduce el Primer Numero");
                a = sc.nextDouble();
                System.out.println("Introduce el Primer Numero");
                b = sc.nextDouble(); 
                System.out.println("El resultado de la DIVISION es: "+divisionCalculador(a,b)); // en el caso 3 en la salida por pantalla llamo a la funcion de division con los 2 numeros para operar
                break; // break para saltar de opcion
            case 4:
                System.out.println("Saliendo de la Calculadora");
                break;
            default:
                System.err.println("ERROR introduce una opcion correcta"); // salida del programa para el default
                break; // break para saltar de opcion
            }
        }
    }
}