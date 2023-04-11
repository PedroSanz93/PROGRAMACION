// Ejercicio 7.5
package misClases;

public class CuentaCorriente {

    static private String nombreBanco = "International Java Bank";
    String dni;
    String nombre;
    double saldo;
    CuentaCorriente(String dni, String nombre){
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
    static void setBanco(String nuevoNombre){
            nombreBanco = nuevoNombre;
    }
    static String getBanco(){
            return nombreBanco;
    }
    Gestor gestor;
    CuentaCorriente(String dni, String nombre , Gestor gestor){
        this(dni , nombre);
        this.gestor = gestor;     
    }
    void setGestor(Gestor gestor){
        this.gestor =gestor;
    }
    void mostrarInformacion(){
        if (gestor==null){
            System.out.println("Cuenta sin gestor");
        }else{
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion();
        }
        System.out.println("Informacion de la cuenta");
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Saldo: "+saldo);
    }
    public static void main(String[] args) {      
    }
}




