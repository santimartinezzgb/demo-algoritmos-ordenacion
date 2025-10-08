import java.util.Arrays;

public class Bubble  extends Thread {


    public void run() {
        int [] numeros = {34,2,3,56,56};

        // Algoritmo Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los elementos
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

    }

}
