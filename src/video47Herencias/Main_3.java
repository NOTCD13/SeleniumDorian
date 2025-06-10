package video47Herencias;

import video45.FileManager;

import java.io.File;
import java.util.Random;

public class Main_3 {
    public static void main(String[] args) {
        final var listaInputIngeniero = FileManager.leerFile(new File("src/video47Herencias/ingenieros.csv"));

        final var listaInputAbogado = FileManager.leerFile(new File("src/video47Herencias/abogados.csv"));

        final var listaInputDentista = FileManager.leerFile(new File("src/video47Herencias/dentistas.csv"));

        final var listaIngenieros = IngenieroParser.generarListaIngeniero(listaInputIngeniero);
        final var listaAbogados = AbogadoParser.generarListaAbogado(listaInputAbogado);
        final var listaDentistas = DentistaParser.generarListaDentista(listaInputDentista);

        final var random = new Random();
        final var randomIndexIngeniero = UtilitiesRandomP.generarRandomInt(0,listaIngenieros.size() - 1,random);
        final var randomIndexAbogado = UtilitiesRandomP.generarRandomInt(0,listaAbogados.size() - 1,random);
        final var randomIndexDentista = UtilitiesRandomP.generarRandomInt(0,listaDentistas.size() - 1,random);

        System.out.printf("Random ingeniero: %s%n",listaIngenieros.get(randomIndexIngeniero));
        System.out.printf("Random dentista: %s%n",listaDentistas.get(randomIndexDentista));
        System.out.printf("Random Abogado: %s%n",listaAbogados.get(randomIndexAbogado));


//
    }
}
