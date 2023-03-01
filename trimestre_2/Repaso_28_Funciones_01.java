
package trimestre_2_REPASO;

public class Repaso_28_Funciones_01 {

    static int mostrarValor (int a)
    {
    int b=4;
        System.out.println("A en funcion es = "+a);
        System.out.println("B en funcion es = "+b);
        System.err.println("C en funcion es ERROR");
        
        return b;
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 5;
        System.out.println("A antes es = "+a);
        System.out.println("B antes es = "+b);
        a = mostrarValor(b);
        System.out.println("A despues es = "+a);
        System.out.println("B despues es = "+b);
    }
}