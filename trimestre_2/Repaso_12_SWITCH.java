
package trimestre_2;

import java.util.Scanner;

public class Repaso_12_SWITCH {

    public static void main(String[] args) {
    Scanner sc;
    sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int a=sc.nextInt();
        //entrada de la opcion
        switch (a) { 
        // el switch evalua la opcion metida por la variable introducida por teclado
            case 1: { 
            // el caso uno
                System.out.println("Opcion 1"); 
                // mensaje de que opcion has escogido
                break; 
                // Acaba la accion en la opcion 1
            }
            case 2: { 
            // el caso dos
                System.out.println("Opcion 2"); 
                // mensaje de que opcion has escogido
                break; 
                // Acaba la accion en la opcion 2
            }
            case 3: {
                System.out.println("Opcion 3"); 
                // mensaje de que opcion has escogido
                break; 
                // Acaba la accion en la opcion 3
            }
            default: {
                System.out.println("Error"); 
                // mensaje de que has escogido una opcion que no es ninguna de las disponible y da error
                break; 
                // Acaba la accion del default
                }
            }
    }
}
