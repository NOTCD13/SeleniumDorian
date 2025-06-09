package ejercicioPOO;

public class ejercicio2 {
    public static void main(String[] args) {
        final var instancia1 = new Producto("Salmon",15.42,35,2.8292,true,4.6006);
        final var instancia2 = new Producto("jitomate",11.42,84,3.8292,false,9.6006);

        System.out.printf("NOMBRE: %s , PRECIO: %.2f, STOCK: %d PESO: %.2f, PERECIBLE: %b VOLUMEN: %.2f%n%n ",instancia1.getNombre(),instancia1.getPrecio(),instancia1.getStock(),instancia1.getPeso(),instancia1.isPerecible(),instancia1.getVolumen());
        System.out.printf("NOMBRE: %s , PRECIO: %.2f, STOCK: %d PESO: %.2f, PERECIBLE: %b VOLUMEN: %.2f ",instancia2.getNombre(),instancia2.getPrecio(),instancia2.getStock(),instancia2.getPeso(),instancia2.isPerecible(),instancia2.getVolumen());

    }
}
