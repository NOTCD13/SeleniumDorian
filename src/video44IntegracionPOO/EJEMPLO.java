package video44IntegracionPOO;

import java.util.HashMap;
import java.util.Map;

public class EJEMPLO {
    public static void main(String[] args) {

    }
    private  static Map<String,Perro> crearMapPerros(){
        final var mapPerro = new HashMap<String, Perro>();

        final var perro1 = new Perro(10,"a","R",23.13);
        final var perro2 = new Perro(10,"a","R",23.13);
        final var perro3 = new Perro(10,"a","R",23.13);

        mapPerro.put(perro1.getNombre(),perro1);
        mapPerro.put(perro2.getNombre(),perro2);
        mapPerro.put(perro3.getNombre(),perro3);

        return mapPerro;
    }


}



//Ejemplo 1
//        final var perro= crearPerro();
//    }
//
//    private static Perro crearPerro(){
//        return new Perro(2,"Spike","Carlos",12.15);
//    }
//
//    private static void dormirPerro(Perro perro, int tiempo){
//        perro.dormir(tiempo);

//Ejemplo 2

//final var arrayPerros = crearArrayPerros();
//dormirPerros(arrayPerros,3);
//
//   }
//public static Perro[] crearArrayPerros(){
//    final var arrayPerro = new Perro[3];
//    arrayPerro[0] = new Perro(10,"Spike","Rodrigo",23.12);
//    arrayPerro[1] = new Perro(10,"Spike","Rodrigo",23.12);
//    arrayPerro[2] = new Perro(10,"Spike","Rodrigo",23.12);
//    return arrayPerro;
//}
//
//public  static void dormirPerros(Perro[] arrayPerro,int tiempo){
//    for (var perro:arrayPerro){
//        perro.dormir(tiempo);
//    }

//Ejemplo 3

//final var listaPerros = crearListaPerros();
//dormirPerros(listaPerros,3);
//    }
//private  static List<Perro> crearListaPerros(){
//    final var listaPerro = new ArrayList<Perro>();
//
//    listaPerro.add(new Perro(10,"Spike","Rodrigo",23.12));
//    listaPerro.add(new Perro(4,"Spike","Rodrigo",23.12));
//    listaPerro.add(new Perro(2,"Spike","Rodrigo",23.12));
//
//    return listaPerro
//}
//
//private static void dormirPerros(List<Perro> listaPerro,int tiempo){
//    for (var perro: listaPerro){
//        perro.dormir(tiempo);
//    }
//}

//Ejemplo 4

//final var setPerro = crearSetPerros();
//dormirPerros(setPerro,3);
//    }
//private  static Set<Perro> crearSetPerros(){
//    final var setPerro = new HashSet<Perro>();
//
//    setPerro.add(new Perro(10,"Spike","Rodrigo",23.12));
//    setPerro.add(new Perro(4,"s","g",28.12));
//    setPerro.add(new Perro(2,"i","u",21.12));
//
//    return setPerro;
//}
//
//private static void dormirPerros(Set<Perro> listaPerro,int tiempo){
//    for (var perro: listaPerro){
//        perro.dormir(tiempo);
//    }

