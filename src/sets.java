import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        /*
        * Declarar Sets
        * final var setNumeros = new HashSet<>(Arrays.asList(3,4,5,6,7,));
        * final var setNombres = new HashSet<>(Arrays.asList("Carlos","Carlos","Carlos","Carlos"));
        *
        * final var setNumeros = new HashSet<Integer>();
        * final var setNombres = new HashSet<String>();
        *
        * metodo add
        * imprimir con un %s
        * metodo size()
        * iterar set con foreach
        *
        * set en funciones
        * como parametro: static void imprimirSetNombre(Set<String> setNombres){}
        * como tipo de retorno: static Set<String> crearSetNombres(){}
        *
        * operaciones entre sets
        * para unir data entre 2 sets se usa le metodo addAll: SetA.addAll(setB)
        * conocer la interseccion entre 2 sets se usa el retainAll: setA.retaionAll(set)
         */

        final var scanner = new Scanner(System.in);
//        Ejercicio 1
//        var set1 = crearSetGrupo();
//        var set2 = crearSetGrupo2(scanner);
//        set1.addAll(set2);
//        imprimirSet(set1);
//        ------------------------------------------------------
//        Ejercicio 2
//        var set1 = crearSetUtiles1();
//        var set2 = crearSetUtiles2(scanner);
//        set1.removeAll(set2);
//        imprimirSet(set1);

//        Ejercicio 2
        var set1 = crearSetAnimales1();
        var set2 = crearSetAnimales2(scanner);
        set1.retainAll(set2);
        imprimirSetA(set1);


    }

//    static Set<String> crearSetGrupo(){
//        return new HashSet<>(Arrays.asList("Oso","Carro","Patito","Robot","Pelota"));
//    }
//
//    static Set<String> crearSetGrupo2(Scanner scanner){
//        var setNuevo = new HashSet<String>();
//        String eleccion;
//        do {
//        eleccion = ScannerManager.leerString(scanner,"Ingrese un regalo o escriba salida para terminar").toLowerCase();
//        if (!eleccion.equals("salida")){
//            setNuevo.add(eleccion);
//        };
//        } while (!eleccion.equals("salida"));
//
//        return setNuevo;
//    }
//
//    static void imprimirSet (Set<String> setNuevo){
//        System.out.printf("El array combinado es %s%n",setNuevo);
//    }

//    static Set<String> crearSetUtiles1(){
//        return new HashSet<>(Arrays.asList("lapicero","Borrador","Lonchera","Mochila","Corrector","Goma","Tijera"));
//    }
//
//    static Set<String> crearSetUtiles2(Scanner scanner){
//        var setNuevo = new HashSet<String>();
//        String eleccion;
//        do {
//        eleccion = ScannerManager.leerString(scanner,"Ingrese los utiles o escriba salida para terminar").toLowerCase();
//        if (!eleccion.equals("salida")){
//            setNuevo.add(eleccion);
//        };
//        } while (!eleccion.equals("salida"));
//
//        return setNuevo;
//    }
//
//    static void imprimirSet (Set<String> setNuevo){
//        System.out.printf("Los utiles que faltantes son  %s%n",setNuevo);
//    }

    static Set<String> crearSetAnimales1(){
        return new HashSet<>(Arrays.asList("oso","gorila","zebra","leon","pantera"));
    }

    static Set<String> crearSetAnimales2(Scanner scanner){
        var setNuevo = new HashSet<String>();
        String eleccion;
        do {
            eleccion = ScannerManager.leerString(scanner,"Ingrese los animales o escriba salida para terminar").toLowerCase();
            if (!eleccion.equals("salida")){
                setNuevo.add(eleccion);
            };
        } while (!eleccion.equals("salida"));

        return setNuevo;
    }

    static void imprimirSetA (Set<String> setNuevo){
        System.out.printf("Los animales en comun son %s%n",setNuevo);
    }

}
