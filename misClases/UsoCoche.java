
package misClases;

public class UsoCoche {

    public static void main(String[] args) {
       
         Coche micoche = new Coche();
         
         micoche.establece_color("amarillo");
         
         System.out.println(micoche.dime_datos_generales());
         
    }
}
