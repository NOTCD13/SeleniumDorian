package video45;
import video43.Producto43;
import java.io.File;
import java.util.Arrays;


public class main_ {
    public static void main(String[] args) {
        final var fileInput = new File("src/video45/productos.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var arrayProductos = ProductoParser.obtenerArrayProductos(listaInput);
        ordenarArrayProducto(arrayProductos);

        System.out.printf("Array ordenado %s%n", Arrays.toString(arrayProductos));

    }


    //bubble sort
    private static void ordenarArrayProducto(Producto43[] array){
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getPrecio43()>array[j + 1].getPrecio43()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}
