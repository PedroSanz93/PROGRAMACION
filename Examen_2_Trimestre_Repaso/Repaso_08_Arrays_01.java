
package Examen_2_Trimestre_Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Repaso_08_Arrays_01 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        
        int numeros[];
        int arrPar[]= new int[0];
        int arrImpar[]= new int[0];
        System.out.println("Cuantos numeros vas a meter");
        int num=sc.nextInt();
        numeros= new int[num];
        for (int i=0;i<numeros.length;i++){
            System.out.println("introduce los numeros");
            numeros[i]=sc.nextInt();
        }
        for(int j:numeros){
            if(j%2==0){
                arrPar=Arrays.copyOf(arrPar,arrPar.length+1);
                arrPar[arrPar.length-1]=j;
            }else{
                arrImpar=Arrays.copyOf(arrImpar,arrImpar.length+1);
                arrImpar[arrImpar.length-1]=j;
            }
        }      
        Arrays.sort(arrPar);
        Arrays.sort(arrImpar);
        System.out.println("Pares: "+Arrays.toString(arrPar));
        System.out.println("Pares: "+Arrays.toString(arrImpar));
    }
}
