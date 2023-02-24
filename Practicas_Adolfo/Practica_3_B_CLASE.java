
package Practicas_Adolfo;


public class Practica_3_B_CLASE { // Doy nombre a la clase para posteriormente llamarla en la app de la calculadora


    public static void main(String[] args) {    
       // clase principal
    }
    // Estos serian los atributos de la clase y los he puesto en privado para que no sean modificables
    private double suma;
    private double resta;
    private double producto;
    private double division;
    // He metido las 4 operaciones para la calculadora
    
    
    public Practica_3_B_CLASE (String nuevoNombre) 
    // Pongo nombre al constructor que con esto va a ser lo que vamos a llamar en la app para hacer las operaciones
    {
        
    }
    
    public void setSuma (double a , double b) // Con el set se modifican los atributos de la clase
    {
        suma = a+b; // operacion para la suma
    }
    
    public double getSuma() // Con el get retornamos el resultado
    {
        return suma; // Retorno
    }
    
    public void setResta (double a , double b) // Con el set se modifican los atributos de la clase
    {
        resta = a-b; // operacion para la resta
    }
    
    public double getResta() // Con el get retornamos el resultado
    {
        return resta; // Retorno
    }
    public void setProducto (double a , double b) // Con el set se modifican los atributos de la clase
    {
        producto = a*b; // operacion para el producto
    }
    
    public double getProducto() // Con el get retornamos el resultado
    {
        return producto; // Retorno
    }
    
    public void setDivision (double a , double b) // Con el set se modifican los atributos de la clase
    {
        division = a/b; // operacion para la division
    }
    
    public double getDivision() // Con el get retornamos el resultado
    {
        return division; // Retorno
    }
}