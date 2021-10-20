package TGN1;

public class Espectadores extends Persona{
    private String fila;
    private int silla;

    //Constructor
    public Espectadores(String nombre, int edad, String fila, int silla){
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public String getButaca(){
        // Retornar una butaca definida por la Fila (una letra) y la Silla (un entero entero).
        return fila + silla;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getFila() {
        return fila;
    }

    public int getSilla() {
        return silla;
    }

    @Override
    public String getTipo() {
        return "Forma parte de los: " + getClass();
    }

    @Override
    public String toString() {
        return "\n Nombre:" + getNombre() +
                ", Edad: " + getEdad() +
                ", Butaca: " + getButaca();
    }
}
