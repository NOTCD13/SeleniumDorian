package video45;

import video43.Producto43;

public class main_ {
    public static void main(String[] args) {

    }

    private static void ordenarArrayProducto(Producto43[] array){
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                final var temp = array[j];
                array[j] = array[j+1];
                array[j+1]=temp;
            }
        }
    }
}
