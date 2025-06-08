import utilities.ScannerManager;
import utilities.UtilitiesRandomP;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysPracticas {
    public static void main(String[] args) {
        //Asi se declaran array que ya se le conocen los valores
        //final var arrayNombres = new String[]{"Nombre 1","Nombre 2","Nombre 3","Nombre 4"};
        //final var arrayNumeros= new int[]{6,45,45,24,15,34};
        //Si no se le conocen los valores inciales
        //final var arrayNombres = new String[5];
        //final var arrayNumeros= new int[7];
        //
        //Mostrar un array en consola con printf (Se transforma el array en String)
        //System.out.printf("El valor del array es %s%n",Arrays.toString(arrayEjemplo));
        //
        //Iterar un array con foreach
        /*for (var nombre: arrayNombres){
            Systemo.out.printf("nombre:%s%n",nombre);
            }
        */
        /*Arrays en funciones
        Como parametro se declara: static void mostrarArrayIndice(int[] array){}
        Como tipo de parametro se declara asi: static int[] creaArray(){
                                                   return new int[]{1,2,3,4};
        }
         */
        final var scanner = new Scanner(System.in);
        final var random = new Random();

        //Ejercicio 1
        final var size = ScannerManager.leerInt(scanner,"Ingrese el tamaño de los arrays");
        final var min = ScannerManager.leerInt(scanner,"Ingrese el minimo del array");
        final var max = ScannerManager.leerInt(scanner,"Ingrese el maximo del array");
//        final var escalar=utilities.ScannerManager.leerInt(scanner,"Ingrese el escalar");

//        final var arrayBase = utilities.UtilitiesRandomP.generarRandomArrayInt(size,min,max,random);
//        final var ArrayEscalar = crearArrayEscalar(arrayBase,escalar);
//        imprimirInformacion(arrayBase,ArrayEscalar);
        //---------------------------------------------------------------------
        //Ejercicio 2

        final var arrayAlea1= UtilitiesRandomP.generarRandomArrayInt(size,min,max,random);
        final var arrayAlea2= UtilitiesRandomP.generarRandomArrayInt(size,min,max,random);
//        final var arraySuma = calcularSumaArray(arrayAlea1,arrayAlea2);
//        imprimirInformacion2(arrayAlea1,arrayAlea2,arraySuma);
        //---------------------------------------------------------------------
        //Ejercicio 3
        final var arrayAleaDouble1= UtilitiesRandomP.generarRandomArrayDouble(size,min,max,random);
        final var arrayAleaDouble2= UtilitiesRandomP.generarRandomArrayDouble(size,min,max,random);
//        final var promedio = calcularPromedioPonderado(arrayAleaDouble1,arrayAleaDouble2);
//        mostrarResultado3(arrayAleaDouble1,arrayAleaDouble2,promedio);
        //---------------------------------------------------------------------
        //Ejercicio 4
        final var arrayAleaDoubleRadios= UtilitiesRandomP.generarRandomArrayDouble(size,min,max,random);
        final var arrayPerimetro = calcularArrayPerimetro(arrayAleaDoubleRadios);
        final var arrayArea = calcularArrayArea(arrayAleaDoubleRadios);
        mostrarResultado4(arrayAleaDoubleRadios,arrayPerimetro,arrayArea);




    }

    //Metodos del ejercicio 1
    static int[] crearArrayEscalar (int[] arrayBase,int escalar){
        var sizeArray = arrayBase.length;
        final var ArrayEscalar = new int[sizeArray];
        for (var i = 0; i < sizeArray; i++) {
            ArrayEscalar[i]=arrayBase[i] * escalar;
        }
        return ArrayEscalar;
    }

    //comentario
    static void imprimirInformacion(int[] arrayBase, int[] arrayEscalar){
        System.out.printf("El array Base es %s%n%n", Arrays.toString(arrayBase));
        System.out.printf("El array escalado es %s%n%n", Arrays.toString(arrayEscalar));
    }
    //-----------------------------------------------------------------------------------

    //Metodos del ejercicio 2

    static int[] calcularSumaArray(int[] array1,int[] array2){
        final var size = array1.length;
        var Array3 = new int[size];
        for (var i = 0; i < size; i++) {
            Array3[i] = array1[i] + array2[i];
        }
        return Array3;
    }

    static void imprimirInformacion2 (int[] array1,int[] array2,int[] array3){
        System.out.printf("Array aleatorio 1: %s%n%n",Arrays.toString(array1));
        System.out.printf("Array aleatorio 2: %s%n%n",Arrays.toString(array2));
        System.out.printf("Array Sumatoria : %s%n%n",Arrays.toString(array3));
    }
    //-----------------------------------------------------------------------------------

    //Metodos del ejercicio 3

    static double calcularPromedioPonderado(double[] array1,double[] array2){
        final var size = array1.length;
        var numerador = 0.0;
        for (var i = 0; i < size; i++) {
            numerador+= array1[i] * array2[i];
        }
        return numerador/size;
    }

    static void mostrarResultado3 (double[] array1,double[] array2,double array3){
        System.out.printf("Array 1 %s%n",Arrays.toString(array1));
        System.out.printf("Array 1 %s%n",Arrays.toString(array2));
        System.out.printf("Array promedio simple %.2f%n",array3);

    }
    //Metodos del ejercicio 4

    static double[] calcularArrayPerimetro(double[] array1){
        var size= array1.length;
        var arrayR = new double[size];

        for (var i = 0; i < size; i++) {
            arrayR[i] = Math.PI * Math.pow(array1[i],2);
        }
        return arrayR;
    }
    static double[] calcularArrayArea (double[] array1){
        var size= array1.length;
        var arrayR = new double[size];
        for (var i = 0; i < size; i++) {
            arrayR[i]=2*Math.PI * array1[i];
        }
        return arrayR;
    }

    static void mostrarResultado4 (double[] array1,double[] array2,double[] array3){
        System.out.printf("El array de radio es %s%n",Arrays.toString(array1));
        System.out.printf("El array de perimetro es %s%n",Arrays.toString(array2));
        System.out.printf("El array de area es %s%n",Arrays.toString(array3));

    }

}
