
package UD2_PARTE2;


public class Ej005 {


    public static void main(String[] args) { // BUCLES ANIDADOS // Ejercicio de la piramide "FACIL"
       // metemos dos variables para tener los dos ejes el de arriba abajo y el de izquierda a derecha
        char x;
        char y;
        // el primero for es para decir de arriba abajo de donde a donde vamos a ir
        for (x='Z';x>='A';x--){
        // el segundo for es para decirle que primero muestre A despues AB despues ABC... asi hasta A...Z es el eje de izquierda a derecha
            for (y=x;y>='A';y--){
                System.out.print(y);// el print en este caso es sin salto de linea para que te lo haga seguido de izquierda a derecha por eso es (y)
            }
            System.out.println();// y el segundo print es para la (x) que te haga todo el recorrido de Z a A hacia abajo 
        }
    }
}
    

