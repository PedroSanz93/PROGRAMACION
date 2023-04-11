// Ejercicio 7.8
package misClases;

public class SintonizadorFM {

    public double frecuencia; 
    
    SintonizadorFM(double frecuenciaInicial){ // contructor para asignar frecuencia inicial
        if(frecuenciaInicial < 80){
            frecuencia = 80;
        } else if(frecuenciaInicial > 108){
            frecuencia =108;
        } else {
            frecuencia = frecuenciaInicial;
        }
    }
    SintonizadorFM(){ // constructor
        this(80);
    }
    public double down(){
        frecuencia -= 0.5;
        comprobarRango();
        return (frecuencia);
    }
    public double up(){
        frecuencia += 0.5;
        comprobarRango();
        return(frecuencia);
    }
    public void display(){
        System.out.println("Sintonizando: "+frecuencia+" MHz");
    }
    private void comprobarRango(){
        if(frecuencia < 80){
            frecuencia = 108;
        }else if(frecuencia > 108){
            frecuencia = 80;
        }
    }
    public static void main(String[] args) {    
    } 
}
