
package UD2_PARTE2;

import java.util.Scanner;

public class Ej012 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura;
        int i;
        int j;
        
        System.out.println("Introduce la altrua");
        altura=sc.nextInt();
        
        for (i=1;i<=altura;i++){
            for (j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
