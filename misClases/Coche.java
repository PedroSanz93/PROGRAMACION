
package misClases;


public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;
    
    public Coche(){
        
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500; 
    }
    
    public String dime_datos_generales(){ // GETTER
        
        return "El coche tiene "+ruedas+" ruedas"+", mide "+
                largo+" cm de largo y "+ancho+" cm de ancho, tiene un motor de "+
                motor+" caballos de potencia y tiene un peso en plataforma de "+
                peso_plataforma+" kilos";
    }

    public void establece_color(String color_coche){ // SETTER
        
        color=color_coche;
    }
    public String dime_color(){
        
        return "El color del coche es "+color;
    }
    
    
    public static void main(String[] args) { 
    } 
}
