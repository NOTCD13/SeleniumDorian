import java.util.Random;

public class prBucleFOR {
    public static void main(String[] args) {
        final var random = new Random();
        final var aletorio = UtilitiesRandomP.generarRandomInt(5, 20, random);
//        mostrarNumeros1(aletorio);
//        mostrarNumeros2(aletorio);
//        mostrarNumeros3(aletorio);
        final var aleatorio2 = UtilitiesRandomP.generarRandomInt(15, 100, random);
        final var aleatorio3 = UtilitiesRandomP.generarRandomInt(5, 10, random);
        final var aleatorio4 = UtilitiesRandomP.generarRandomInt(2, 10, random);
//        mostrarNumeros1(aletorio);
//        System.out.println(contarValores3(aleatorio2));
//        System.out.println(calcularSuma1(aleatorio2));
//        var promedio = calcularPromedioSimple(aleatorio3);
//        imprimirResultado(aleatorio3, promedio);
        final var factorial = calcularFactorial(aleatorio4);
        imprimirResultadofor(aleatorio4, factorial);
    }

    static void mostrarNumeros1(int n) {
        for (var i = 1; i < n; i++) {
            System.out.println(i);
        }
    }

    static void mostrarNumeros2(int n) {
        for (var i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    static void mostrarNumeros3(int n) {
        for (n = n; n > 0; n--) {
            System.out.println(n);
        }
    }

    //------------------------------------------------------------------------------------//
    static int contarValores1(int n) {
        var suma = 0;
        for (var i = 1; i < n; i++) {
            if (i % 2 == 0) {
                suma += 1;
            }
        }
        return suma;
    }

    static int contarValores2(int n) {
        var suma = 0;
        for (var i = 1; i < n; i++) {
            if (i % 3 == 0) {

                suma += 1;
            }
        }
        return suma;
    }

    static int contarValores3(int n) {
        var suma = 0;
        for (var i = 1; i < n; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                suma += 1;
            }
        }
        return suma;
    }
    //------------------------------------------------------------------------------------//

    static int calcularSuma1(int n) {
        var suma = 0;
        for (var i = 0; i < n; i++) {
            suma += i;
        }
        return suma;
    }

    static int calcularSuma2(int n) {
        var suma = 0;
        for (var i = 0; i < n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        return suma;
    }

    static int calcularSuma3(int n) {
        var suma = 0;
        for (var i = 0; i < n; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    static double calcularPromedioSimple(int n) {
        var suma = 0;
        for (var i = 1; i <= n; i++) {
            suma += i;
        }
        return suma / n;
    }

    static void imprimirResultado(int n, double promedio) {
        System.out.printf("El promedio simple desde 1 hasta %d es %.1f", n, promedio);
    }

    static int calcularFactorial(int n) {
        var factorial = 1;
        for (var i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void imprimirResultadofor(int n, int factorial) {
        System.out.printf("El factorial de %d es %d", n, factorial);
    }
}