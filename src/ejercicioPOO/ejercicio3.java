package ejercicioPOO;

public class ejercicio3 {
    public static void main(String[] args) {
        final var videojuego1 = new videoJuego("Blue protocol",2011,58.99,45, videoJuego.Genero.TERROR, videoJuego.Empresa.XBOX);
        final var videojuego2 = new videoJuego("god of war",2011,58.99,45, videoJuego.Genero.TERROR, videoJuego.Empresa.XBOX);
        final var videojuego3 = new videoJuego("Mario car",2011,58.99,45, videoJuego.Genero.TERROR, videoJuego.Empresa.XBOX);

        System.out.printf("nombre: %s genero: %s empresa: %s%n",videojuego1.getNombre(),videojuego1.getGenero(),videojuego1.getEmpresa());
        System.out.printf("nombre: %s genero: %s empresa: %s%n",videojuego2.getNombre(),videojuego2.getGenero(),videojuego2.getEmpresa());
        System.out.printf("nombre: %s genero: %s empresa: %s%n",videojuego3.getNombre(),videojuego3.getGenero(),videojuego3.getEmpresa());
    }
}
//