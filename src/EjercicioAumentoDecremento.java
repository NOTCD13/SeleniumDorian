import java.util.Random;
import java.util.Scanner;

public class EjercicioAumentoDecremento {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        var numero = ScannerManager.leerInt(scanner, "Ingrese un numero");
        scanner.close();
        System.out.println(numero);
        final var random = new Random();
        final var numeroRandom = UtilitiesRandomP.generarRandomInt(3, 10, random);
        numero -= numeroRandom;
        System.out.println(numeroRandom);
        System.out.println(numero);


    }
}
