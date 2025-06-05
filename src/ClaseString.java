public class ClaseString {
    public static void main(String[] args) {
        //String como array de char
        final var cadena = "Aloha";
        final var arrayChar = cadena.toCharArray();
        for (var i = 0; i < arrayChar.length; i++) {
            System.out.printf("Index %d, value %c%n",i,arrayChar[i]);
        }
        //String como clase
        /**
         * cadena.length()= size de la cadena
         * cadena.charAt(index)= obtener char segun un index
         * cadenaEx.indexOf(char/String) = indice del 1er char o indice de la subcadena indicada
         */

        final var multilinea = """
                nombre: Carlos
                altura: 1.86
                edad: 35
                """;

        System.out.println(multilinea);
        imprimirInfo("Dorian",22,1.84);


        //Comparar Strings
        //cadena1.equals(cadena2) //indica si las cadenas son exactamente iguales
        //cadena1.equalsIgnoreCase(cadena2) // si las cadenas son iguales sin importar las mayusculas o minisculas
        //cadena1.contains(cadena2) //Indica si la cadena1 tiene como substring/subcadena la cadena2 se usa con un if

        //Convertir mayusculas y minusculas
        //cadena.toUpperCase() //convierte la cadena en mayusculas
        //cadena.toLowerCase() //Convierte la cadena en minusculas

        //Comparar Strings alfabeticamente usando .compareTo(cadena2) y .compareToIgnoreCase(cadena2)
        //Un integer que nos indica si el cadena1 es mayor/menor/igual alfabeticamente que la cadena 2 sin ingnorar las mayusculas/minusculas
        //0< si la cadena1  es "menor" alfabeticamente que la cadena 2
        //0= si la cadena1  es "igual" que la cadena 2
        //0> si la cadena1  es "mayor" alfabeticamente que la cadena 2

        //Desdoblar un string con un separador
        //cadenaEx.split("separador")
        //cadena.replace(cadena1,cadena2) //Reemplaza todas las cadena1 por cadena2

        //cadena.startsWith(cadena/char) //Verifica si la cadena comienza con la letra indicada //boolean
        //cadena.endsWith(cadena/car) //Verifica si la cadena termina con la letra indicada // boolean

        //if(nombre.isEmpty()) verifica si la cadena tiene longitud 0 // boolean











    }
    //String format: tiene la misma funcionalidad que printf, nada mas que en vez de mostrarlo en consola nos devuelve un String
    static String obtenerStringFormateado(String nombre,int edad,double peso){
        return String.format("Mi nombre es %s, tengo %d de edad y peso %.2f%n",nombre,edad,peso);
    }

    //Se puede escribir un String de varias lineas usando triples comillas dobles
    static void imprimirInfo(String nombre, int edad, double altura){
        final var multilinea = """
                nombre: %s
                altura: %.2f
                edad: %d
                """;
        System.out.printf(multilinea,nombre,altura,edad);
    }

}
