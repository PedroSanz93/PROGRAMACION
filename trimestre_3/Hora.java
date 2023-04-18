// actividad 8.1 CLASE
package trimestre_3;

public class Hora {
    // atributos clase protegidos pensados para heredar
    protected int hora;
    protected int minutos;
    // Constructor
    Hora(int hora , int minutos){
        // valor por defectp de la hora
        this.hora = 0; 
        // valor por defecto de minutos
        this.minutos = 0;
        // usamos metodos de asignacion, que comprueban los valores
        if (!setHora(hora)){
            System.out.println("La hora es incorrecta");
        }
        if(!setMinutos(minutos)){
            System.out.println("Los minutos no son validos");
        }
    }
    // incrementa la hora + 1 minuto
    public void inc(){
        minutos++;
        // comprobamos si los minutos sobrepasan 59
        if(minutos > 59){
            // reiniciamos los minutos a 0
            minutos = 0;
            // incrementamos la hora en 1
            hora++;
            // si la hora es mayor de 23 salta al segundo if
        if (hora > 23){
            // reiniciamos la hora a 0
            hora = 0;
            }
        }
    }
    
    public boolean setMinutos(int minutos){
        boolean correcto = false;
        // solo si modificamos si valor esta en 0 .. 59
        if(0 <= minutos && minutos <60){
            this.minutos = minutos;
            correcto = true;
        }
        return correcto;
    }
    
    public boolean setHora(int hora){
        boolean correcto = false;
        // solo modificamos si el valor esta en 0 .. 23
        if (0 <= hora && hora < 24){
            this.hora = hora;
            correcto = true;
        }
        return correcto;
    }
    
    @Override // indica que estamos sustituyendo el metodo
    public String toString(){
        String result;
        result = hora + ":" + minutos;
        return result;
    }
}