import java.util.ArrayList;
import java.util.List;

public class ManipulacionDeStringsEjercicios {
    public static void main(String[] args) {
        final var texto = crearString();
        final var array = texto.split(",");
        final var NombresConA=obtenerNombre(array);

        System.out.printf("%s",NombresConA);
    }

    static String crearString (){
        return "CARLOS,ARTURO,MARIA,ANA,ANAHIS,RODRIGO,PEDRO,ARMANDO";
    }
    static List<String> obtenerNombre(String[] array){
        final var listaA = new ArrayList<String>();

        for(var nombre: array){
            if (nombre.startsWith("A")){
                listaA.add(nombre);
            }
        }
        return listaA;
    }

    }


//ejercicio 1
/*
*      final var arrayNombres= crearData();
        MostrarArray(arrayNombres);
        ordenarArray(arrayNombres);
        MostrarArray(arrayNombres);
    }
    static String[] crearData(){
        return new String[]{"Carlos","Rodrigo","Juan","Arturo","Daniel","Mayra",};
    }

    static void ordenarArray(String[] array){
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i -1; j++) {
                if (array[j].compareTo(array[j + 1])>=0){
                    var temp= array[j];
                    array[j]=array[j + 1];
                    array[j + 1]=temp;
                }
            }
        }
    }
    static  void MostrarArray(String [] array){
        System.out.printf("El array es %s%n", Arrays.toString(array));
    }*/

//ejercicio 2
/*
    final var data = crearData();
        final var arrayString = arrayString(data);
        final var promedio = calcularPromedio(arrayString);
        System.out.printf("El promedio simple es de %.2f%n",promedio);
    }
    static String crearData(){
        return "5,3,15,23,12,11";
    }

    static int[] arrayString (String data){
        final var arrayString = data.split(",");
        final var n = arrayString.length;

        final var arrayNumeros = new int[n];

        for (var i = 0; i < n; i++) {
            arrayNumeros[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayNumeros;
    };

    static double calcularPromedio(int[] array){
        final var n = array.length;
        double Promedio= 0;

        for (var i = 0; i < n; i++) {
            Promedio+=array[i];
        }
        return Promedio/n;
    }

Ejercicio 3


final var array = crearString();
        final var suma = preciototal(array);
        final var precioTotal = conversionPEN(suma);
        System.out.printf("El precio total es de %.2f",precioTotal);

    }
    static String[] crearString (){
        return new String[]{"$125.32","$63.831","$632.7","$110.25678"};
    }

    static double preciototal (String[] array){
        final var n = array.length;
        var suma = 0.0;


        for (var i = 0; i < n; i++) {
            var temp = array[i].replace("$","");
            suma += Double.parseDouble(temp);
        }
        return suma;
    }
    static double conversionPEN(double suma){
        return suma * 3.5;
    }
* */