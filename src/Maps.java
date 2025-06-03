/* Declarar maps si se conocen los valores del mismo
 *  final var mapPersonas = Map.of(
 *          1,"Carlos",
 *          2,"Rodrigo",
 *          3,"Jorge",
 *          4,"Alfonso"
 * );
 *
 * Declarar maps si no se conocen los valores iniciales
 * final var mapPersonas = new HashMap<Integer, String>();
 * final var mapNumeros = new HashMap<Integer, Double>();
 *
 * Agregar pares a un map
 * se usa el metodo put: mapPersonas.put(1,"Rodrigo")
 *
 * Obtener el value a traves del key
 * se usa el metodo get: mapPersonas.get(1)
 *
 * Se muestra el map usando el %s
 *
 * Como validar elementos de un map (KEYS)
 * if(map.Personas.containsKey(2)){}
 *
 * Como validar elementos de un map (VALUE)
 * if(map.Personas.containsValue("Jose")){}
 *
 * Bucle for each para maps
 *
 * for (var par: mapStock.entrySet()){
 *      system.out.printf("Key: %s, value:%d%n",par.getKey(),par.getValue())
 * }
 *
 * Maps en funciones
 * como parametro: static void imprimir (Map<String, Integer> map){}
 * como tipo de retorno: static Map<String, Integer> crearMapStock(){}
 *
 * */


import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        final var scanner= new Scanner(System.in);
//        var map1 = crearMap();
//        int seleccion;
//        do {
//            seleccion = ScannerManager.leerInt(scanner,"Ingrese una key");
//            mostrarUsuario(seleccion,map1);
//        } while(seleccion !=-1);

        var map2 = crearMAP2();
        var suma = calcularPrecio(map2,scanner);
        System.out.printf("La suma es: %.2f",suma);

    }

    static Map<Integer,String> crearMap(){
        return Map.of(
            1,"CocoX",
            2,"Socrates",
            3,"Calvario0",
            4,"Kitty",
            5,"JavaJavaDu",
            6,"Rexxes"
        );
    }

    static void mostrarUsuario(int key, Map<Integer,String> map){
        if (map.containsKey(key)){

            System.out.printf("Para el id: %d existe un username: %s%n",key,map.get(key));

        } else {
            System.out.printf("El ID: %d no encontrado en BD %n",key);
        }
    }

    static Map<String,Double> crearMAP2(){
        return Map.of(
                "Robot",15.21,
                "Pelota",23.12,
                "Carro",11.68,
                "Oso",5.84,
                "Baraja",9.99,
                "Bateria",43.12
        );
    }

    static double calcularPrecio(Map<String ,Double> map,Scanner scanner){
        double AcumPrecio=0;
        String eleccion;
        do {
            eleccion = ScannerManager.leerString(scanner,"Ingrese un juguete");

            if(map.containsKey(eleccion)){
                AcumPrecio += map.get(eleccion);
            } else if (eleccion.equals("salida"))
            {
                eleccion="salida";
            } else {
                System.out.printf("Juguete invalido%n");

            }

        }while(!eleccion.equals("salida"));

        return AcumPrecio;
    }

}





