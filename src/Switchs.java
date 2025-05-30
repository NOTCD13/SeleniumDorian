import java.util.Scanner;

public class Switchs {
    /*
     * Se le puede asignar un dato a una variable usando switch dependiendo del case que entre
     * final var mensaje = switch (opcion){
     * case 'A','a' -> "opcion A";
     * case 'B','b' -> "opcion B";
     * case 'C','c' -> "opcion C";
     * case 'D','d' -> "opcion D";}
     *
     *********************************************************************************************
     * En el caso de que se requiera hacer mas lineas en bloque de los casos y aun asi asignar el valor usamos la palabra reservada yield
     *
     * final var mensaje = switch (opcion) {
     *      case 'A','a' -> {
     *          **sout(primera opcion)**
     *            yield "opcion 1";
     * }
     *        case 'A','a' -> {
     *          **sout(segunda opcion)**
     *            yield "opcion 2";
     * }
     *        case 'A','a' -> {
     *          **sout(tercera opcion)**
     *            yield "opcion 3";
     * }
     *        case 'A','a' -> {
     *          **sout(cuarta opcion)**
     *            yield "opcion 4";
     * }
     * }
     */
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
//        final var num1 = ScannerManager.leerInt(scanner, "Ingrese el primer numero");
//        final var num2 = ScannerManager.leerInt(scanner, "Ingrese el segundo numero");
//        imprimirMenu();
//        final var eleccion = ScannerManager.leerChar(scanner, "Ingrese que operacion desea realizar");
//        scanner.close();
//        ejecutarOpcion(eleccion, num1, num2);
        var cantidadKcal = 0;
        menuDias();
        final var Dia = ScannerManager.leerString(scanner, "Seleccione el dia");
        final var kcal = calcularKcal(Dia, cantidadKcal);
        imprimirResultado(Dia, kcal);

    }

    static void imprimirMenu() {
        System.out.println("Opcion A/a: sumar");
        System.out.println("Opcion B/b: resta");
        System.out.println("Opcion C/c: multiplicar");
        System.out.println("Opcion D/d: dividir");
        System.out.println("Opcion E/e: resto");
        System.out.println("Otro: Opcion incorrecta");
    }

    static int calcularSuma(int num1, int num2) {
        return num1 + num2;
    }

    static int calcularResta(int num1, int num2) {
        return num1 + num2;
    }

    static int calcularMultiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    static int calcularDivision(int num1, int num2) {
        return num1 / num2;
    }

    static int calcularResto(int num1, int num2) {
        return num1 % num2;
    }


    static void ejecutarOpcion(char eleccion, int num1, int num2) {
        switch (eleccion) {
            case 'A', 'a' -> System.out.printf("La suma es  " + calcularSuma(num1, num2));
            case 'B', 'b' -> System.out.printf("La resta es  " + calcularResta(num1, num2));
            case 'C', 'c' -> System.out.printf("La multiplicacion es  " + calcularMultiplicacion(num1, num2));
            case 'D', 'd' -> System.out.printf("La division es  " + calcularDivision(num1, num2));
            case 'E', 'e' -> System.out.printf("El resto es  " + calcularResto(num1, num2));
            default -> System.out.println("Opcion incorrecta");
        }
        ;
    }

    static int calcularKcal(String Dia, int cantidadKcal) {
        switch (Dia) {
            case "LUNES", "lunes", "Lunes" -> cantidadKcal = 350;
            case "MARTES", "martes", "Martes" -> cantidadKcal = 420;
            case "MIERCOLES", "miercoles", "Miercoles" -> cantidadKcal = 220;
            case "jUEVES", "jueves", "Jueves" -> cantidadKcal = 600;
            case "VIERNES", "viernes", "Viernes" -> cantidadKcal = 150;
            case "SABADO", "sabado", "Sabado" -> cantidadKcal = 250;
            case "DOMINGO", "domingo", "Domingo" -> cantidadKcal = 100;
            case "Otro" -> cantidadKcal = -1;

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
        Martes,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }


}
