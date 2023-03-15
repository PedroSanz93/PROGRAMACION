
package Examen_2_Trimestre_Repaso;

public class Repaso_05_Clase {

    public static void main(String[] args) {
        
    }
    
    private double suma;
    private double resta;
    private double producto;
    private double division;
    
    public Repaso_05_Clase(String nuevoNombre)
    {
        
    }
    
    public void getSuma(double a , double b)
    {
        suma=a+b;
    }
    public double setSuma()
    {
        return suma;
    }
    public void getResta(double a , double b)
    {
        resta=a-b;
    }
    public double getResta()
    {
        return resta;
    }
    public void getProducto(double a , double b)
    {
        producto=a*b;
    }
    public double setProducto()
    {
        return producto;
    }
    public void getDivision(double a , double b)
    {
        division=a/b;
    }
    public double setDivision()
    {
        return division;
    }
}
