
package Ejercicios_Bucles;

import java.util.Scanner;


public class Ej15FUNCION {
    
    public static int potenciafuncion(int b, int ex)
    {
        int resultado=1;
        
        for (int i=1;i<=ex;i++){
            resultado=b*resultado;
            
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.println("Introduce la base");
        int b=sc.nextInt();
        
        sc= new Scanner(System.in);
        System.out.println("Introduce el exponente");
        int ex=sc.nextInt();
        
        System.out.println(potenciafuncion(b, ex));
    }
    
}
// No imprime todas las potencias solo saca el resultado final como en el Ej14