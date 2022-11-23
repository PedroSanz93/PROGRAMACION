
package UD2_PARTE1;
import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        // 
        Scanner ascendente = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Introduce un numero");
        numero1 = ascendente.nextInt();
        System.out.println("Introduce otro numero");
        numero2 = ascendente.nextInt();
        
        if (numero1>numero2){
            System.out.println("El primero es "+numero1+" y el segundo es "+numero2);
        } else if (numero2>numero1){
            System.out.println("El primero es "+numero2+" y el segundo es "+numero1);
        }    
    }
}
