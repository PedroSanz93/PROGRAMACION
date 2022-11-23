
package UD2_PARTE1;

import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        // 
        Scanner tresnumeros = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        
        System.out.println("Introduce el primer numero");
        numero1 = tresnumeros.nextInt();
        System.out.println("Introduce el segundo numero");
        numero2 = tresnumeros.nextInt();
        System.out.println("Introduce el tercer numero");
        numero3 = tresnumeros.nextInt();
        // Todos los numeros son iguales
        if (numero1==numero2 && numero1==numero3 && numero2==numero3){
            System.out.println("Son los tres iguales");
            // Posibilidades del primer numero
        } else if (numero1>numero2 && numero1>numero3){
            System.out.println("El primer numero es el mayor");
        } else if (numero1==numero2 && numero1>numero3 && numero2>numero3){
            System.out.println("El primer y segundo numero son iguales");
        } else if (numero1==numero3 && numero1>numero2 && numero2>numero3){
            System.out.println("El primer y tercer numero son iguales");
        } // Posibilidades del segundo numero
          else if (numero2>numero1 && numero2>numero3){
            System.out.println("El segundo numero es el mayor");
        } else if (numero2==numero1 && numero2>numero3 && numero1>numero3){
            System.out.println("El primer y segundo numero son iguales");
        } else if (numero2==numero3 && numero2>numero1 &&numero3>numero1){
            System.out.println("El segundo y tercer numero son iguales");
            // Posibilidades del tercer numero
        } else if (numero3>numero1 && numero3>numero2){
            System.out.println("El tercer numero es el mayor");
        } else if (numero3==numero1 && numero3>numero2 && numero1>numero2){
            System.out.println("El primer y tercer numero son iguales");
        } else if (numero3==numero2 && numero3>numero1 && numero2>numero1)
            System.out.println("El segundo y tercer numero son iguales");
    }
}
