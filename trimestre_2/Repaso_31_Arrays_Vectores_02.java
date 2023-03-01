// Programa Java para ilustrar la creación de un array de enteros,
// coloca algunos valores en la matriz, e imprime cada valor
package trimestre_2_REPASO;

public class Repaso_31_Arrays_Vectores_02 {

    public static void main(String[] args) {
        
        // Se declara una Array de valores enteros
        int [] arr;      
        // Se asigna a la memoria 5 valores enteros
        arr = new int[5];
        // Inicializa todos los elementos del Array
        arr [0] =10;       
        arr [1] = 20;       
        arr [2] = 30;   
        arr [3] = 40;
        arr [4] = 50;
        // Con el For se accede a los elementos del Array
        for (int i = 0; i<arr.length; i++){
            System.out.println("Elemento en el indice "+i+" : "+ arr[i]); // Saca todos los elementos del Array
        }
    }
}
