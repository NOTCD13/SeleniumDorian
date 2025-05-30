import java.util.Scanner;

public class enums {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        var cantidadKcal = 0;
        menuDias();
        final var Dia = ScannerManager.leerString(scanner, "Seleccione el dia").toUpperCase();
        final var kcal = calcularKcal(Dias.valueOf(Dia), cantidadKcal);
        imprimirResultado(Dia, kcal);

    }

    static int calcularKcal(Dias Dia, int cantidadKcal) {
        switch (Dia) {
            case LUNES -> cantidadKcal = 350;
            case MARTES -> cantidadKcal = 420;
            case MIERCOLES -> cantidadKcal = 220;
            case JUEVES -> cantidadKcal = 600;
            case VIERNES -> cantidadKcal = 150;
            case SABADO -> cantidadKcal = 250;
            case DOMINGO -> cantidadKcal = 100;
            default -> cantidadKcal = -1;

            //HABLA EN TIPADO
        }
        return cantidadKcal;
    }

    static void imprimirResultado(String Dia, int kcal) {
        System.out.printf("Para el dia %s se tiene que quemar %d kcal", Dia, kcal);
    }

    static void menuDias() {
        System.out.println("Opcion LUNES");
        System.out.println("Opcion MARTES");
        System.out.println("Opcion MIERCOLES");
        System.out.println("Opcion JUEVES");
        System.out.println("Opcion VIERNES");
        System.out.println("Opcion SABADO");
        System.out.println("Opcion DOMINGO");
        System.out.println("OTRO");
    }

    ;

    enum Dias {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}
