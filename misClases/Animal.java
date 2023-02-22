
package misClases;

public class Animal {
    
    public static void main(String[] args) {
        
            
        }
    
    // Estos son los ATRIBUTOS de la clase Main
    // PRIVATE para proteger el atributo (encapsulamiento)
    // PUBLIC se puede cambiar las propiedades del atributo
    public String raza;
    private String nombre;
    private int edad;
    
    // Esto es el CONSTRUCTOR y va con el mismo nombre de la clase
    public Animal (String nuevoNombre){
        
    // Para darle un nombre al Animal
        nombre = nuevoNombre;       
    }
    // METEODOS DE CLASE
    
    // Metodo para obtener la edad del animal
    public int getEdad()
    {
        return edad;
    }
    //Metodo para establecer la edad del Animal
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }
    // Metodo para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }
    
    public String getRaza()
    {
        return raza;
    }
    
    public void setRaza (String nuevoRaza)
    {
        raza = nuevoRaza;       
    } 
}
