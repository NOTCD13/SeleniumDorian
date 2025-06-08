package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UtilitiesRandomP {

    public static void main(String[] args) {
        /*-----------------------------Ejercicio 1
        static int sumarNumeros(int a , int b , int c){
        return a+b+c;
        }
        final var random = new Random();
        final var numeroRandomInt = generarRandomInt(1, 50, random);
        final var numeroRandomDouble = generarRandomDouble(1, 50, random);
        System.out.printf("El numero random entero es %d y el numero random con decimales es %.2f", numeroRandomInt, numeroRandomDouble);
        -------------------------------Ejercicio 2
        final var random = new Random();
        final var masa = generarRandomDouble(100, 300, random);
        final var aceleracion = generarRandomDouble(3, 5, random);
        final var fuerza = calcularFuerza(masa, aceleracion);
        imprimirResultado(masa, aceleracion, fuerza);
        -------------------------------Ejercicio 3
        final var random = new Random();
        final var velocidadInical = generarRandomDouble(10, 30, random);
        final var aceleracion = generarRandomDouble(2, 5, random);
        final var tiempo = generarRandomInt(3, 5, random);
        final var velocidadFinal = calcularVelocidadFinal(velocidadInical, aceleracion, tiempo);
        imprimirResultado2(velocidadInical, aceleracion, tiempo, velocidadFinal);
        -------------------------------Ejercicio 4
        final var random = new Random();
        final var cateto1 = generarRandomDouble(10, 30, random);
        final var cateto2 = generarRandomDouble(10, 30, random);
        final var hipotenusa = calcularHipotenusa(cateto1, cateto2);
        imprimirResultado3(cateto1, cateto2, hipotenusa);
        -------------------------------Ejercicio 5
        final var random = new Random();
        final var radio = generarRandomInt(10, 25, random);
        final var perimetro = calcularPerimetro(radio);
        final var area = calcularArea(radio);
        imprimirResultado4(radio, area, perimetro);*/


    }

        //---------------------------------Metodos de UtilitiesRandom---------------------------------
      public static int generarRandomInt(int min, int max, Random random) {
        final var numeroRandomInt = random.nextInt(max - min + 1) + min;
        return numeroRandomInt;
    }

    ;

     public static double generarRandomDouble(int min, int max, Random random) {
        final var numeroRandomdouble = (max + min) * random.nextDouble() + min;
        return numeroRandomdouble;
    }

    //-----------------------Metodos de Array random-------------------------------//

    public static int[] generarRandomArrayInt(int n,int min,int max,Random random){
        final var array = new int [n];

        for (var i = 0; i < n; i++) {
            array[i]=generarRandomInt(min,max,random);
        }
        return array;
    }

    public static double[] generarRandomArrayDouble(int n,int min,int max,Random random){
        final var array = new double[n];

        for (var i = 0; i < n; i++) {
            array[i]=generarRandomDouble(min,max,random);
        }
        return array;
    }

    //-----------------------Metodos de lista con data random-------------------------------//

    public static List<Integer> generarListaIntAleatoria(int n, int min, int max, Random random){
        final var listaAleatoria = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomInt(min,max,random));
        }
        return listaAleatoria;
    }

    public static List<Double> generarListaDoubleAleatoria(int n, int min, int max, Random random){
        final var listaAleatoria = new ArrayList<Double>();
        for (var i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomDouble(min,max,random));
        }
        return listaAleatoria;
    }













    //---------------------------------Metodos del ejecicio 2---------------------------------

    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    static void imprimirResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa de %.2f y aceleracion de %.2f tenemos una fuera de %.2f", masa, aceleracion, fuerza);
    }

    //---------------------------------Metodos del ejecicio 3---------------------------------

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + (aceleracion * tiempo);
    }

    static void imprimirResultado2(double velocidadInicial, double aceleracion, int tiempo, double velocidadFinal) {
        System.out.printf("Para una velocidad inical de %.2f, una aceleracion de %.2f y un tiempo de %d. Se tiene una velocidad final de %.2f usando MRUV", velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
    //---------------------------------Metodos del ejecicio 4---------------------------------

    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    }

    static void imprimirResultado3(double cateto1, double cateto2, double hipotenusa) {
        System.out.printf("Para los catetos %.3f y %.3f tenemos una hipotenusa de %.3f", cateto1, cateto2, hipotenusa);
    }

    //---------------------------------Metodos del ejecicio 5---------------------------------

    static double calcularArea(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    static void imprimirResultado4(int radio, double area, double perimetro) {
        System.out.printf("Para un radio de %d se tiene un perimetro de %.3f y un area de %.3f", radio, perimetro, area);
    }



}
