import utilities.UtilitiesRandomP;

import java.util.Random;

public class OperacionesLogicas {
    public static void main(String[] args) {
        final var random = new Random();
        final var numero = UtilitiesRandomP.generarRandomInt(10, 200, random);
        final var condicion1 = preguntarCondiciones1(numero);
        final var condicion2 = preguntarCondiciones2(numero);

        System.out.printf("El numero %d es par y mayor que 50?,%b%n", numero, condicion1);
        System.out.printf("El numero %d es multiplo de 3 o menor que 35?,%b%n", numero, condicion2);

    }

    static boolean preguntarCondiciones1(int numero) {
        return numero > 50 && numero % 2 == 0;
    }

    static boolean preguntarCondiciones2(int numero) {
        return numero <= 35 || numero % 3 == 0;
    }
}
