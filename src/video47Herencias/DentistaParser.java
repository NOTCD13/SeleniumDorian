package video47Herencias;

import java.util.ArrayList;
import java.util.List;

public class DentistaParser {
    public static List<Dentista> generarListaDentista(List<String> listaInput){
        final var listaDentista = new ArrayList<Dentista>();

        for (var data : listaInput){
            listaDentista.add(parserDentista(data));
        }
        return listaDentista;
    }
    private static Dentista parserDentista(String data){
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var centroDental = arrayString[4];
        final var pacientesFelices = Integer.parseInt(arrayString[5]);
        final var pacientesTotales = Integer.parseInt(arrayString[6]);

        return new Dentista(nombre,apellido,edad,casado,centroDental,pacientesFelices,pacientesTotales);
    }
}
