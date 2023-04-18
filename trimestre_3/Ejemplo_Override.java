
package trimestre_3;


public class Ejemplo_Override {
    
    private String nombre;
    
    public Ejemplo_Override(String nombre){
        this.nombre=nombre;
    }
    @Override // aqui lo que hace es que se pueda volver a usar el metodo de arriba sobreescrito como quieras
    // Solo se puede hacer en las subclases, en la superclase no se puede sobreescribir un metodo
    public String toString(){
        return "Ejemplo_Override[nombre="+nombre+"]";
        // Devuelve nombre en una cadena de caracteres mas lo que escribas
    }    
    public static void main(String[] args) {

    }
}
