// Ejercicio 7.5
package misClases;

public class CuentaCorriente_programa {

    public static void main(String[] args) {
        CuentaCorriente c1, c2, c3;
        Gestor g1 = new Gestor("Antonio Gonzalez", "666555444");
        Gestor g2 = new Gestor("Bea Rodriguez", "987543210",12000.0);
        c1 = new CuentaCorriente("12345678A", "Pepita", g1);
        c2 = new CuentaCorriente("98765432Z","Ana",g1);
        c3 = new CuentaCorriente("11222333B", "Sancho");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
        c1.setGestor(g2);
        c1.mostrarInformacion();
    } 
}
