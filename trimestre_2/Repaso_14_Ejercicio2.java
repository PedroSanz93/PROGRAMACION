
package trimestre_2;

import java.util.Scanner;

public class Repaso_14_Ejercicio2 {

    public static void main(String[] args) {
    Scanner sc;
    sc = new Scanner(System.in);
        System.out.println("Introduce puntuacion de dado A");
        int dadoA = sc.nextInt();
        System.out.println("Introduce puntuacion de dado B");
        int dadoB = sc.nextInt();
        // Se piden los dos datos por mensaje por teclado
        if (dadoA<0 && dadoB<0){ 
        // determina si los dos son negativos y saca por pantalla un mensaje 
            System.out.println("Ambos son negativos");
        } else if (dadoA>=0 && dadoB<0){ 
        // determina si el primero es positivo y si el segundo es negativo y saca un mensaje
            System.out.println("El dado A es positivo, el dado B es negativo");
        } else if (dadoA<0 && dadoB>=0){ 
        // determina si el primero es negativo y si el segundo es positivo y saca un mensaje 
            System.out.println("El dado A es negativo, el dado B es positivo");
        } else if (dadoA>=0 && dadoB>=0){ 
        // determina si los dos son positivos y saca por pantalla un mensaje 
            System.out.println("Ambos son positivos");
        }
    }
}
