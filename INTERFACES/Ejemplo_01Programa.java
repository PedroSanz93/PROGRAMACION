
package INTERFACES;

public class Ejemplo_01Programa {

    public static void main(String[] args) {
        
        Animal perro = new Perro(); // constructor del objeto/Interface
        Animal gato = new Gato(); // constructor del objeto/Interface
        
        // Se hace la llamada al metodo del Interface hacerSonido()
        perro.hacerSonido(); // La salida es el sout con el mensaje del metodo
        gato.hacerSonido(); // La salida es el sout con el mensaje del metodo

    }
}