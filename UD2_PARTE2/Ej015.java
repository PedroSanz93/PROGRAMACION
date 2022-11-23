
package UD2_PARTE2;

import java.util.Scanner;

public class Ej015 {

     public static void main(String[] args) {

        Scanner altura = new Scanner(System.in);
        System.out.println("Introduce la altura");
        int numero = altura.nextInt();
         
    for (int i = 0; i < numero; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = numero; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}