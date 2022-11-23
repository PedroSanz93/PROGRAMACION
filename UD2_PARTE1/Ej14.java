
package UD2_PARTE1;
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        // 
        Scanner mayormenorigual = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.println("Introduce un numero");
        numero1 = mayormenorigual.nextInt();
        System.out.println("Introduce otro numero");
        numero2 = mayormenorigual.nextInt();
        
        if (numero1>numero2){
            System.out.println("El mayor es "+numero1);
        }else if (numero2>numero1){
            System.out.println("El mayor es "+numero2);
        }else if (numero1==numero2){
                    System.out.println("Los numero son iguales");
                    }
    }
}
