
package trimestre_2;

import java.util.Scanner;

public class Repaso_08 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero mayor que 1");
        int numero = sc.nextInt();
        
        System.out.println(numero<0 ? "es negativo ": "es positivo");
    } 
}
