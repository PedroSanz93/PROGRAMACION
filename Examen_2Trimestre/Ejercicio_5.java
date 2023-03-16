
package Examen_2Trimestre;

import java.util.Scanner; // clase scanner

public class Ejercicio_5 {

    static double suma(double a, double b) // declaro metodo para la suma con dos varibles tipo double
    {
        double suma=a+b; // variable que guarda el valor de la suma
        return suma; // retorno del metodo suma
    }
    static double resta(double a, double b) // declaro metodo para la resta con dos varibles tipo double
    {
        double resta=a-b; // variable que guarda el valor de la resta
        return resta; // retorno del metodo resta
    }
    static double producto(double a, double b) // declaro metodo para la multiplicacion con dos varibles tipo double
    {
        double producto=a*b; // variable que guarda el valor de la multiplicacion
        return producto; // retorno del metodo producto
    }
    static double division(double a, double b) // declaro metodo para la division con dos varibles tipo double
    {
        double division=a/b; // variable que guarda el valor de la division
        return division; // retorno del metodo division
    }

    public static void main(String[] args) {
        //clase principal
        Scanner sc;
        sc = new Scanner(System.in);
        int opcion=0;
        // variable para decidir la opcion a elegir en el switch igualado a cero
        while (opcion!=4){ // en el while para que cuando se meta una opcion incorrecta repita el bucle
            // muestra por pantalla mensaje de todas las opciones
            System.out.println("Bienvenido a la calculadora");
            System.out.println("Para suma opcion 0");
            System.out.println("Para restar opcion 1");
            System.out.println("Para multiplicar opcion 2");
            System.out.println("Para dividir opcion 3");
            System.out.println("Para salir de la calculadora opcion 4");
            opcion=sc.nextInt();
            // opcion que va a ser introducida por teclado
            switch(opcion){
                // elijo la estructura switch para que cuando elijas opcion se vaya a cada uno de los casos que van a continuacion
                case 0: //caso 0 la suma
                    System.out.println("Introduce el primer numero para hacer una SUMA");
                    double a=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("Introduce el segundo numero");
                    double b=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("El resultado es: "+suma(a,b)); 
                    // en la salida hago la llamada al metodo con las dos variables introducidas por el usuario para la suma
                    break; // para acaba opcion y volver al menu
                case 1: //caso 1 la resta
                    System.out.println("Introduce el primer numero para hacer una RESTA");
                    double c=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("Introduce el segundo numero");
                    double d=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("El resultado es: "+resta(c,d));
                    // en la salida hago la llamada al metodo con las dos variables introducidas por el usuario para la resta
                    break; // para acaba opcion y volver al menu
                case 2: //caso 2 la multiplicacion
                    System.out.println("Introduce el primer numero para hacer una MULTIPLICACION");
                    double e=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("Introduce el segundo numero");
                    double f=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("El resultado es: "+producto(e,f));
                    // en la salida hago la llamada al metodo con las dos variables introducidas por el usuario para la multiplicacion
                    break; // para acaba opcion y volver al menu
                case 3: //caso 3 la division
                    System.out.println("Introduce el primer numero para hacer una DIVISION");
                    double g=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("Introduce el segundo numero");
                    double h=sc.nextDouble(); // variable double que el usuario mete por teclado
                    System.out.println("El resultado es: "+division(g,h));
                    // en la salida hago la llamada al metodo con las dos variables introducidas por el usuario para la division
                    break; // para acaba opcion y volver al menu
                case 4: //caso 4 para salir
                    System.out.println("Saliendo de la calculadora"); // salida de la calculadora
                    break; // para acaba opcion y volver al menu
                default: // default para errores en la opcion con mensaje al usuario
                    System.out.println("Opcion no valida, escribe una opcion valida");
                    break; // para acaba opcion y volver al menu
            }
        }      
    }  
}
