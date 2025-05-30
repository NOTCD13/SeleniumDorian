import java.util.Scanner;

public class ConversionDatos {

    /*
     * Integer.parseInt(x) = String to int
     * Double.parseDouble(x) = String to double
     * boolean.parseBoolean(x) = String to boolean
     * String.valueOf(x) = int and double to String
     * */
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var precio1 = ScannerManager.leerString(scanner, "Ingrese un numero");
        final var precio2 = ScannerManager.leerString(scanner, "Ingrese otro numero");
        final var precio3 = ScannerManager.leerString(scanner, "Ingrese un ultimo numero");
        scanner.close();
        final var suma = calcularSuma(precio1, precio2, precio3);
        ImprimirSuma(suma);

    }

    static double calcularSuma(String precio1, String precio2, String precio3) {
        return Double.parseDouble(precio1) + Double.parseDouble(precio2) + Double.parseDouble(precio3);
    }

    static void ImprimirSuma(double suma) {
        System.out.printf("El precio total es %.2f", suma);
    }
}
