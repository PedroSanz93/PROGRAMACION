//Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos
//diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear
//una función donde le pasemos los datos y devuelva si es correcta o no.
package UD3_PARTE1;
import java.util.Scanner;
public class Ej10 {
    public static boolean metodoDia (int dia)
    {
        if(dia>0&&dia<=30)
        {
            return true;
        }
        return false;
    }
    public static boolean metodoMes (int mes)
    {
        if(mes>0&&mes<=12){
            return true;
        }
        return false;
    }
    public static boolean metodoAño (int año)
    {
        if(año>0&&año<=2022){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc;
        
        System.out.println("introduce el dia");
        sc=new Scanner(System.in);
        int dia=sc.nextInt();
        
        System.out.println("introduce el mes");
        sc=new Scanner(System.in);
        int mes=sc.nextInt();
        
        System.out.println("introduce el año");
        sc=new Scanner(System.in);
        int año=sc.nextInt();
        
        System.out.println(metodoDia(dia));
        System.out.println(metodoMes(mes));
        System.out.println(metodoAño(año));
    }
}
