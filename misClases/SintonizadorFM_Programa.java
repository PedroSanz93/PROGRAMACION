// Ejercicio 7.8
package misClases;

public class SintonizadorFM_Programa {

    public static void main(String[] args) {
        SintonizadorFM a,b;
        a = new SintonizadorFM(107);
        a.up(); a.up(); a.up(); a.up(); // Sube 0.5 cada a.up();
        a.display(); // debe salir 80.5
        b = new SintonizadorFM(80.5);
        b.down(); b.down(); b.down(); // baja 0.5 cada b.down();
        b.display();
        a = new SintonizadorFM(200);
        a.display(); // debe salir 108.5
    }
}
