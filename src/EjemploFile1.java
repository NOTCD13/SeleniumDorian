import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFile1 {
    public static void main(String[] args) {
        final var file = new File("src/files/output.txt");

        try {
            final var fileWriter = new FileWriter(file);
            fileWriter.write(String.format("Hola%n") );
            fileWriter.write(String.format("mundo%n") );
            fileWriter.write(String.format("como%n") );
            fileWriter.write(String.format("estas%n") );
            fileWriter.write(String.format("calvario31%n") );

            fileWriter.close();

        } catch (IOException ioException){
            System.out.println("error al abrir el file");
            System.err.printf("IOException %s%n",ioException.getLocalizedMessage() );
        }

    }
}

// como leer un file en java
/*
try {
            final var scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Error al abrir el file");
            System.err.printf("FileNotFoundException: %s%n",fileNotFoundException.getLocalizedMessage());
        }
* */

// como escribir en un file de java