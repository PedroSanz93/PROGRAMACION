
package trimestre_2;

import java.util.Scanner;
// Clase Scanner para meter los datos por teclado
public class Repaso_04 {

    public static void main(String[] args) {
        // clase principal
        Scanner sc;
        sc = new Scanner(System.in);
        // lector por teclado
        System.out.println("Introduce tu edad");
        // mensaje por consola que pregunta la edad
        int edad=sc.nextInt();
        // metemos variable para leer edad del usuario por teclado
        boolean mayorEdad = edad>=18;
        // metemos variable booleano y se compara con la variable edad para que si tiene >= a 18 es true y sino es false
        System.out.println("Mayoria de edad: "+mayorEdad);
        // mensaje de si es verdadero o falso si es mayor de edad
    }
}
