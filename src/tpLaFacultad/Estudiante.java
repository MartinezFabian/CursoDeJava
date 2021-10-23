package tpLaFacultad;

import java.util.Comparator;

class Estudiante extends Persona implements Comparator<Estudiante> {

    //Constructor
    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    //Constructor sin argumentos
    public Estudiante(){}

    @Override
    public String toString() {
        return "Estudiante: "+ super.toString();
    }

    @Override
    public void modificarDatos(String nombre, String apellido, int legajo) {
        setNombre(nombre);
        setApellido(apellido);
        setLegajo(legajo);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public int getLegajo() {
        return super.getLegajo();
    }

    @Override
    public void setLegajo(int legajo) {
        super.setLegajo(legajo);
    }

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        String nombreEstudiante1 = o1.getNombre();
        String nombreEstudiante2 = o2.getNombre();

        return nombreEstudiante1.compareTo(nombreEstudiante2);
    }
}
