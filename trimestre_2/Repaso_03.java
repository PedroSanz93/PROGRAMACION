
package trimestre_2;

import java.util.Scanner;

public class Repaso_03 {

    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Hola introduce tu nombre");
        String nombre=sc.nextLine();
        System.out.println("Ahora introduce tu edad");
        int edad = sc.nextInt();
        int edad2 = edad++;
        System.out.println("Hola "+nombre+" tu edad es "+edad+" el año que viene tu edad sera "+edad2);
    }
}
