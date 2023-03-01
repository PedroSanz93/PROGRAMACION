
package trimestre_2_REPASO;


public class Repaso_34_Arrays_Vectores_Multidimiensionales_05 {

    public static void main(String[] args) {
         // Declaro Array 2D
        int arr [][] = {{2,7,9,10,5},{3,6,1,3,45},{7,4,2,12,5},{7,4,2,12,5},{7,4,2,12,5}};
        
        // Impresion Array 2D
        for (int i=0; i<5; i++){
            
            for (int j=0; j<5 ; j++){
                System.out.println(arr[i][j]+" ");
            }
            // Espacio entre {} cada conjunto de datos en el Array
            System.out.println();
        }
    }
}
