
package Cola;

import java.util.Stack;

public class EjemploPila {

    public static void main(String[] args) {
        // Stack seria el constructor del objeto pila
        Stack<String> pila= new Stack<>();
        
        // Agregar elementos a la pila
        pila.push("A");
        pila.push("B");
        pila.push("C");
        
        // Imprimir la pila
        System.out.println("Pila: "+pila);
        
        // Obtener el primer elemento de la pila
        String top = pila.peek(); // El metodo Peek es para recuperar un elemento
        System.out.println("El elemento superior es: "+top);
        
        // Eliminar un elemento de lal pila
        String eliminado = pila.pop(); // 
        System.out.println("Elemento eliminado: "+eliminado);
        
        // Imprimir la cola actualizada
        System.out.println("Pila actualizada: "+pila);
    }
}