// Ejercicio 7.9
package misClases;

public class Bombilla_Programa {

    public static void main(String[] args) {
       
        Bombilla b1 , b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1.enciende();
        b2.apaga();
        System.out.println("b1: "+b1.muestraEstado());
        System.out.println("b2: "+b2.muestraEstado());
        Bombilla.interruptorGeneral = false; //Cortamos luz
        System.out.println("\nCortamos la luz General");
        System.out.println("b1: "+b1.muestraEstado());
        System.out.println("b2: "+b2.muestraEstado());
        Bombilla.interruptorGeneral = true; // Encendemos la luz
        System.out.println("\nActivamos la luz General");
        System.out.println("b1: "+b1.muestraEstado());
        System.out.println("b2: "+b2.muestraEstado());
    }
}