package Ejercicios_Bucles;
import java.util.Scanner;
public class Ej10FUNCION {
    public static void lamedia(int n)
    {
        
        int cantidadnum=0;
        int suma=0;
        int media;
        
        while (n>=0){
            suma=suma+n;
            cantidadnum++;
            media=suma/cantidadnum;
            System.out.println(media);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce numeros");
        sc=new Scanner(System.in);
        lamedia(sc.nextInt());
    }
}
