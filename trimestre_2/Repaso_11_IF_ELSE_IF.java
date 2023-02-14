
package trimestre_2;

import java.util.Scanner;

public class Repaso_11_IF_ELSE_IF {
 
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int a=sc.nextInt();
        System.out.println("Introduce otro numero");
        int b=sc.nextInt();
        if (a<b){
            System.out.println("El primer numero es menor");
        } else if (a>b){
            System.out.println("El segundo numero es mayor");
        } else {
            System.out.println("Los numero son iguales");
        }
    } 
}
