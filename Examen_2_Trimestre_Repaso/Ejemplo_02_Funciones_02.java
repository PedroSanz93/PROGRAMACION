
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;

public class Ejemplo_02_Funciones_02 {

    static int Contador(int n)
    {
        for (int i=0;i<=n;i++){
            System.out.print(i +" ");
        }
        return n;
    }
    
    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero para que muestre todos los numeros hasta ahi");
        int n=sc.nextInt();
        
        System.out.println(Contador(n));
    }
}
