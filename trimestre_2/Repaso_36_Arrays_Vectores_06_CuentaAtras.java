
/*Solite al usuario los valores que desea meter, el usuario decide cuantos valores introduce
  Introducimos por teclado el numero de valores por teclado int 
  y los mostramos en el orden inverso a como se han introducido*/
package trimestre_2_REPASO;

import java.util.Scanner;

public class Repaso_36_Arrays_Vectores_06_CuentaAtras {

    public static void main(String[] args) {
        
        Scanner sc;
        sc= new Scanner(System.in);
        
        System.out.println("Cuantos numeros vas a meter");
        int valores=sc.nextInt();
        int arr[]=new int[valores];
        // para decirle que coja los valores para el array de los que vayamos metiendo por teclado
        
        for (int i=0; i<arr.length; i++){
            
            System.out.println("Introduce los numeros: ");
            arr[i]=sc.nextInt();
            // Le metemos, segun cuando valores le hayamos dicho que vamos a meter, todos los numeros
        }
        
        System.out.println("Imprimimos valores en orden inverso al introducido");
        
        for(int j=arr.length-1;j>=0;j--){
            /* para la cuenta atras empieza desde la longitud que le hayamos dado al vector desde la ultima 
               posicion del array hasta el 0 que es la inicial con el decremento de cuenta atras 
               (!! El arr.length-1 es para decirle que vaya de -1 en -1 y ademas j-- para reindicarle que vaya para atras)*/ 
            System.out.println(arr[j]);
            // imprime la cuenta atras
        }
    }
}
