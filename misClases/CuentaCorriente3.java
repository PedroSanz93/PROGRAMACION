// Ejercicio 7.3
package misClases;

public class CuentaCorriente3 {
 
String dni;
public String nombre;
public double saldo;

CuentaCorriente3(String dni, String nombre){
    this.dni = dni;
    this.nombre = nombre;
    saldo=0;
}
boolean egreso(double cant){
    boolean operacionPosible;
    if(saldo >= cant){
        saldo -= cant;
        operacionPosible = true;
    } else {
        System.out.println("No hay dinero suficiente");
        operacionPosible = false;
    }
    return (operacionPosible);
}
void ingreso(double cant){
    saldo += cant;
}
void mostrarInformacion(){
    System.out.println("Nombre: "+nombre);
    System.out.println("DNI: "+dni);
    System.out.println("Saldo: "+saldo+" Euros");
} 
    
    public static void main(String[] args) {
    }
}
