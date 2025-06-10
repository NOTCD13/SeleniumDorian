package video45;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main_2 {
    public static void main(String[] args) {
        final var fileInput = new File("src/video45/videojuegos.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var listaVideoJuegos = videoJuegoParser.crearListaVideoJuego(listaInput);
        final var listaXbox = filtrarListaXbox(listaVideoJuegos);
        System.out.printf("La lista es: %s%n:",listaXbox);
    }
    private static List<videoJuego> filtrarListaXbox(List<videoJuego> listaTotal){
        final var listaXbox = new ArrayList<videoJuego>();

        for (var videojuego1: listaTotal){
            if (videojuego1.getEmpresa().equals(videoJuego.Empresa.XBOX)){
                listaXbox.add(videojuego1);
            }
        }
        return listaXbox;
    }
}
