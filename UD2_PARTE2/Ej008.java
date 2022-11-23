
package UD2_PARTE2;

import java.util.Scanner;

public class Ej008 {

    public static void main(String[] args) {
     
        Scanner contadores = new Scanner(System.in);
        // metemos 3 variables
        int i;
        // i es el incremento de numero que vamos a meter desde donde se empieza, cuantos vamos a meter y que son de 1 en 1
        int n;
        // van a ser los numeros que metemos por teclado y el programa va a separar en positivos y negativos
        int contpos=0;
        // contador de positivos igualado a 0 para que calcule cuantos positivos entran
        int contneg=0;
        // contador de negativos igualado a 0 para que calcule cuantos negativos entran
        
        for (i=0;i<=100;i++){
        // el FOR va a marcar CUANTOS numero vamos a meter y como
            System.out.println("Introduce los numeros");
            n=contadores.nextInt();
        // hay que leer los numeros que vayamos metiendo DENTRO DEL FOR
            if (n<0){
        // en el primer IF que mentemos DENTRO del FOR hacemos el primer contador que es el de positivos
                contneg++;
            } else if (n>0){
        // en el ELSE IF hacemos el contador de negativos
                contpos++;
            }
        }
        System.out.println("Despues de contar, han salido positivos: "+contpos+" y de negativos han salido: "+contneg);
        // IMPORTANTE: PARA ESTE EJERCICIO DE CONTADORES LEER FUERA DEL FOR SINO EL EJERCICIO NO SALE PORQUE NO ESTARIA LEYENDO EN DONDE ES
    }
}
