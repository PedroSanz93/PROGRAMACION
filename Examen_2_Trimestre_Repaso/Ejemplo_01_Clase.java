
package Examen_2_Trimestre_Repaso;

public class Ejemplo_01_Clase {

    public static void main(String[] args) {
        
    }  
    
    private int edad;
   
    
    public Ejemplo_01_Clase (int Nuevaedad)
    {
        edad=Nuevaedad;
    }
    
    public void setNuevaedad(int Nuevaedad)
    {
        edad=Nuevaedad;
    }
    
    public int getNuevaedad()
    {
       return edad;
    }
    
    public boolean Mayoredad()
    {
        return edad>=18;
    }
}