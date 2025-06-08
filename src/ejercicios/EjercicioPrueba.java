package ejercicios;

import utilities.UtilitiesRandomP;

import java.util.Random;

public class EjercicioPrueba {
    public static void main(String[] args) {
        final var random = new Random();
        final var aleatorio = UtilitiesRandomP.generarRandomInt(5,10,random);
        System.out.printf("%d%n",aleatorio);
    }
}
