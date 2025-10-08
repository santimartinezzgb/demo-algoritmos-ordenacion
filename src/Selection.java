import java.util.Arrays;

public class Selection extends Thread{


    public void run() {
        int[] arr = {34, 2, 3, 56, 56};


        for (int i = 0; i < arr.length - 1; i++) {
            // Suponemos que el elemento actual es el mínimo
            int minIndex = i;

            // Buscamos el elemento más pequeño en el resto del arreglo
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Actualizamos el índice del mínimo
                }
            }

            // Intercambiamos el elemento más pequeño encontrado con el actual
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }



    }
}
