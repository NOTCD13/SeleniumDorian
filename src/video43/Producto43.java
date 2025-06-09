package video43;

public class Producto43 {
    private final String nombre;
    private final double precio;
    private final int stock;
    private final double peso;
    private final boolean perecible;
    private final double volumen;

    public Producto43(String nombre, double precio, int stock, double peso, boolean perecible, double volumen) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.peso = peso;
        this.perecible = perecible;
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        final var multilinea = """
                
                {
                nombre: %s
                precio: %.2f
                stock: %d
                peso: %.2f
                perecible: %b
                volumen: %.2f
                }
              
                """;
        return String.format(
                multilinea,
                nombre,
                precio,
                stock,
                peso,
                perecible,
                volumen
        );
    }

    public String getNombre43() {
        return nombre;
    }

    public double getVolumen43() {
        return volumen;
    }

    public boolean isPerecible43() {
        return perecible;
    }

    public double getPeso43() {
        return peso;
    }

    public int getStock43() {
        return stock;
    }

    public double getPrecio43() {
        return precio;
    }


}

