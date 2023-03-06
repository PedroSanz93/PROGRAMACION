
// BUSQUEDA SECUENCIAL consiste en recorrer un vector para comprobar los valores de los elementos

package trimestre_2_REPASO;

public class Repaso_37_Arrays_Vectores_07_Busqueda {

    public static void main(String[] args) {
        
        int indiceBusqueda=0;
        int arr[];
        int clave=0;
        
        while (indiceBusqueda<arr.length && arr[indiceBusqueda]!=clave){
            indiceBusqueda++;
        }
        
        if (indiceBusqueda<arr.length){
            // la clave se encuentra en la posicion <indiceBusqueda>
            
        } else {
            // no encontrado
        }
    }
}

/* Escribe la funcion int buscar(int arr[] , int clave), para buscar de forma secuencial en el vector el valor de la clave, 
   si lo encuentra me dice la posicion en la que esta y si no lo encuentra nos devuelve -1*/