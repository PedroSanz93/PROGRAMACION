
package trimestre_2_REPASO;

import java.util.Scanner;

public class Repaso_39_Arrays_Vectores_09_CopiaArrays {

    public static void main(String[] args) {
        
        Scanner sc;
        sc=new Scanner(System.in);
        
        int arrOrigen []= {2,3,1,5,10};
        // array de origen con los valores que tiene guardados
        int arrDestino []= new int [arrOrigen.length];
        // en el array destino declaro que es igual a la longitud del array origen
        for(int i=0; i<arrOrigen.length; i++){  
            // for para recorrer el vector desde 0 hasta su longitud
            arrDestino[i]=arrOrigen[i];
            //Se copian los valores del array origen al de destino
            System.out.println(arrOrigen[i]+" Array Original\n");
            System.out.println(arrDestino[i]+" Destino\n");
        }   
    }
}