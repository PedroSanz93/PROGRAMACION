/*Programa que muestra, para cada numero que se meta por teclado 
  si es par o impar, hasta que se meta un 0 y el programa acabe*/
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;

public class Repaso_02_While {

    public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);
        /* variables iniciadas en 0 para el while, menos numero que inicia en uno 
           porque si en el while es distinto a 0 y se pone cero acaba de tiron*/
        int numero=1;
        int contPar=0;
        int contImpar=0;
        // while con un distinto a cero lo que hace que si metes un cero la condicion se cumple y acaba el bucle
        while(numero!=0){
            // meter numeros por teclado
            System.out.println("Introduce numeros para contar pares o impares");
            numero=sc.nextInt();
            // un if para separar numeros con el %2 para los pares y contadores +1
            if (numero%2==0){
                contPar++;
            } else{
                contImpar++;
            }
            // salida
            System.out.println("Pares: "+contPar+" Impares: "+contImpar);
        }
    }
}
