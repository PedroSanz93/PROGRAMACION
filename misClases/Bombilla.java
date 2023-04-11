// Ejercicio 7.9
package misClases;

public class Bombilla {

    public static boolean interruptorGeneral = true;
    private boolean interruptor;
    public Bombilla(){
        interruptor = false;// inicialmente la bombilla esta apagada
    }
    public void enciende(){ //activamos el interruptor
        interruptor = true;
    }
    public void apaga(){ // apagamos interruptor
        interruptor = false;
    }
    public boolean estado(){
        return interruptorGeneral && interruptor;
    }
    public String muestraEstado(){
        return estado() ? "Encendida" : "Apagada"; // dependiendo del estado devuelve encendida o apagada
    }
    public static void main(String[] args) {
    }  
}
