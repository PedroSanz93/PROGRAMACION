
package Examen_2Trimestre;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        Scanner sc;
        sc= new Scanner(System.in);        
        int numero=1; 
        
        System.out.println("Introduce un numero para hacerle el factorial");
        numero=sc.nextInt();
        for(int i=1;i<=numero;i++){
   
            int factorial = (numero*i);
            int aux = factorial*numero;
            
            System.out.println("El factorial es: "+aux*i);
        }       
    }
}
