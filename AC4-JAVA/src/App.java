import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {10, 30, 40, 50, 60};
        int ultimoElemento = pop(array);
        System.out.println(ultimoElemento);
        System.out.println(Arrays.toString(array));
        System.out.println(array[2]);
        int [] listasem2 = pop(array,2) ;
        for (int i = 0; i < listasem2.length; i++){
           System.out.println(listasem2[i]); 
        }
        
}
public static int pop(int[] array) {
    
    int ultimoIndice = array.length - 1;
    int ultimoElemento = array[ultimoIndice];

    int[] newArray = new int[array.length - 1];
    for (int i = 0; i < ultimoIndice; i++) {
        newArray[i] = array[i];
    }
    
    // atualiza o array original com o novo array
    array = newArray;

    return ultimoElemento;
}
public static  int[] pop (int[] array,int indice) {
    int[] newArray = new int[array.length - 1];
    for (int i = 0, j = 0; i < array.length; i++) {
        if (i == indice) { // Pula o elemento de índice especificado
            continue;
        }
        newArray[j] = array[i];
        j++;

    }
    return newArray;
    
}
}