
package UD2_PARTE2;

import java.util.Scanner;

public class Ej006 {

    public static void main(String[] args) {
        
        Scanner factoriales = new Scanner(System.in);
        // las tres variables seran
        int n;
        // n el numero que metemos del que vamos a hacer el factorial
        int i;
        // i va a ser la variable en la estructura FOR para decirle que empezamos en 1 vamos has n (numero introducido) y vamos de 1 en 1
        int factorial=1;
        // factorial nos va a servir al igualarlo a 1 para hacer la operacion matematica de 1*1,1*1*2,1*1*2*3,1*1*2*3..... asi hasta el nº introducido por teclado
        System.out.println("Introduce un numero para hacer el factorial");
        n=factoriales.nextInt();
        
        System.out.println("0! =1");// este print simplemente es para hacer el primer factorial como referencia 
        for (i=1;i<=n;i++){ // el incremento empieza en 1 hasta el numero por teclado que es n y llendo de 1 en 1
            factorial=factorial*i;//la operacion que nos va a indicar el resultado del factorial ejemplo 1*1*2*3*4=24, el 24 seria factorial
            System.out.println(i+"! ="+(factorial));// el print con el numero i "!=" y el resultado (factorial)
        }           
      }  
    }

