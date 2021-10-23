package tpLaFacultad;

import java.util.Comparator;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    //Constructor
    public Persona(String nombre, String apellido, int legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //Constructor sin argumentos
    public Persona(){}

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nLegajo: " + legajo;
    }

    public abstract void modificarDatos(String nombre, String apellido, int legajo);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
