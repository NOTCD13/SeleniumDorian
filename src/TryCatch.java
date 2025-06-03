import java.util.Random;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var random = new Random();
        var array1 = UtilitiesRandomP.generarRandomArrayInt(5,10,100,random);
        int num;




    }


}


//        final var random = new Random();
//        final var a = UtilitiesRandomP.generarRandomInt(5,10,random);
//        final var b = UtilitiesRandomP.generarRandomInt(-5,10,random);
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
//        final var c = UtilitiesRandomP.generarRandomInt(5,10,random);
//        final var producto = a * b;
//        System.out.printf("El producto es: %d%n", producto);
//    }
//
//    static int dividirNumeros(int a, int b) throws ArithmeticException{
//        return a/b;
//    }
