package Ejercicios_Bucles;
import java.util.Scanner;
public class Ej10FUNCION {

    public static double lamedia(int n)
    {
        
        int cantidadnum=0;
        int suma=0;
        int media;
        
        while (n>=0){
            suma=suma+n;
            cantidadnum++;
            media=suma/cantidadnum;  
            return media;
        }
        // hay que averiguar que retornar al main
        
    }
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce numeros");
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(lamedia(n));
    }
}
