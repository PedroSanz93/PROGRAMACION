
package trimestre_2;

import java.util.Scanner;

public class Repaso_25_Ejercicio_Bucle_05_Piramide {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce cuantas filas");
        int num=sc.nextInt();
        
        for (int i=1;i<=num;i++){       // FILA   
            for (int j=num;j>i;j--){        // COLUMNA
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
/* AL REVES

for (int i=1;i<=num;i++){   // FILA
            for (int j=i;j>1;j--){   // COLUMNA
                System.out.print("* ");
            }
            System.out.println(" ");
        }
*/