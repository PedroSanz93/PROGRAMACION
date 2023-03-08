
/* Crear app que lea y almacene x(por teclado) numeros en un array
a partir de ella se van a construir 2 vectores,
una con valores para y otra de impares.
Los vectores pares e impares se deben mostras ordenados */

package trimestre_2_REPASO;

import java.util.Scanner;
import java.util.Arrays; // clase de arrays

public class Repaso_40_Arrays_Vectores {

    public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);
        
        // Declaracion de arrays
        int datos [];
        // donde se van a guardar los datos
        int vpar []= new int[0];
        // valor inical del vector que inicia en 0
        int vimpar []= new int[0];
        // valor inical del vector que inicia en 0
        System.out.println("Cuantos valores vas a meter");
        // pedir valores por pantalla
        int n=sc.nextInt();
        // variable para meter por teclado que vamos a usar en vetor
        datos = new int[n];
        // le decimos al vector que los valores que vamos a introducir lo guardamos en el vector datos
        for(int i=0;i<datos.length;i++){
            System.out.println("Introduce los valores");
            datos[i] = sc.nextInt();
            // le decimos que vamos a meter los datos por teclado
        }
        
        for (int j:datos){ // Es lo mismo que i=0;i<datos.length;i++ es para que recorra el array
            if (j%2==0){ // si el numero j su resto es cero es par
                vpar=Arrays.copyOf(vpar, vpar.length+1); // 
                vpar[vpar.length-1]=j;
            } else {
                vimpar=Arrays.copyOf(vimpar, vimpar.length+1);
                vimpar[vimpar.length-1]=j;
            }
            
        }
        Arrays.sort(vpar); // para ordenar los valores del array importamos la funcion Arrays.sort()
        Arrays.sort(vimpar); // para ordenar los valores del array importamos la funcion Arrays.sort()
        System.out.println("Los pares son: "+Arrays.toString(vpar)); // en la salida se imprime todo el array completo con esta funcion Arrays.toString()
        System.out.println("Los impares son: "+Arrays.toString(vimpar));
        
    }
    
}
