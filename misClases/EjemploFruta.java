
package misClases;

import misClases.Frutas;

public class EjemploFruta {
    public static void main(String[] args) {
        
        Frutas miFrutas = new Frutas("Melon");
        
        miFrutas.setColor("Verdesito");
        
        miFrutas.setMaduracion(3);
        
        miFrutas.setVariedad("Benameji");
        
        System.out.print("Hemos traido un "+miFrutas.getNombre());
        System.out.print(" de "+miFrutas.getVariedad());
        System.out.print(", "+miFrutas.getColor());
        System.out.print(" y pesaba "+miFrutas.getMaduracion()+" Kilos");
        
    }
}
