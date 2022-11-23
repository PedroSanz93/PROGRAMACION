
package UD2_PARTE2;

import java.util.Scanner;

public class Ej014 {

    public static void main(String[] args) {
      
Scanner escalera = new Scanner(System.in);
        
        int i;
        int j;
        int k;
        int altura;

        System.out.println("Introduce altura");
        altura=escalera.nextInt();
       
        for (i=0;i<altura;i++){  
            for (j=altura;j>i;j--){
                System.out.print(" ");  
        } 
        for (k=0;k<=i;k++){
           System.out.print("* "); 
        }
        System.out.println();
        }
    }
}
