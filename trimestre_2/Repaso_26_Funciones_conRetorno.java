
package trimestre_2_REPASO;

                        // FUNCION SIN RETORNO

public class Repaso_26_Funciones_conRetorno {

    static void sumar (int a, int b) // Parametros de la funcion (int a, int b)
            // void no retorna nada
    {
        a = a+b;
        System.out.println("Dentro de la funcion a = "+a);    
    }

    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println("Antes de la funcion a = "+a);
        sumar(a, b);
        System.out.println("Despues de la funcion a = "+a);
        
    }
}
