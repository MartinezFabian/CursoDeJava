package tpLaFacultad;

import java.util.LinkedList;

class Facultad {
    private String nombre;
    private LinkedList<Carrera> coleccionCarrera;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarrera = new LinkedList<Carrera>();
    }

    public void agregarCarrera(Carrera nuevaCarrera) {
        coleccionCarrera.add(nuevaCarrera);
    }

    public void mostrarCarreras() {
        System.out.println("Carrera:  " + this.nombre);
        for (Carrera carrera : coleccionCarrera) {
            System.out.println("-" + carrera.toString());
        }
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

}
