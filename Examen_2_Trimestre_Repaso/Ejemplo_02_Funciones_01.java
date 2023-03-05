
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;


public class Ejemplo_02_Funciones_01 {

    static boolean Par(int numero){
        
        if (numero%2==0){
            System.out.println("Es par: ");
            return true;
        } else {
            System.out.println("Es par: ");
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc;
        sc=new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();
        System.out.println(Par(numero));
    }
}
