public class EjercicioPrintf {
    public static void main(String[] args) {
        final var numeroGatos = 5;
        final var peso = 13.2;
        final var LibroFavorito = "Hola mundo";
        final var esBajo = false;
        final var inicial = "V";

        System.out.printf("hola tengo %d gatos%n", numeroGatos);
        System.out.printf("%.2f es mi peso", peso);
        System.out.printf("mi libro favorito es %s y lo leo todas las noches%n", LibroFavorito);
        System.out.printf("Mi inical es %c%n", inicial);
        System.out.printf("Si me preguntan si soy bajo pues la respuesta es %b%n", esBajo);

    }
}
