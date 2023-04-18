// actividad 8.3
package trimestre_3;

public class HoraExacta2 {
    public class HoraExacta extends Hora{ // heredamos de la clase hora

    protected int segundos; // añado un atributo para segundos
    
    public HoraExacta(int hora , int minutos , int segundos){
        // aprovechamos el constructor de la clase this.segundos = segundos; que permitiria asignar cualquier valor a los segundos
        super(hora , minutos); 
        
        if (!setSegundos(segundos)){
            System.out.println("Segundos incorrectos ");
        }
    }
    // añado un metodo para los segundos
    public boolean setSegundos(int segundos){
        boolean correcto = false;
        if(0 <= segundos && segundos < 60){ // si esta en un rango valido
            this.segundos = segundos; // modificamos los segundos
            correcto = true;
        }
        return correcto;
    }
    
    @Override // sustituimos el metodo para incrementar segundos en lugar de minutos
    public void inc(){
        segundos++;
        if(segundos > 59){ // si los segundos son mayores que 59
            segundos = 0; // inicializamos los segundos
            super.inc(); // +1 con el metodo inc() de la superclase
        }
    }
    @Override // sustituimos toString() para mostrar los segundos
    public String toString(){
        String result = super.toString(); // utilizamos toString() de la superClase
        result += ":" + segundos; // añadimos los segundos
        return result;
    }
    
    @Override
    public boolean equals(Object o){
        HoraExacta otroReloj = (HoraExacta) o;
        /* el mismo objeto esta referenciando como Object 
        (con el parametro o) y como HoraExacta (con la variable otroReloj)*/
        boolean iguales;
        
        // si las horas, minutos y segundos son iguales
        if(this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos == otroReloj.segundos){
            iguales = true; // son iguales
        } else{
            iguales = false; // no son iguales
        }
        return iguales;
        }
    }
}