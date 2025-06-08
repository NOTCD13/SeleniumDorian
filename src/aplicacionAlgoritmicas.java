import utilities.ScannerManager;

import java.util.Scanner;

public class aplicacionAlgoritmicas {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
//        final var n = utilities.ScannerManager.leerInt(scanner,"Ingrese cantidad numeros serie de fibonacci");

        //Ejercicio 1 Secuencia de fibonacci
//        mostrarSerieFibonacci(n);
        //Ejercicio 2 InvertirNumeroEjemplo
//        final var n2 = utilities.ScannerManager.leerInt(scanner,"ingrese numero a verificar si es capicua");
//        final var nInvertido =invertirNumero(n2);
//        final var esCapicua = esCapicua(n2,nInvertido);
//        System.out.printf("El numero %d es capicua? %b%n",n2,esCapicua);
        //Ejercicio 3 El numero es primo?

        final var n3 = ScannerManager.leerInt(scanner,"Ingrese un numero para ver si es primo o no");
        final var esPrimo = esPrimo(n3);
        System.out.printf("El numero %d es primo? %b%n",n3,esPrimo);
    }
    static void mostrarSerieFibonacci(int n){
        var anterior = 0;
        var actual = 1;

        System.out.printf("%d %d",anterior,actual);

        for (var i = 0; i < n - 2; i++) {
            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d",actual);
        }
    }

    static int invertirNumero(int n){
        var aux = n;
        var inverso=0;

        while (aux !=0){
            final var residuo =  aux % 10;
            inverso = inverso * 10 +residuo;
            aux/=10;
        }
        return inverso;
    }
    static boolean esCapicua(int n,int nInvertido){
        return n==nInvertido;
    }

    static boolean esPrimo (int n){
        var i = 2;

        while(i<n){
            if(n%i !=0){
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

}

