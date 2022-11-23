
package UD2_PARTE1;

import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {
        // 
        Scanner nominas = new Scanner(System.in);
        
        double salariobruto;
        double salarioneto;
        double horastrabajadas;
        double preciohoranormal;
        double tarifanormal; // 
        double horasextra;
        double valorhoraextra;
        double excesosalario;
        double deduccion1;
        double deduccion2;
        String nombre;
        
        System.out.println("Introduce tu nombre");
        nombre=nominas.nextLine();
        System.out.println("-------------------");
        System.out.println("Introduce las horas trabajadas esta semana");
        horastrabajadas=nominas.nextDouble();
        System.out.println("-------------------");
        System.out.println("Introduce a cuanto de pagan la hora");
        preciohoranormal=nominas.nextDouble();
        System.out.println("-------------------");
        
        if (horastrabajadas>35){
            horasextra=horastrabajadas-35;
            valorhoraextra=horasextra*1.5;
            salariobruto=valorhoraextra*horastrabajadas;
            System.out.println(nombre+" tu salario es "+salariobruto);
        } else {
            salariobruto=horastrabajadas*preciohoranormal;
            
        
        if (salariobruto>500){
            excesosalario=salariobruto-500;
            deduccion1=excesosalario*0.25;
            salarioneto=salariobruto-deduccion1;
            System.out.println(nombre+" tu salario con la tasa del 25% es "+salarioneto);
              } else if(excesosalario>=400){
                deduccion2=excesosalario*0.45;
                salarioneto=salariobruto-deduccion2;
                System.out.println(nombre+" tu salario con la tasa del 45% es "+salarioneto);
            }
        }
    }

}

