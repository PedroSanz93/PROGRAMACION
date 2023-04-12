package Practica_07_URL;

public class EjemploHerenciaURL {

    public static void main(String[] args) {
        
        System.out.println("--------<<SUPERCLASE Vehiculo>>--------");
        
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.nombreVehiculo = "El Gran transportador";
        System.out.println("Usando miVehiculo, nombreVehiculo: "+miVehiculo.nombreVehiculo);
        System.out.println("Usando miVehiculo llama a: "+miVehiculo.transportar());
        System.out.println("---------------------------------------------");
        System.out.println();
        
        System.out.println("--------<<SUBCLASE Acuatico que hereda de SUPERCLASE Vehiculo>>--------");
        Acuatico miAcuatico = new Acuatico();
        miAcuatico.nombreVehiculo = "El Navegante";
        System.out.println("Usando miAcuatico, nombreVehiculo: "+miAcuatico.nombreVehiculo);
        System.out.println("Usando miAcuatico llama a: "+miAcuatico.transportar());
        System.out.println("Usando miAcuatico llama a: "+miAcuatico.navegar());
        System.out.println("---------------------------------------------");
        System.out.println();
        
        System.out.println("--------<<Subclase Barco que hereda de SUBCLASE Acuatico y a su vez hereda de SUPERCLASE Vehiculo>>--------");
        Barco miBarco = new Barco();
        miBarco.nombreVehiculo = "Titanic";
        System.out.println("Usando miBarco, nombreVehiculo : "+miBarco.nombreVehiculo);
        System.out.println("Usando miBarco llama a : "+miBarco.transportar());
        System.out.println("Usando miBarco llama a : "+miBarco.navegar());
        System.out.println("Usando miBarco llama a : "+miBarco.prenderMotor());
        System.out.println("---------------------------------------------");
        System.out.println();
        
        System.out.println("--------<<subclase Velero que hereda de la Subclase Barco que hereda de SUBCLASE Acuatico y a su vez hereda de SUPERCLASE Vehiculo>>--------");
        Velero miVelero=new Velero();
        miVelero.nombreVehiculo="Tormenta";
        System.out.println("usando miVelero, nombreVehiculo : "+miVelero.nombreVehiculo);
        System.out.println("usando miVelero llama a : "+miVelero.transportar());
        System.out.println("usando miVelero llama a : "+miVelero.navegar());
        System.out.println("usando miVelero llama a : "+miVelero.izarVelas());
        System.out.println("---------------------------------------------");

        System.out.println("----------<<SUBCLASE Aereo que hereda de la SUPERCLASE Vehiculo>>---------");
        Aereo miAereo= new Aereo();
        miAereo.nombreVehiculo="El Volador";
        System.out.println("usando miAereo, nombreVehiculo : "+miAereo.nombreVehiculo);
        System.out.println("usando miAereo llama a : "+miAereo.transportar());
        System.out.println("usando miAereo llama a : "+miAereo.volar());
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("-----<<Subclase Avion que hereda de la SUBCLASE Aereo que hereda de la SUPERCLASE Vehiculo>>-----");
        Avion miAvion=new Avion();
        miAvion.nombreVehiculo="El Condor";
        System.out.println("usando miAvion, nombreVehiculo : "+miAvion.nombreVehiculo);
        System.out.println("usando miAvion llama a : "+miAvion.transportar());
        System.out.println("usando miAvion llama a : "+miAvion.volar());
        System.out.println("usando miAvion llama a : "+miAvion.bajarTrenDeAterrizaje());
        System.out.println("---------------------------------------------");
        System.out.println();
        
        System.out.println("-----<<Subclase Helicoptero que hereda de la SUBCLASE Aereo que hereda de la SUPERCLASE Vehiculo>>-----");
        Helicoptero miHelicoptero=new Helicoptero();
        miHelicoptero.nombreVehiculo="El lobo del Aire";
        System.out.println("usando miHelicoptero, nombreVehiculo : "+miHelicoptero.nombreVehiculo);
        System.out.println("usando miHelicoptero llama a : "+miHelicoptero.transportar());
        System.out.println("usando miHelicoptero llama a : "+miHelicoptero.volar());
        System.out.println("usando miHelicoptero llama a : "+miHelicoptero.encenderHelices());
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("--<< Metodos de la SUPERCLASE Vehiculo usados por todas las SUBCLASES>>--");
        System.out.println("nombre Vehiculo :"+miVehiculo.nombreVehiculo);
        System.out.println("nombre Acuatico :"+miAcuatico.nombreVehiculo);
        System.out.println("nombre Aereo :"+miAereo.nombreVehiculo);
        System.out.println("nombre Barco :"+miBarco.nombreVehiculo);
        System.out.println("nombre Velero :"+miVelero.nombreVehiculo);
        System.out.println("nombre Avion :"+miAvion.nombreVehiculo);
        System.out.println("nombre Helicoptero :"+miHelicoptero.nombreVehiculo);
        System.out.println("---------------------------------------------");
    }
}