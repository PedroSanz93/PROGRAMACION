
package UD2_PARTE1;

import java.util.Scanner;

public class Ej26 {

    public static void main(String[] args) {
        // 
    Scanner casino = new Scanner(System.in);
    
    int dado1;
    int dado2;
    int dado3;
    int puntuacion;
    

        System.out.println("Introduce la puntuacion del dado 1");
        dado1=casino.nextInt();
        System.out.println("Introduce la puntuacion del dado 2");
        dado2=casino.nextInt();
        System.out.println("Introduce la puntuacion del dado 3");
        dado3=casino.nextInt();
        
       
              if (dado1==6 && dado2==6 && dado3==6){
                System.out.println("Tu puntacion ha sido excelente");
            } else if (dado1==6 && dado2==6 && dado3!=6){
                System.out.println("Tu puntacion ha sido muy buena");
            } else if (dado1==6 && dado2!=6 && dado3==6){
                System.out.println("Tu puntacion ha sido muy buena");
            } else if (dado1!=6 && dado2==6 && dado3==6){
                System.out.println("Tu puntacion ha sido muy buena");
            } else if (dado1==6 && dado2!=6 && dado3!=6){
                System.out.println("Tu puntacion ha regular");
            } else if (dado1!=6 && dado2==6 && dado3!=6){
                System.out.println("Tu puntacion ha regular");
            } else if (dado1!=6 && dado2!=6 && dado3==6){
                System.out.println("Tu puntacion ha regular");
            } else if (dado1!=6 && dado2!=6 && dado3!=6){
                System.out.println("Tu puntacion ha sido pesima");
            }
    }
}
