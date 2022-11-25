// programa que lea 10 numeros y diga cuantos son positivos y cuantos negativos
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Intrduce 5 nº para determinar si son + o -");
        int n;
        int cont = 0;
        int contpos = 0;
        int contneg = 0;
        do {
            n = sc.nextInt();
            if (n >= 0) {
                cont++;
                contpos++;
            } else {
                cont++;
                contneg++;
            }
        } while (cont <= 5);
        System.out.println("Hay; " + contpos + " nº negativos");
        System.out.println("Hay; " + contneg + " nº negativos");
    }
}
