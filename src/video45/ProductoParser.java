package video45;

import video43.Producto43;

import java.util.List;

public class ProductoParser {
    //lista viene de leer el file
    public static Producto43[] obtenerArrayProductos(List<String> listaInput){

        final var n = listaInput.size();
        final  var arrayProductos = new Producto43[n];

        for (var i = 0; i < n; i++) {
            arrayProductos[i]=parsearProducto(listaInput.get(i));
        }
        return arrayProductos;
    }

    private static Producto43 parsearProducto(String data){
        final var arrayString = data.split(",");

        final var nombre=arrayString[0];
        final var precio=Double.parseDouble(arrayString[1]);
        final var stock=Integer.parseInt(arrayString[2]);
        final var peso=Double.parseDouble(arrayString[3]);
        final var esPerecible=Boolean.parseBoolean(arrayString[4]);
        final var volumen=Double.parseDouble(arrayString[5]);

        return  new Producto43(
                nombre,
                precio,
                stock,
                peso,
                esPerecible,
                volumen
        );

    }
}
