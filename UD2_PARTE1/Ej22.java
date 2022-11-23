
package UD2_PARTE1;

import java.util.Scanner;

public class Ej22 {

    public static void main(String[] args) {
        // 
        Scanner tiempo = new Scanner(System.in);
        
        int hora;
        int minuto;
        int segundo=0;
        // en las variables se igual segundos a 0 porque es donde vamos a incrementar
        System.out.println("Introduce hora");
        hora=tiempo.nextInt();
        System.out.println("Introduce minutos");
        minuto=tiempo.nextInt();
        System.out.println("Introduce segundos");
        segundo=tiempo.nextInt();
        
        segundo=segundo+1;
        //hay que meter el incremento de lo que nos pide el ejercicio que aumente 1 segundo
        if (segundo>59){
            minuto=minuto+1;
            segundo=0;
        // si los segundos suben de 59 sube los minutos y segundos vuelve a 0
        } 
        if (minuto>59){
            hora=hora+1;
            minuto=0;
        // si los minutos suben de 59 sube la hora y los minutos vuelven a 0
        } 
        if (hora>12){
            hora=0;
            minuto=0;
            segundo=0; 
        // si la hora llega a las mas de 12 todo vuelve a 0 para volver a empezar
        } 
        System.out.println("La hora actual es "+hora+("--")+minuto+("--")+segundo);
    }
}
