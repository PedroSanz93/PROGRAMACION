// Ejercicio 7.2
package misClases;

import misClases.CuentaCorriente1;

public class CuentaCorriente1A {

    public static void main(String[] args) {
        CuentaCorriente1 c;
        c = new CuentaCorriente1("12345678A" , "Pepe");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: "+c.egreso(700));
        System.out.println("Puedo sacar 500 euros: "+c.egreso(500));
    }
}
