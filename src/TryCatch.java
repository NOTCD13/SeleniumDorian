import utilities.ScannerManager;
import utilities.UtilitiesRandomP;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

       final var arrayAleatorio = UtilitiesRandomP.generarRandomArrayInt(5,10,100,new Random());
        final var scanner =new Scanner(System.in);

       int indexLeido;
       do{
        mostrarArray((arrayAleatorio));
        indexLeido = ScannerManager.leerInt(scanner,"ingrese el index deseado");
        if (indexLeido !=-1){
            mostrarElementos(indexLeido,arrayAleatorio); //
        }
       }while (indexLeido != -1);
       scanner.close();

    }
    static void mostrarElementos(int i, int[] array){
        try {
            final var elemento = array[i]; //Lanzar posible excepcion
            System.out.printf("El elemento con index %s es %d%n", i, elemento);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.err.printf("IndexOutOfBoundsException %s%n%n",indexOutOfBoundsException.getLocalizedMessage());
            System.out.println("Index no existente en el array");

        }
    }

    static void mostrarArray(int [] array){
        System.out.printf("El array es: %s%n", Arrays.toString(array));
    }
}





//        final var random = new Random();
//        final var a = utilities.UtilitiesRandomP.generarRandomInt(5,10,random);
//        final var b = utilities.UtilitiesRandomP.generarRandomInt(-5,10,random);
//        System.out.println(a);
//        System.out.println(b);
//
//        try{
//            final var division = dividirNumeros(a,b);
//            System.out.printf("El resultado es: %d%n",division);
//        } catch (ArithmeticException arithmeticException){
//            System.out.printf("No se puede dividir entre 0");
//            System.err.println("ArithmeticException: %s%n", aritmeticException.getLocalizedMessage());
//        }
//
//        final var c = utilities.UtilitiesRandomP.generarRandomInt(5,10,random);
//        final var producto = a * b;
//        System.out.printf("El producto es: %d%n", producto);
//    }
//
//    static int dividirNumeros(int a, int b) throws ArithmeticException{
//        return a/b;
//    }



