public class OperacionesMatematicas {
    public static void main(String[] args) {

        //Ejercicio 1
        final var velocidadInicial = 15.24;
        final var Aceleracion = 3.75;
        final var Tiempo = 5;
        final var velocidadFinal = velocidadInicial + (Aceleracion * Tiempo);

        System.out.printf("Para una velocidad inicial %.3f , una aceleracion %.3f y un tiempo %d.Se tienen una velocidad final %.3f", velocidadInicial, Aceleracion, Tiempo, velocidadFinal);

        //Ejercicio 2
        final var Aceleracion2 = 100.5032;
        final var Masa = 76.1265;
        final var Fuerza = Masa * Aceleracion2;

        System.out.printf("%nPara una masa de %.4f y una aceleracion de %.4f tenemos una fuerza de %.4f", Masa, Aceleracion2, Fuerza);

        //Ejercicio 3
        final var cateto1 = 55.12;
        final var cateto2 = 23.12;
        final var Hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("%nPara los catetos %.3f y %.3f tenemos una hipotenusa de %.3f", cateto1, cateto2, Hipotenusa);

        //Ejercicio 4
        final var radio = 25;
        final var area = Math.PI * Math.pow(radio, 2);
        final var perimetro = 2 * Math.PI * radio;

        System.out.printf("%nPara un radio de %d se tiene un perimetro de %.3f y un area de %.3f", radio, perimetro, area);

    }
}
