package video45;

public class videoJuego {
    private final String nombre;
    private  final int epoca;
    private final double precio;
    private final int duracion;
    private  final Genero genero;
    private final Empresa empresa;

    public videoJuego(String nombre, int epoca, double precio, int duracion, Genero genero, Empresa empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public enum Genero{
        TERROR,
        ACCION,
        COMEDIA
    }
    public enum Empresa{
        XBOX,
        NINTENDO,
        PLAY_STATION
    }

    @Override
    public String toString() {
        return "videoJuego{" +
                "nombre='" + nombre + '\'' +
                ", epoca=" + epoca +
                ", precio=" + precio +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", empresa=" + empresa +
                '}';
    }
}
