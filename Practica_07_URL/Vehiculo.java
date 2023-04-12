package Practica_07_URL;
    public class Vehiculo { //SUPERCLASE
        // Atributos de la superclase
        public int modeloVehiculo;
        public String nombreVehiculo="";
        // Metodo de la superclase
        public String transportar(){
            return "Metodo transportar de clase Vehiculo";
        }
}
    // SUBCLASES "Principales"    

/*    public class Acuatico extends Vehiculo{ // SUBCLASE
        // atributos de la subclase Acuatico
        public String nombreAcuatico="";
        // metodo de la subclase Acuatico
        public String navegar(){
            return "Metodo navegar de clase Acuatico";
        }
    } */
   
/*    public class Aereo extends Vehiculo{ // SUBCLASE
        // atributos de la subclase Aereo
        public String nombreAereo="";
        // metodos de la subclase Aereo
        public String volar(){
            return "Metodo volar desde clase Aereo";
        }
    } */
    
    // SUBCLASES derivadas de las SUBLASES "Principales"
        
/*    public class Barco extends Acuatico{ // Subclase que deriva de SUCLASE Acuatico que a su vez deriva de la SUPERCLASE Vehiculo
        // metodo de la Suclase Barco
        public String prenderMotor(){
            return "Metodo prenderMotor en la clase Barco";
        }
    }*/
    
/*    public class Velero extends Barco{ 
    // subclase que deriva de la Subclase Barco que a su vez deriva de la SUBCLASE Acuatico que deriva de la SUPERCLASE Vehiculo//
        // metodo de la subclase Velero
        public String izarVelas(){
            return "Metodo izarVelas en clase Velero";
        }
    }*/
    
/*    public class Avion extends Aereo{ // Subclase que deriva de la SUBCLASE Aereo que deriva de la SUPERCLASE Vehiculo
        // metodo de la Subclase Avion
        public String bajarTrenDeAterrizaje(){
            return "Metodo bajarTrenDeAterrizaje en clase Avion";
        }
    }*/
/*    public class Helicoptero extends Aereo{ // Subclase que deriva de la SUBCLASE Aereo que deriva de la SUPERCLASE Vehiculo
        // metodo de la Subclase Helicoptero
        public String encenderHelices(){
            return "Metedo encenderHelices en clase Helicoptero";
        }
    }*/