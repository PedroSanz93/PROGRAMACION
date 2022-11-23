
package UD2_PARTE2;

import java.util.Scanner;

public class Ej011 {

    public static void main(String[] args) {
        
        Scanner escalera = new Scanner(System.in);
        // metemos 3 variables
        int y;
        // la y entendiendo el ejercicio como dos ejes(x,y) sera el incremento de cuantas alturas tenga segun el nº metido por teclado
        int altura;
        // aqui meteremos el valor de la variable que decidira cuantas alturas tiene y cuando para el bucle de poner * consecutivos
        int x;
        // la x sera el incremeto de * seguidos por fila que vamos a tener siendo el maximo los que metamos por teclado
        System.out.println("Introduce altura");
        altura=escalera.nextInt();
        // alturas que va a tener la escalera y nº con el que va a parar el bucle FOR
        // metemos un FOR con otro FOR ANIDADO para determinar altura y longitud
        for (y=1;y<=altura;y++){
        // en el primer FOR le decimos cuantas filas va a tener el dibujo rellenas de * y que vamos de 1 en 1 hasta el nº introducido
        for (x=0;x<=y;x++){
        // el FOR ANIDADO le decimos que vamos desde 0 hasta el numero maximo de y que sera al final lo introducido por teclado
           System.out.print("*");  
        // el primer print son los * que van por fila y se mete dentro del FOR ANIDADO para decirle al programa cuantos * van
        } 
        System.out.println("");
        // y este decide cuantos * van por fila
        }
    }
}