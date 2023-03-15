
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;


public class Repaso_07_Funciones {

    static double sumar(double a , double b)
    {
        double suma=a+b;
        return suma;
    }
    
    static double restar(double a , double b)
    {
        double resta=a-b;
        return resta;
    }
    static double multiplicar(double a , double b)
    {
        double multiplicacion=a*b;
        return multiplicacion;
    }
    static double division(double a , double b)
    {
        double dividir=a/b;
        return dividir;
    }

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        int opcion=0;
        
        while(opcion!=4){
        System.out.println("Calculadora");
        System.out.println("0: sumar");
        System.out.println("1: restar");
        System.out.println("2: multiplicar");
        System.out.println("3: dividir");
        System.out.println("4: SALIR");
        System.out.println("Escoge una opcion");
        opcion=sc.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("numero 1");
                    double a =sc.nextDouble();
                    System.out.println("numero 1");
                    double b=sc.nextDouble();
                    System.out.println("resultado: "+sumar(a,b));
                    break;
                case 1:
                    System.out.println("numero 1");
                    double c =sc.nextDouble();
                    System.out.println("numero 1");
                    double d=sc.nextDouble();
                    System.out.println("resultado: "+restar(c,d));
                    break;
                case 2:
                    System.out.println("numero 1");
                    double e =sc.nextDouble();
                    System.out.println("numero 1");
                    double f=sc.nextDouble();
                    System.out.println("resultado: "+multiplicar(e,f));
                    break;
                case 3:
                    System.out.println("numero 1");
                    double g =sc.nextDouble();
                    System.out.println("numero 1");
                    double h=sc.nextDouble();
                    System.out.println("resultado: "+division(g,h));
                    break;
                case 4:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }   
}
