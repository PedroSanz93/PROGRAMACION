
package trimestre_2;

import java.util.Scanner;

public class Repaso_10_IF_ELSE {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int a=sc.nextInt();
        System.out.println("Introduce otro numero");
        int b=sc.nextInt();
        if (a<b){
            System.out.println("El primer numero es menor");
        } else {
            System.out.println("El primer numero es mayor o igual");
        }
    }
}
