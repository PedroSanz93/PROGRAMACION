
/* Escribe la funcion int buscar(int arr[] , int clave), para buscar de forma secuencial en el vector el valor de la clave, 
   si lo encuentra me dice la posicion en la que esta y si no lo encuentra nos devuelve -1*/

package trimestre_2_REPASO;

import java.util.Scanner;


public class Repaso_38_Arrays_Vectores_08_Busqueda_Funcion {

    public static int busquedaSequencialFuncion(int arr[] , int clave)
    {
        clave=1234;
        int indiceBusqueda=0;
        arr[4]=1234;
        
        while (indiceBusqueda<arr.length && arr[indiceBusqueda] != clave){
            indiceBusqueda++;
        }
        
        if (indiceBusqueda<arr.length){
            return indiceBusqueda;
        } else{
            return -1;
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("La clave esta en la posicion: ");
        //int numero=sc.nextInt();
        int b = busquedaSequencialFuncion(new int [10],1234);
        System.out.println(b);
        
    }
}
