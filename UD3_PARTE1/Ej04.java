//Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
//positivo, negativo o cero. Implementa y utiliza la función:
//int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo

package UD3_PARTE1;

import java.util.Scanner;

public class Ej04 {

    public static int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
    {
        // meto 3 variables igualadas a lo que te pide el ejercico
        int positivo=1;
        // cuando metamos un numero positivo nos devolvera 1 por pantalla
        int negativo=-1;
        // cuando metamos un numero negativo nos devolvera -1 por pantlla
        int cero=0;
        // y cuando se meta un 0 nos devolvera un 0 por pantalla
        if (a>0){
           // en el los if sacamos los positivos, negativos y 0, y el return tal cual sin igualarlo a nada porque en la variable ya lo hemos igualado
           // aqui hace la operacion de detecta si es positivo negativo o 0
            return positivo;
        } else if (a<0){
            return negativo;
        } else{
            return cero;
        } 
    }

    public static void main(String[] args) {
        Scanner sc;
        // el SCANNER así, es para que vaya leyendo cada variable 1 a 1 
        System.out.println("Introduce un numero");
        sc= new Scanner(System.in);
        // se pone despues del print así
        int numero=sc.nextInt();
        System.out.println("El numero es: "+dimeSigno(numero));
    }
}
