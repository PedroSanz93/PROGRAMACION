
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;

public class Repaso_01_Ternarios {

    public static void main(String[] args) {
        
        Scanner sc;
        sc= new Scanner(System.in);
        // entrada de datos por teclado
        System.out.println("Introduce dos numeros");
        System.out.println("El primer numero es: ");
        double n1=sc.nextDouble();
        System.out.println("El segundo numero es: ");
        double n2=sc.nextDouble();
        // variable para la suma
        double suma=n1+n2;
        System.out.println("Eres socio true/false");
        // booleano para saber si es mayor o no
        boolean socio=sc.nextBoolean();
        // operacion para "quitar decimales"
        final double descuento=(suma/1.5);
        // posibilidad de que si socio es true hace descuento
        boolean p1=true;
        // se establece que los numeros tienen que ser distintos a 0, y hay dos caminos o true o false
        p1=(n1!=0 && n2!=0) ? p1==true : p1==false;
        // aqui se toman los caminos, el primero si se cumple que ningun numero sea 0 y socio sea true saca descuento
        System.out.println((p1==true && socio==true) ? "El resultado es: "+descuento : "");
        // aqui si ningun numero es 0 y socio es false saca la suma
        System.out.println((p1==true&& socio==false) ? "El resultado es: "+suma : "");
        // y aqui si algun numero es 0 y socio es false imprime los numeros para que veas cuales son
        System.out.println((p1==false && socio==false) ? "El resultado es: "+n1+" y "+n2+", se quedan como estan sin hacer na" : "");
    }
}
