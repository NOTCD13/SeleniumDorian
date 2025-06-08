import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var random = new Random();
//        final var arrayAleatorio = utilities.UtilitiesRandomP.generarRandomArrayInt(30,10,500,random);
//        ordenarArray(arrayAleatorio);
//        mostrarArrayOrdenadoInt(arrayAleatorio);

        final var arrayAleatorio = UtilitiesRandomP.generarRandomArrayDouble(30,10,500,random);
        ordenarArray2(arrayAleatorio);
        mostrarArrayOrdenadoDouble(arrayAleatorio);
    }

    static void ordenarArray(int[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    static void mostrarArrayOrdenadoInt(int[] array){
        System.out.printf("El array ordenado es %s%n", Arrays.toString(array));
    }


    static void ordenarArray2(double[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void mostrarArrayOrdenadoDouble(double[] array){
        System.out.printf("El array ordenado es %s%n", Arrays.toString(array));
    }

}
