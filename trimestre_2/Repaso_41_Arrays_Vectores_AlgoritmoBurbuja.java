
package trimestre_2_REPASO;


public class Repaso_41_Arrays_Vectores_AlgoritmoBurbuja { // se declara un metodo con: un array desordenado y otro ordenado y un auxiliar

    public static int[] burbuja(int[] array) 
    {
      int auxiliar;
      int[] arrayOrdenado;
      for(int i = 2; i < array.length; i++) // en el primer for se recorre el array desde la posicion 2 hasta la longitud del array de uno en uno
      {
        for(int j = 0;j < array.length-i;j++) // en el segundo for que esta anidado en el primero se recorre el array esta vez desde otra variable auxiliar -a para ir una posicion atras
        {
          if(array[j] > array[j+1]) // si la posicion de la variable auxiliar j es mayor
          {
            auxiliar = array[j]; // iguala al la variable auxiliar a la variable j
            array[j] = array[j+1]; // iguala la j a j+1
            array[j+1] = auxiliar; // iguala la j+1 al auxiliar
          }   
        }
      }
      arrayOrdenado = array; // y aqui se almacena que en el ordenado se guarda el array original
      return arrayOrdenado; // devuelve el array ordenado
    }
    public static void main(String[] args) {
        
      int array[] = {8,6,7,2,1,8,6,8,7,1,9,7,7,10}; // valores del array desordenado
      int arrayOrdenado[] = burbuja(array); // llamada al metodo
 
      for(int i = 0; i < arrayOrdenado.length;i++) // recorre el array despues de llamar al metodo para ordenarlo
        System.out.println(arrayOrdenado[i]); // salida por pantalla ordenada del array
    }
}
