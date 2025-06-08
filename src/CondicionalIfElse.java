import java.util.Random;
import java.util.Scanner;

public class CondicionalIfElse {
    public static void main(String[] args) {
        final var random = new Random();
        final var scanner = new Scanner(System.in);
//        Ejecicio 1
//        final var numeroAleatorio = utilities.UtilitiesRandomP.generarRandomInt(1, 6, random);
//        final var numeroJugador = utilities.ScannerManager.leerInt(scanner, "Ingrese un numero del 1 al 6");
//        scanner.close();
//
//        if (validarNumero(numeroJugador)) {
//            mostrarMensajeGanador(numeroJugador, numeroAleatorio);
//        } else {
//            System.out.println("El numero ingresado no es valido");
//        }

//        Ejecicio 2
        final var montoPrestamo = ScannerManager.leerDouble(scanner, "Ingrese el monto del prestamo");
        final var montoFinal = calcularMonto(montoPrestamo);
        imprimirResultado(montoPrestamo, montoFinal);

//        Ejercicio 3
//        final var radio = utilities.ScannerManager.leerInt(scanner, "Ingrese el radio");
//        imprimirMenu();
//        final var eleccion = utilities.ScannerManager.leerChar(scanner, "Ingrese su eleccion");
//        scanner.close();
//        final var eleccionValida = validarInput(eleccion);
//        if (eleccionValida) {
//            if (eleccion == 'A' || eleccion == 'a') {
//                System.out.println(calcularArea(radio));
//            } else if (eleccion == 'B' || eleccion == 'b') {
//                System.out.println(calcularPerimetro(radio));
//            } else {
//                System.out.println(calcularArea(radio));
//                System.out.println(calcularPerimetro(radio));
//            }
//        }

    }

    static boolean validarNumero(int numeroJugador) {
        return (numeroJugador >= 1) && (numeroJugador <= 6);
    }

    static void mostrarMensajeGanador(int numerojugador, int numeroAleatorio) {
        System.out.printf("El numero aleatorio es %d%n", numeroAleatorio);

        if (numerojugador == numeroAleatorio) {
            System.out.println("Ganaste!!");
        } else {
            System.out.println("Perdiste!!");
        }
    }

    static double calcularMonto(double montoPrestamo) {
        var montoFinal = montoPrestamo;

        if (montoPrestamo % 2 == 0) {
            montoFinal -= montoPrestamo * 0.10;
        }
        if (montoPrestamo % 3 == 0) {
            montoFinal += 500;
        }
        if (montoPrestamo > 500) {
            montoFinal += 500;
        }
        return montoFinal;
    }

    static void imprimirResultado(double montoPrestamo, double montoFinal) {
        System.out.printf("Para el prestamo de %.2f se le cobrara %.2f al final", montoPrestamo, montoFinal);
    }

    static void imprimirMenu() {
        System.out.println("Seleccione una opcion");
        System.out.println("A: Calcular el area");
        System.out.println("B: Calcular el perimetro");
        System.out.println("C: Calcular ambos");

    }

    static boolean validarInput(char eleccion) {
        if (eleccion == 'A' || eleccion == 'a') {
            return true;
        } else if (eleccion == 'B' || eleccion == 'b') {
            return true;
        } else if (eleccion == 'C' || eleccion == 'c') {
            return true;
        }
        return false;
    }

    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

}

