
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej09 {
    
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce un numero para ver cuantas cifras tiene");
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cifras=0;
        //mientras a n le queden cifras
        while(n!=0){ 
            //le quitamos el último dígito
                    n = n/10;  
            //sumamos 1 al contador de cifras        
                   cifras++;          
            }
         System.out.println("El numero tiene "+cifras+" cifras");
    }
}
    

