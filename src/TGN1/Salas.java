package TGN1;

import java.util.Arrays;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre){
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.espectadores = espectadores;
    }

    public Espectadores[] getEspectadores() {
        return espectadores;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {

        if(espectadores == null){
            return nombre + " SIN ESPECTADORES CARGADOS";
        }else{
            return "\nNombre sala: " + nombre + "\n" +
                    "Pelicula: " + pelicula + "\n" +
                    "Capacidad: " + capacidad  + "\n" +
                    "Espectadores: " + Arrays.toString(espectadores);
        }
    }

}
