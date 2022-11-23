
package UD2_PARTE2;

public class Ej010 {

    public static void main(String[] args) {
        // metemos 3 variables
        int i;
        // con esta variable hacemos el incremento para que vaya de 1 en 1 hasta el 10
        int suma=0;
        // la suma se iguala a cero para decirle al programa que empieza en 0 hasta 10 y nos sirve para guardar el resultado de la suma
        int producto=1;
        // el producto se iguala a 1 porque si se iguala a 0 al multiplicar siempre va a dar 0, entonces multiplica del 1 al 10 y nos sirve para guardar el resultado de la multiplicacion
        for (i=1;i<=10;i++){
         // el FOR para hacer el incremento y decirle que vaya del 1 al 10 de 1 en 1
            suma=suma+i;
            // la suma sera igual a lo que llevemos sumado mas el siguiente numero hasta que llegue al 10 (1+2+3+4+5+6+7+8+9+10)
            producto=producto*i;
            // el producto sera igual a lo que llevamos multiplicado por el siguiente numero del 1 al 10 (1*2*3*4*5*6*7*8*9*10)
        } 
        System.out.println("La suma da como resultado: "+suma);
        System.out.println("El producto da como resultado: "+producto);
        // Imprimimos resultados y acaba el programa
    }  
}
