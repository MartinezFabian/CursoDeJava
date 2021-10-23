package tpLaFacultad;

import java.util.Comparator;
import java.util.TreeSet;

class Facultad implements Informacion {
    private String nombre;
    private TreeSet<Carrera> coleccionCarrera;

    //Constructor
    public Facultad(String nombre, Carrera comparadorCarrera) {
        this.nombre = nombre;
        this.coleccionCarrera = new TreeSet<Carrera>(comparadorCarrera);
    }

    //Constructor sin argumentos
    public Facultad(){ }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Carrera> getColeccionCarrera() {
        return coleccionCarrera;
    }

    public void setColeccionCarrera(TreeSet<Carrera> coleccionCarrera) {
        this.coleccionCarrera = coleccionCarrera;
    }

    public void agregarCarrera(Carrera nuevaCarrera) {
        coleccionCarrera.add(nuevaCarrera);
    }

    public boolean eliminarCarrera(String nombreCarrera) {
        boolean encontro = false;
        for (Carrera carrera : coleccionCarrera) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                coleccionCarrera.remove(carrera);
                encontro = true;
                break;
            }
        }
        return encontro;
    }

    @Override
    public int verCantidad() {
        return coleccionCarrera.size();
    }

    @Override
    public void listarContenidos() {
        System.out.println("\nFacultad:  " + this.nombre);
        for (Carrera carrera : coleccionCarrera) {
            System.out.println("-" + carrera.toString());
        }
    }
}
