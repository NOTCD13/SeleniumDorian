import java.util.Scanner;

public class BuclesWhile1 {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var num1 = ScannerManager.leerInt(scanner, "Ingrese un numero");
        final var num2 = ScannerManager.leerInt(scanner, "Ingrese otro numero");
        char seleccion;

        do {
            imprimirMenu();
            seleccion = ScannerManager.leerChar(scanner, "Seleccione desea hacer");
            ejecutarOpcion(seleccion, num1, num2);

        } while (seleccion != 'f' && seleccion != 'F');
        scanner.close();

    }

    static void imprimirMenu() {

        System.out.print("\033[H\033[2J");
        System.out.println("Opcion A/a: Sumar ");
        System.out.println("Opcion B/b: Resta");
        System.out.println("Opcion C/c: Multiplicar");
        System.out.println("Opcion D/d: Dividir");
        System.out.println("Opcion E/e: Resto");
        System.out.println("Opcion F/f: Salir del programa");
    }


    static void ejecutarOpcion(char seleccion, int num1, int num2) {
        switch (seleccion) {
            case 'a', 'A' -> System.out.println("La suma es:" + Switchs.calcularSuma(num1, num2));
            case 'b', 'B' -> System.out.println("La resta es:" + Switchs.calcularResta(num1, num2));
            case 'c', 'C' -> System.out.println("La multiplicacion es:" + Switchs.calcularMultiplicacion(num1, num2));
            case 'd', 'D' -> System.out.println("La division es:" + Switchs.calcularDivision(num1, num2));
            case 'e', 'E' -> System.out.println("El resto es:" + Switchs.calcularResto(num1, num2));
            case 'f', 'F' -> seleccion = 'f';
            default -> System.out.println("Eleccion no valida intentanlo de nuevo");
        }
    }

}
