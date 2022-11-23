
package UD2_PARTE2;

import java.util.Scanner;

public class Ej013 {

    public static void main(String[] args) {
        Scanner piramide = new Scanner(System.in);
        
        int y;
        int x;
        int altura;
        
        System.out.println("Introduce altura");
        altura=piramide.nextInt();
        
        for (x=1;x<=altura;x++){
        // Este es igual al anterior pero cambia que inicia la x en 1
            for (y=1;y<x;y++){
        // La y tambien inicia en un y hay que meter el y<x para que te haga la piramide bien
                System.out.print(y);
        // La y que es la altura de la piramida dentro del FOR ANIDADO
            }
            System.out.println(x);
        // Y la x del FOR fuera para determinar la longitud de la piramide
        }
    }
}
