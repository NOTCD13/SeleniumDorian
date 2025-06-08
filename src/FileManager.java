import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {

    }

     public static List<String> leerFile(File file){
        final var lista= new ArrayList<String>();

        try {
            final var scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                lista.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Error al abrir el file");
            System.out.printf("FileNotFoundException %s%n",fileNotFoundException.getLocalizedMessage());
        }
        return lista;
    }

     public static void escribirFile(File file, List<String> lista){
        try {
            final var fileWriter = new FileWriter(file);
            for (var linea:lista){
                final var lineaEscribir = String.format("%s%n",linea);
                fileWriter.write(lineaEscribir);
            }
            fileWriter.close();
        } catch (IOException ioException){
            System.out.println("Error al escribir el file");
            System.err.printf("IOException %s%n",ioException.getLocalizedMessage());
        }
    }


}
