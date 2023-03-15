
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;
import Examen_2_Trimestre_Repaso.Repaso_05_Clase;

public class Repaso_06_Objeto {

    public static void main(String[] args) {
        Scanner sc;
        sc= new Scanner(System.in);
        
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
                    Repaso_05_Clase suma = new Repaso_05_Clase("suma");
                    System.out.println("numero 1");
                    double a=sc.nextDouble();
                    System.out.println("numero 1");
                    double b=sc.nextDouble();
                    suma.getSuma(a,b);
                    System.out.println("Resultado: "+suma.setSuma());
                    break;
                case 1:
                    Repaso_05_Clase resta = new Repaso_05_Clase("resta");
                    System.out.println("numero 1");
                    double c=sc.nextDouble();
                    System.out.println("numero 2");
                    double d=sc.nextDouble();
                    resta.getResta(c,d);
                    System.out.println("Resultado: "+resta.getResta());
                    break;
                case 2:
                    Repaso_05_Clase producto= new Repaso_05_Clase("producto");
                    System.out.println("numero 1");
                    double e=sc.nextDouble();
                    System.out.println("numero 2");
                    double f=sc.nextDouble();
                    producto.getProducto(e,f);
                    System.out.println("Resultado: "+producto.setProducto());
                    break;
                case 3:
                    Repaso_05_Clase division = new Repaso_05_Clase("division");
                    System.out.println("numero 1");
                    double g=sc.nextDouble();
                    System.out.println("numero 2");
                    double h=sc.nextDouble();
                    division.getDivision(g,h);
                    System.out.println("Resultado: "+division.setDivision());
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }  
}
