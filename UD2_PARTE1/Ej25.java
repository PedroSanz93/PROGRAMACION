
package UD2_PARTE1;

import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {
     Scanner universidad = new Scanner(System.in);
     //Todas las variables con las que va a funcionar el programa
     String nombre;
     int facultad=0;//HAY QUE IGUALAR A 0 (=0) CUANDO HAYA UN WHILE
     double importetotal;
     double importe;
     double mensualidad;
     int matricula;
     double tasas;
     //Meto el while para que entre en bucle y si la opcion se sale de 6 vuelve a entrar hasta meter opcion correcta
     while (facultad!=6){
         
         System.out.println("Introduce tu nombre");
         nombre=universidad.nextLine();
         System.out.println("Introduce la opcion del 1 al 6 que corresponda a tu facultad");
         facultad=universidad.nextInt();
         //En cada caso metemos mensualidad, matricula de cada una y sacamos importe(bruto), despues impuestos del 18% y la deduccion que nos dara el total
         //Al final siempre un break para que salte de un caso a otro segun la opcion que se marque
         switch (facultad){
            case 1:
                mensualidad=650;
                matricula=350;
                importe=((mensualidad*12)+matricula);//8150
                tasas=importe*0.18;//1467
                importetotal=importe-tasas;//6683
                System.out.println(nombre+", has elegido Ing.de Sistemas el importe total con impuestos es "+importetotal+"€, la mensualidad es "+mensualidad+" y las tasas son de"+tasas+"€");
                break;
            case 2: 
                mensualidad=550;
                matricula=300;
                importe=((mensualidad*12)+matricula);//6600
                tasas=importe*0.18;//1188
                importetotal=importe-tasas;//5412
                System.out.println(nombre+", has elegido Derecho el importe total con impuestos es "+importetotal+"€, la mensualidad es "+mensualidad+" y las tasas son de"+tasas+"€");
                break;
            case 3:
                mensualidad=500;
                matricula=300;
                importe=((mensualidad*12)+matricula);//6300
                tasas=importe*0.18;//1134
                importetotal=importe-tasas;//5166
                System.out.println(nombre+", has elegido Ing.Naviera el importe total con impuestos es "+importetotal+"€, la mensualidad es "+mensualidad+" y las tasas son de"+tasas+"€");
                break;
            case 4:
                mensualidad=460;
                matricula=310;
                importe=((mensualidad*12)+matricula);//5520
                tasas=importe*0.18;//993.6
                importetotal=importe-tasas;//4526.4
                System.out.println(nombre+", has elegido Ing.Pesquera el importe total con impuestos es"+importetotal+"€, la mensualidad es "+mensualidad+" y las tasas son de"+tasas+"€");
                break;
            case 5:
                mensualidad=490;
                matricula=280;
                importe=((mensualidad*12)+matricula);//5880
                tasas=importe*0.18;//1058.4
                importetotal=importe-tasas;//4821.6
                System.out.println(nombre+", has elegido Contabilidad el importe total con impuestos es"+importetotal+"€, la mensualidad es "+mensualidad+" y las tasas son de"+tasas+"€");
                break;
            case 6:
                mensualidad=520;
                matricula=360;
                importe=((mensualidad*12)+matricula);//6624
                tasas=importe*0.18;//1192.32
                importetotal=importe-tasas;//5412
                System.out.println(nombre+", has elegido Administracion el importe total con impuestos es"+importetotal+"€, la mensualidad es "+mensualidad+" y las tasas son de"+tasas+"€");
                break;
            default: //Al final siempre el default para sacar el mensaje de fallo
                System.out.println("Opcion de facultad erronea, introduce una correcta");
        }
    }
  } 
}
