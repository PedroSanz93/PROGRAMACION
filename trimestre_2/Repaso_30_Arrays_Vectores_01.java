package trimestre_2_REPASO;

public class Repaso_30_Arrays_Vectores_01 {

    public static void main(String[] args) {
        //int numero[] = new int[10]
        // ARRAY literal
        // Ahi se indica como se va a llamar el Array de tipo INT y cuales van a ser sus valores
        int vec[] = {30 , 50 ,70 , -49, 1 , 1357 , 8};
        // Ahi se le dice al array que tamaño va a tener
        int tam = vec.length;
        // con el for recorre el vector en busca del dato que le pidamos
        for (int i = 0; i < tam; i++){
            System.out.println("[" + i +"] = "+vec[i]);
            // Imprime la posicion de cada dato 
        }
    }
}
