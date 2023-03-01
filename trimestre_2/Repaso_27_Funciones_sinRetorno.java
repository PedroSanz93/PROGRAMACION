package trimestre_2_REPASO;

                        // FUNCION CON RETORNO

public class Repaso_27_Funciones_sinRetorno {

    static int sumar (int a, int b) // Parametros de la funcion (int a, int b)
           // int es el valor que va a devolver la funcion 
    {
        a = a+b;
        System.out.println("Dentro de la funcion a = "+a); 
        return a+b;
    }

    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println("Antes de la funcion a = "+a);
        int res = sumar(a, b);
        System.out.println("Despues de la funcion a = "+a);
        System.out.println("Resultado = "+res);
    }
}