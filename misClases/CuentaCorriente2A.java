// Ejercicio 7.4
package misClases;

public class CuentaCorriente2A {

    public static void main(String[] args) {
        
        CuentaCorriente2 c1 , c2;
        c1 = new CuentaCorriente2("12345678A" , "Maria");
        c2 = new CuentaCorriente2("87654321B" , "Juana");
        c1.mostrarInformacion();
        CuentaCorriente2.setBanco("Banco Central");
        c1.mostrarInformacion();
        CuentaCorriente2.setBanco("Caja Rural de Montoro");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
    }
}
