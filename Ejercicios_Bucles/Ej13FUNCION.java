package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej13FUNCION {

    public static int contadorpositivosnegativos(int n) {

        
        int cont = 0;
        int contpos = 0;
        int contneg = 0;

        do {
            if (n >= 0) {
                cont++;
                contpos++;
                return contpos++;

            } else {
                cont++;
                contneg++;
                return contneg++;
            }
        } while (cont <= 5);
        
    }
// no hace bien el programa, hay que ver porque no devuelve pos y neg, y porque no deja meter numeros
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Intrduce 5 nº para determinar si son + o -");
        int n=sc.nextInt();
        System.out.println(contadorpositivosnegativos(n));
    }

}
