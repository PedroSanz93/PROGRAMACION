
package misClases;

public class Frutas {
    public static void main(String[] args) {
        
    }
    private String color;
    private String nombre;
    private int maduracion;
    private String variedad;
    
    public Frutas (String nuevoNombre)
    { 
        nombre = nuevoNombre;       
    }

     public String getNombre()
    {
        return nombre;
    }
     
    public String getColor()
    {
        return color;
    }
   
    public void setColor(String nuevoColor)
    {
        color = nuevoColor;
    }
   
    public int getMaduracion()
    {
        return maduracion;
    }
    
    public void setMaduracion (int nuevoMaduracion) 
    { 
        maduracion = nuevoMaduracion;   
    }
    public String getVariedad()
    {
    return variedad;    
    }
    public void setVariedad(String nuevaVariedad)
    {
        variedad = nuevaVariedad;
    }
}
