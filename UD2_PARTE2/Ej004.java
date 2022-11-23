
package UD2_PARTE2;

import java.util.Scanner;

public class Ej004 {


    public static void main(String[] args) {
        
        Scanner cuenta = new Scanner(System.in);
        
        int i;
        int n;
        
        System.out.println("Introduce un numero para hacer la cuenta hacia delante");
        n=cuenta.nextInt();
        
        for (i=1;i<=n;i++){
        
             System.out.println(i);  
        }
    }
}
