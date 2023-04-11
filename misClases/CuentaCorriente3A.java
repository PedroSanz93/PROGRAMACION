// Ejercicio 7.3
package misClases;

public class CuentaCorriente3A {

    public static void main(String[] args) {
        
        CuentaCorriente3 c;
        c = new CuentaCorriente3("12345678A" , "Pepe");
        c.saldo = 2000;
        c.dni = "11111111T";
        c.nombre = "Antonio";
        // Añado la llamada al metodo c.mostrarInformacion para mostrar informacion del cliente
        c.mostrarInformacion();
    }
}
