
package AA_PRUEBAS;

import java.util.Scanner;

public class prueba001 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i;
        int j;
        int k;
        int altura;
        
        System.out.println("Introduce altura");
        altura=sc.nextInt();
        
        for (i=0;i<altura;i++){
            for (j=altura;j>i;j--){
                System.out.print(" ");
            }
            for (k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
