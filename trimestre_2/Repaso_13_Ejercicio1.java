
package trimestre_2;

import java.util.Scanner;

public class Repaso_13_Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1= sc.nextInt();
        System.out.println("Introduce otro numero");
        int num2=sc.nextInt();
        // mensaje de meter los dos numeros por teclado y entrada de los numeros
        if (num1==num2){ 
        // determina si son los numero iguales y muestra un mensaje
            System.out.println("Los numeros son iguales");
        } else { 
        // todo lo que no sean los dos numeros muestra un mensaje de no son iguales
            System.out.println("Los numeros NO son iguales");
        }
    }
}
