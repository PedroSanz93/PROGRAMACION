
package misClases;

// Importamos la clase Animal para usar aqui
import misClases.Animal;

public class EjemploAnimal {
    
    public static void main(String[] args) {
        
        // Creamos un animal cuyo nombre sera Halcon
        // miAnimal es el OBJETO
        Animal miAnimal = new Animal("Halcon");
        
        // Le establecemos 5 años de edad
        miAnimal.setEdad(5);
        
        miAnimal.setRaza("Ave");
        miAnimal.raza="canino";
        
        // Mostramos el nombre por pantalla
        System.out.print("El nombre del animal es: "+miAnimal.getNombre());
        
        System.out.print(", su raza es una "+miAnimal.getRaza());
        
        // Mostramos la edad por pantalla
        System.out.println(" y tiene "+miAnimal.getEdad()+" años");
        // Este codigo deberia mostrar por pantalla a la salida "El nombre es: Halcon y tiene 5 años"
    }
}
