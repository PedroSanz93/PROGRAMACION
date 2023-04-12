package trimestre_3;
    class Vehiculo { // superclase
        // atributos del vehiculo
        String marca;
        int modelo;
        // metodos del vehiculo
        public void arrancar() {
          System.out.println("El vehículo está arrancando");
        }
        public void parar() {
          System.out.println("El vehículo se ha detenido");
        }
      }
    class Coche extends Vehiculo { // subclase
        // atributos de la subclase
        int numeroPuertas;
        // metodos de la subclase
        public void acelerar() {
          System.out.println("El coche está acelerando");
        }
      }
  public class EjemploHerenciaSimple {
    public static void main(String[] args) { 
      Coche miCoche = new Coche(); // constructor del objeto coche
      // declaro atributos del nuevo coche
      miCoche.marca = "Ford";
      miCoche.modelo = 2022;
      miCoche.numeroPuertas = 5;
      // muestro por pantalla detalles del vehiculo coche
      System.out.println("Marca del coche: " + miCoche.marca);
      System.out.println("Modelo del coche: " + miCoche.modelo);
      System.out.println("Número de puertas del coche: " + miCoche.numeroPuertas);
      // inicio metodos del vehiculo coche comunes del vehiculo y propios del coche
      miCoche.arrancar(); // Método de Vehiculo
      miCoche.acelerar(); // Método de Coche
      miCoche.parar(); // Método de Vehiculo
  }
}