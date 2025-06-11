package ejercicios;

import utilities.RandomUtilities;

import java.util.Random;

public class EjercicioPrueba {
    public static void main(String[] args) {
        final var numeroAleatorio = RandomUtilities.generarRandomInt(5, 2, new Random());
        System.out.println("numero aleatorio: " + numeroAleatorio);
    }

}
