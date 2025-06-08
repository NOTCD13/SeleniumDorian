import utilities.ScannerManager;

import java.util.Scanner;

public class scanners {
    /**
     * Abrir el scanner: final var scanner = new Scanner(System.in);
     * <p>
     * String: scanner.nextLine()
     * char: scanner.next().charAt(O)
     * int: scanner.nextInt()
     * double: scanner.nextDouble()
     * boolean: scanner.nextBoolean()
     * <p>
     * Cerrar el scanner: scanner.close();
     */
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var edad = ScannerManager.leerInt(scanner, "Cual es tu edad?");
        final var estatura = ScannerManager.leerDouble(scanner, "Cual es tu estatura?");
        scanner.nextLine();
        final var nombre = ScannerManager.leerString(scanner, "Cual es tu nombre?");

        scanner.close();
        imprimirResultado2(edad, estatura, nombre);


    }

    static void imprimirResultado(int edad, double estatura) {
        System.out.printf("Tu edad es %d y tu estatura %.2f", edad, estatura);
    }

    static void imprimirResultado2(int edad, double estatura, String nombre) {
        System.out.printf("Mi nombre es %s tengo %d de edad y mido %.2f", nombre, edad, estatura);
    }
}
