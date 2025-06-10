package video45;

import java.util.ArrayList;
import java.util.List;


public class videoJuegoParser {
    public static List<videoJuego> crearListaVideoJuego(List<String> listaInput){
        final var listaVideojuego = new ArrayList<video45.videoJuego>();

        for (var elemento:listaInput){
            listaVideojuego.add(parsearVideoJuego(elemento));
        }

        return listaVideojuego;
    }

    private static videoJuego parsearVideoJuego(String data){
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var epoca = Integer.parseInt(arrayString[1]);
        final var precio = Double.parseDouble(arrayString[2]);
        final var duracion = Integer.parseInt(arrayString[3]);
        final var genero = videoJuego.Genero.valueOf(arrayString[4]);
        final var empresa = videoJuego.Empresa.valueOf(arrayString[5]);

        return new videoJuego(nombre,epoca,precio,duracion, genero, empresa);

    }
}
