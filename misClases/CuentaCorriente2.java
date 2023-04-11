// Ejercicio 7.4
package misClases;

public class CuentaCorriente2 {

    static private String nombreBanco = "International Java Bank";
    
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente2(String dni, String nombre){
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
    static void setBanco(String nuevoNombre){
            nombreBanco = nuevoNombre;
    }
    static String getBanco(){
            return nombreBanco;
    }
    public static void main(String[] args) {  
    }   
}
