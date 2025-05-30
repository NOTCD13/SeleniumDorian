import java.util.Scanner;

public class BuclesWhile2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        String DiaSemana;
        int cantidadKcal;
        do {
            DiaSemana = ScannerManager.leerString(scanner, "Ingrese un dia de la semana o si desea salir escribir 'SALIDA'").toUpperCase();
            if (!DiaSemana.equals("SALIDA")) {
                cantidadKcal = calcularKCal(DiaSemana);
                imprimirResultado(DiaSemana, cantidadKcal);
            }

        } while (!DiaSemana.equals("SALIDA"));
        System.out.println("Muchas gracias por usar nuestro sistema");
    }

    static int calcularKCal(String DiaSemana) {
        var cantidadKcal = 1;
        if (DiaSemana.equals("LUNES")) {
            cantidadKcal = 350;
        }
        if (DiaSemana.equals("MARTES")) {
            cantidadKcal = 420;
        }
        if (DiaSemana.equals("MIERCOLES")) {
            cantidadKcal = 220;
        }
        if (DiaSemana.equals("JUEVES")) {
            cantidadKcal = 600;
        }
        if (DiaSemana.equals("VIERNES")) {
            cantidadKcal = 125;
        }
        if (DiaSemana.equals("SABADO")) {
            cantidadKcal = 250;
        }
        if (DiaSemana.equals("DOMING")) {
            cantidadKcal = 100;
        }
        if (DiaSemana.equals("SALIDA")) {
            cantidadKcal = 0;
        }

        return cantidadKcal;
    }

    static void imprimirResultado(String DiaSemana, int cantidadKcal) {
        System.out.printf("Para el dia %s se tiene que quemar %d%n", DiaSemana, cantidadKcal);
    }
}
