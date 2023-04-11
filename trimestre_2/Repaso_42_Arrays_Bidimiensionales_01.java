
// Array bidimensional para rellenar una tabla de valores metidos por teclado
package trimestre_2_REPASO;

import java.util.Scanner;

public class Repaso_42_Arrays_Bidimiensionales_01 {

    public static void main(String[] args) {
        Scanner sc;
        sc= new Scanner(System.in);
        
        int arr [][] = new int[5][5];       
        for (int i = 0; i < arr.length; i++) { // este for es para recorrer el array
            for (int j = 0; j < arr.length; j++) { // el for anidador es para recorrer las posiciones
                System.out.println("Introduce el valor " + (j + 1) +  " del array " + (i+1));
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        System.out.println();       
        for (int i = 0; i < 5; i++) { // Este for es para imprimirlo como una tabla
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }  
}
