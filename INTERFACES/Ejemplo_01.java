
package INTERFACES;

    interface Animal{
        void hacerSonido(); // es el metodo del interface que se va a usar en las clases abajo
    }
    // La interface Animal se implementa en la clase Perro
    class Perro implements Animal{
        public void hacerSonido(){ // metodo heredado de arriba
            System.out.println("¡Guau Guau!");
        }
    }
    // La interface Animal se implementa en la clase Gato
    class Gato implements Animal{
        public void hacerSonido(){ // metodo heredado de arriba
            System.out.println("¡Dame los dineros Perrrro!");
        }
    }