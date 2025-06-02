import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listas {
    public static void main(String[] args) {
        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listaBajo = new ArrayList<String>();

//        final var arrayNombres= crearArrayNombre();
//        final var arrayImc = crearArrayImc();
//        rellenarListasIMC(listaAlto,listaMedio,listaBajo,arrayNombres,arrayImc);
//        ----------------------------------------------------------------------------
//        final var arrayNombres = crearArrayNombre();
//        final var arrayNotas = crearArrayNotas();
//        rellenarListasNotas(listaAlto,listaMedio,listaBajo,arrayNombres,arrayNotas);
//        ----------------------------------------------------------------------------
//        System.out.printf("Lista alto: %s%n",listaAlto);
//        System.out.printf("Lista medio: %s%n",listaMedio);
//        System.out.printf("Lista bajo: %s%n",listaBajo);
//        ----------------------------------------------------------------------------
        final var lista =  UtilitiesRandomP.generarListaIntAleatoria(30,10,500,new Random());
        imprimirLista(lista);
        ordenarLista(lista);
        imprimirLista(lista);


    }
    static String[] crearArrayNombre(){
       return new String[]{"Carlos","Antonio","Jorge","Ana","Mayra","Julieta","Maria","Rodrigo","Anabel","Luz"};
    }
    static double[] crearArrayImc(){
        return UtilitiesRandomP.generarRandomArrayDouble(10,1,50,new Random());
    }
    static int[] crearArrayNotas(){
        return UtilitiesRandomP.generarRandomArrayInt(10,1,20,new Random());
    }
    static void rellenarListasIMC(
            List<String> listaAlto,
            List<String> listaMedio,
            List<String> listaBajo,
            String[] arrayNombres,
            double[] arrayImc
    ){
        final var n = arrayImc.length;
        for (var i = 0; i < n; i++) {
            final var imc = arrayImc[i];
            final var nombre = arrayNombres[i];

            if (imc >= 40){
                listaAlto.add(nombre);
            } else if(imc>=25){
                listaMedio.add(nombre);
            } else {
                listaBajo.add(nombre);
            }
        }
    }

    static void rellenarListasNotas(
            List<String> listaAlto,
            List<String> listaMedio,
            List<String> listaBajo,
            String[] arrayNombres,
            int[] arrayNotas
    ){
        final var n = arrayNotas.length;
        for (var i = 0; i < n; i++) {
            final var nota =  arrayNotas[i];
            final var nombre = arrayNombres[i];

            if(nota >=16){
                listaAlto.add(nombre);
            } else if (nota>10){
                listaMedio.add(nombre);
            } else {
                listaBajo.add(nombre);
            }

        }
    }


    static void ordenarArray(int[] array){
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]){
                    final var tempo = array[j];
                    array[j]=array[j + 1];
                    array[j + 1]=tempo;
                }
            }
        }
    }
    static void ordenarLista(List<Integer> lista){
        final var n = lista.size();
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n -1; j++) {
                if (lista.get(j) > lista.get(j + 1)){
                    final var temp = lista.get(j);
                    lista.set(j,lista.get(j + 1));
                    lista.set(j + 1,temp);
                }
            }
        }
    }
    static void imprimirLista(List<Integer> lista){
        System.out.printf("La lista es: %s%n",lista);
    }
}


/**
 * Declarar listas conociendo los valores
 * final var listaNumeros = Arrays.asList(2,5,6,7);
 * final var listaNombres = Arrays.asList("Nombre 1","Nombre 2","Nombre 3","Nombre 4")
 *
 * Declarar lostas sin conocer los valores
 * final var listaNumeros = new ArrayList<Integer>();
 * final var listaNombres = new ArrayList<String>();
 *
 * Manipular valores en una lista
 * metodo add para agregar valores a una lista
 * metodo set para actualizar un valor de la lista
 *
 * codigo de ejemplo:
 * final var listarNumeros = new ArrayList<Integer>();
 *
 * listaNumeros.add(5);
 * listaNumeros.add(3);
 * listaNumeros.add(15);
 * listaNumeros.set(0,15);
 *
 * metodo get para obtener los valores de una lista en base a su index
 * souf ("El elemento con index 1 es %d%n",listaNumeros.get(1))
 *
 * Para imprimir una lista se usa el %s en el souf ya que las listas tienen el metodo toString
 * souf ("La lista completa es  %s%n",listaNumeros)
 *
 *metodo size para conocer el tamaño de la lista en cuestion
 * souf ("Su tamaño es %d%n",listaNumeros.size());
 *
 * acceder al ultimo elemento de la lista
 * souf("El ultimo elemento es %d%n",listaNumeros.get(listaNumeros.size()-1));
 *
 * Iterar una lista con for:
 *
 * for (var i = 0; i<n;i++){
 *     souf("index: %d, value: %s%n",i,listaNombres.get(i));
 * }
 *
 * Iterar una lista con foreach
 *
 * for ( var elemento:listaNombres ){
 *     souf("nombre: %s%n",elemento);
 * }
 *
 * Listas en funciones
 * como parametro: static void mostrarValores(list<String> lista){}
 * como tipo de retorno: static list<String> crearNombres(){}
 *
 * metodo tipo boolean para saber si un elemento esta en una lista
 * if (ListaInvitados.contains("Juliana"))
 *
 * metodo tipo boolean para saber si una lista esta vacia
 *if(listaPares.isEmpty())
 *
 */
