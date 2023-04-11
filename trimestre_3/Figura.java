
package trimestre_3;

import java.util.Scanner;

public abstract class Figura {

    public abstract double area();
    
    public void mostrar(){
        System.out.println("Soy una figura");
    }

    public abstract double factorial(double n);
    
    public static void main(String[] args) {
        
        Circulo c = new Circulo(5);
        System.out.println("El area del circulo es: "+c.area());
        c.mostrar();
        Scanner sc;
        sc = new Scanner(System.in);
     
        System.out.println("Introduce numero para factorial");
        double factoryal=sc.nextDouble();
        System.out.println("El factorial es: " +c.factorial(factoryal));
    }
}
