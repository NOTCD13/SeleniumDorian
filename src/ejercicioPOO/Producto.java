package ejercicioPOO;

public class Producto {
    private final String nombre;
    private final double precio;
    private final int stock;
    private final double peso;
    private final boolean perecible;
    private final double volumen;

    public Producto(String nombre, double precio, int stock, double peso, boolean perecible, double volumen) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.peso = peso;
        this.perecible = perecible;
        this.volumen = volumen;
    }


    public String getNombre() {
        return nombre;
    }

    public double getVolumen() {
        return volumen;
    }

    public boolean isPerecible() {
        return perecible;
    }

    public double getPeso() {
        return peso;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }
}
