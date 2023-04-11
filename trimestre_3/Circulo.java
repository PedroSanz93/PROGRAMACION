
package trimestre_3;

public class Circulo extends Figura{
    private double radio;
    public Circulo (double radio){
        
        this.radio=radio;
    }
    public double area(){
        return Math.PI*radio*radio;
    }
    
    public double factorial(double n){
    
        for (double i=n-1;i>=1;i--){
            n=n*i;
        }
        return n;
    }
    
    public static void main(String[] args) {      
    }

  
}
