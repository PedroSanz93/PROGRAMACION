
package UD2_PARTE1;

import java.util.Scanner;

public class Ej21B {

    public static void main(String[] args) {
        // 
        Scanner nominas = new Scanner(System.in);
        
        double preciohora=10;
        double horas;
        double salariobruto;
        double tasas;
        double deduccion;
        double salarioneto;
        String nombre;
        
        System.out.println("introduzca su nombre");
        nombre=nominas.nextLine();
        System.out.println("Introduzca horas trabajadas");
        horas=nominas.nextDouble();
 
        if (horas<=35){
            salariobruto=(horas*preciohora)*4;
            System.out.println(nombre+" el salario es "+salariobruto);
        }
        else {
            salariobruto=horas*preciohora;
            
            if (salariobruto<=900){
                tasas=0.25;
                deduccion=salariobruto*tasas;
                salarioneto=(salariobruto-deduccion)*4;
                
                System.out.println(nombre+", el salario neto es "+salarioneto);
            } else if (salariobruto>900){
                tasas=0.45;
                deduccion=salariobruto*tasas;
                salarioneto=(salariobruto-deduccion)*4;
                System.out.println(nombre+", el salario neto es "+salarioneto);
            }
        }  
    }   
}
