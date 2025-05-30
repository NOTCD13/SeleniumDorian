import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        //COMO HACER EL RANDOM ENTEROS: random.nextInt(maximo - minimo + 1) + minimo
        //Ejercicio 1
        final var random = new Random();
        final var radio = random.nextInt(100 - 20 + 1) + 20;
        final var area = Math.PI * Math.pow(radio, 2);
        final var perimetro = 2 * Math.PI * radio;

        System.out.printf("%nPara un radio de %d se tiene un perimetro de %.3f y un area de %.3f", radio, perimetro, area);
        //Ejercicio 2
        //COMO HACER EL RANDOM CON DECIMALES: (maximo - minimo) * random.nextDouble() +minimo
        final var cateto1 = (100 - 5) * random.nextDouble() + 5;
        final var cateto2 = (100 - 5) * random.nextDouble() + 5;
        ;
        final var Hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("%nPara los catetos %.2f y %.2f tenemos una hipotenusa de %.2f", cateto1, cateto2, Hipotenusa);

    }
}
