
package UD2_PARTE1;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        // declaracion de variables
    Scanner operaciones = new Scanner(System.in);
    //variable para leer por teclado
    int numero1;
    int numero2;
    int suma;
    int resta;
    int producto;
    int division;
    // declaramos todas las variables, tanto los numeros que vamos a meter por teclado como las operaciones
    System.out.println("Introduce primer numero");
    numero1 = operaciones.nextInt();
    System.out.println("Introduce el segundo numero");
    numero2 = operaciones.nextInt();
    // declaramos varibles para leer por teclado los numeros con sus correspondientes mensajes de introduce numero
    suma = numero1+numero2;
    System.out.println("El resultado de la suma es "+suma);
    resta =numero1-numero2;
    System.out.println("El resultado de la resta es "+resta);
    producto = numero1*numero2;
    System.out.println("El resultado de la multiplicacion es "+producto);
    // aqui hacemos las operaciones con el mensaje de mostrar resultado de cada uno + la operacion de cada
    if (numero2 > 0) {
        division = numero1/numero2;
    System.out.println("El resultado de la division es "+division);
    // en el if declaramos que si el numero2 es mayor que cero la division sale palante
        }
    else 
        System.out.println("El resultado de esta division no es valido");
    // si no, declaramos el else, para que el programa entienda que todo lo que no sea el if(>0) da el mensaje de error de que no se puede hacer
    } 
}
