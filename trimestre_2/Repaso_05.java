
package trimestre_2;

import java.util.Scanner;

public class Repaso_05 {

    public static void main(String[] args) {
    
        Scanner sc;
        sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        // variable a introducir por teclado
        boolean numPar = numero%2==0;
        // uso un booleano para igualar si el resto del numero es 0 si lo es es par, y si no, es impar
        // POSIBILIDAD boolean numImpar = numero%2 != 0;
        
        System.out.println("Es numero par "+numPar);
        // imprime si es o no par
        // POSIBILIDAD System.out.println("Es numero impar "+numImpar);
    }
}
