package Cola;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {

    public static void main(String[] args) {
        // Queue es cola
        Queue<String> cola= new LinkedList<>();
        
        // Agreagar elementos a la cola
        cola.add("A");
        cola.add("B");
        cola.add("C");
        
        // Imprimir cola
        System.out.println("Cola: "+cola);
        
        // Obetener el primer elemento de la cola
        String primero = cola.peek(); // El metodo Peek es para recuperar un elemento
        System.out.println("El primer elemento es: "+primero);
        
        String eliminado = cola.remove(); // El metodo Remove es para eliminar un elemento
        System.out.println("Elemento eliminado: "+eliminado);
        
        // Imprimo la Cola actualizada
        System.out.println("Cola actualizada: "+cola);
    }
}
