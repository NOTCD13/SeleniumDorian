package ejercicioPOO;

public class Perro{
    private int edad;
    private String nombre;
    private String amo;
    private double peso;

    public void comer(int comida){
        System.out.printf("Comiendo %dkg de comida%n",comida);
        peso += comida;
    }

    public void dormir (int tiempo){
        System.out.println("Durmiendo por N segundos");
        try {
            Thread.sleep(tiempo *1000L);
            System.out.printf("Se desperto despues de un rato");

        }catch (InterruptedException interruptedException){
            System.err.printf("InterruptedException: %s%n",interruptedException);
            System.out.printf("Se despertó antes de lo acordado");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAmo(String amo) {
        this.amo = amo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAmo() {
        return amo;
    }

    public double getPeso() {
        return peso;
    }

    public Perro(int edad, String nombre, String amo, double peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.amo = amo;
        this.peso = peso;
    }

    public void pasear (int tiempo){
        System.out.printf("Paseando por %d de timepo %n",tiempo);
        peso -=tiempo;
    }

}
