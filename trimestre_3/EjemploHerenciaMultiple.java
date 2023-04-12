
package trimestre_3;
    class Vehiculo{ //Superclase
        // atributos del vehiculo
        String marca;
        int modelo;
        // metodos del vehiculo
        public void arrancar(){
            System.out.println("El vehiculo esta arrancado");
        }
        public void parar(){
            System.out.println("El vehiculo esta parado");
        }
    }
    class Coche extends Vehiculo{ // SubClase coche
        // atributo propio de coche
        int numeroPuertas;
        // metodo propio de coche
        public void acelerar(){
            System.out.println("Vehiculo acelerando");
        }
    }
    class Furgoneta extends Vehiculo { // SubClase furgoneta
        // atributo propio de furgoneta
        int capacidadCarga;
        // metodo propio de furgoneta
        public void carga(int cantidad){
            System.out.println("Capacidad de carga: "+cantidad+" kg de carga");
        }
    }
public class EjemploHerenciaMultiple {
    public static void main(String[] args) {   
        Coche miCoche = new Coche(); // Constructor Vehiculo Coche
        Furgoneta miFurgoneta = new Furgoneta(); // Constructor Vehiculo Furgoneta
        // Declaro atributos del nuevo coche
        miCoche.marca = "Seat Ibiza";
        miCoche.modelo = 2019;
        miCoche.numeroPuertas = 5;
        // Declaro atributos de la nueva furgoneta
        miFurgoneta.marca = "Citroen C15";
        miFurgoneta.modelo = 1989;
        miFurgoneta.capacidadCarga = 700000;
        // Muestro por pantalla detalles de los vehiculos con sus atributos
        System.out.println("Datos del Vehiculo/Coche");
        System.out.println("Marca del coche: "+miCoche.marca);
        System.out.println("Modelo del coche: "+miCoche.modelo);
        System.out.println("Numero de puertas del coche: "+miCoche.numeroPuertas);
        System.out.println("**********************************");
        System.out.println("Datos del Vehiculo/Furgoneta");
        System.out.println("Marca de la furgoneta: "+miFurgoneta.marca);
        System.out.println("Modelo de la furgoneta: "+miFurgoneta.modelo);
        System.out.println("Capacidad de carga de la furgoneta: "+miFurgoneta.capacidadCarga);
        // inicio metodos del Vehiculo coche heredados y propios
        System.out.println("**********************************");
        System.out.println("Hacemos test de coche");
        miCoche.arrancar();
        miCoche.acelerar();
        miCoche.parar();
        // inicio metodos del Vehiculo furgoneta heredados y propios
        System.out.println("**********************************");
        System.out.println("Hacemos test de furgoneta");
        miFurgoneta.arrancar();
        miFurgoneta.carga(500000);
        miFurgoneta.parar();
    }
}