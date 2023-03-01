
package trimestre_2_REPASO;

import java.util.Scanner;

public class Repaso_33_Arrays_Vectores_04 {

    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        int num;
        int i;
        int contPos=0;
        int contNeg=0;
        
        do {
            System.out.println("¿Cuantos numeros vas a meter?");
            num = sc.nextInt();
        } while (num<=0);
        
        int numero[] = new int [num];
        
        for(i=0; i<numero.length; i++){
            System.out.println("Numero: "+(i+1));
            numero[i] = sc.nextInt();
        }
        
        for(i=0 ; i<numero.length; i++){
            if (num>=0){
                contPos++;
            }else{
                contNeg++;
            } 
        }
        
        System.out.println("Hay "+contPos+" Positivos "+" y hay "+contNeg+" Negativos");
    }
}