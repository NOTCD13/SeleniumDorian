import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UsoClaseFileManager {
    public static void main(String[] args) {
        final var fileInput = new File("src/files/input.txt"); //File leer = input
        final var fileOutput = new File("src/files/output.txt"); //File escribir = output

        final var listaInput = FileManager.leerFile(fileInput); //Leo lista de String
        final var listaOutput = editarInformacion(listaInput);

        FileManager.escribirFile(fileOutput,listaOutput);
                   //Escribo la listaOutput en el fileOutput
    }

    private static List<String> editarInformacion (List<String>listaInput){ //Metodo que transforma cada casilla a mayusculas
    final var ListaOutput = new ArrayList<String>();

    for (var elemento:listaInput){
        ListaOutput.add(elemento.toUpperCase());
    }
    return ListaOutput;
    }
}
