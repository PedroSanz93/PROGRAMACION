
package misClases;

public class Clase_Coche {

    public String marca;
    private String modelo;
    private int año;
    // Esto es el CONSTRUCTOR y va con el mismo nombre de la clase
    public Clase_Coche (String nuevoModelo){   
    // Para darle un nombre al Animal
        modelo = nuevoModelo;       
    }
                // METEODOS DE CLASE
    
    // Metodo para obtener la edad del animal
    public int getAño()
    {
        return año;
    }
    //Metodo para establecer la edad del Animal
    public void setAño(int nuevoAño)
    {
        año = nuevoAño;
    }
    // Metodo para obtener el nombre del animal
    public String getModelo()
    {
        return modelo;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca (String nuevaMarca)
    {
        marca = nuevaMarca;       
    }    
    public static void main(String[] args) {   
    } 
}
