import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ManipulacionFilesPr {
    public static void main(String[] args) {

        final var listaInput = FileManager.leerFile(new File("src/files/notas.csv"));
        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listabajo = new ArrayList<String>();

        rellenarLista(listaInput,listaAlto,listaMedio,listabajo);

        FileManager.escribirFile(new File("src/files/NotasAltas.txt"),listaAlto);
        FileManager.escribirFile(new File("src/files/NotasMedias.txt"),listaMedio);
        FileManager.escribirFile(new File("src/files/NotasBajas.txt"),listabajo);

    }
    private static Notas calificarAlumno(int nota){
        if (nota>=16){
            return Notas.ALTO;
        } else if (nota >=10) {
            return Notas.MEDIO;
        } else {
            return Notas.BAJO;
        }
    }

    enum Notas{
        ALTO,
        MEDIO,
        BAJO
    }

    private static void rellenarLista(
            List<String> ListaInput,
            List<String> ListaAlto,
            List<String> ListaMedio,
            List<String> ListaBajo
    ){
        for (var alumno:ListaInput){
            final var arrayData = alumno.split(",");

            final var nombre = arrayData[0];
            final var nota = Integer.parseInt(arrayData[1]);

            final var calificacion = calificarAlumno(nota);

            switch (calificacion){
                case ALTO -> ListaAlto.add(nombre);
                case MEDIO -> ListaMedio.add(nombre);
                case BAJO -> ListaBajo.add(nombre);
            }
        }
    }




}




//*****************************************************************************
//    private static String[] convertirListaArray(List<String> listaJuegos){
//        final var n = listaJuegos.size();
//        final var arrayJuegos = new String[n];
//
//        for (var i = 0; i < n; i++) {
//            arrayJuegos[i]= listaJuegos.get(i);
//        }
//        return arrayJuegos;
//
//    }
//
//    private static void ordenarArray(String[] arrayJuegos){
//        final var n = arrayJuegos.length;
//
//        for (var i = 0; i < n; i++) {
//            for (var j = 0; j < n - i -1; j++) {
//                if (arrayJuegos[j].compareTo(arrayJuegos[j+1])>=0){
//                    final var temp = arrayJuegos[j];
//                    arrayJuegos[j]=arrayJuegos[j+1];
//                    arrayJuegos[j + 1]=temp;
//                }
//            }
//        }
//    }
//
//    private static List<String> convertirArrayLista(String[] arrayJuegos){
//        final var lista = new ArrayList<String>();
//
//        for (var juego : arrayJuegos){
//            lista.add(juego);
//        }
//        return lista;
//    }



//Ejercicio 1
//final var listaInput = FileManager.leerFile(new File("src/files/videojuegos.csv"));
//
//final var arrayJuegos = convertirListaArray(listaInput);
//ordenarArray(arrayJuegos);
//final var listaJuegosOrdenados = convertirArrayLista(arrayJuegos);
//
//        FileManager.escribirFile(new File("src/files/VideojuegosOrdenados.txt"),listaJuegosOrdenados);