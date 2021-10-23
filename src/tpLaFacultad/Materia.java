package tpLaFacultad;

import java.util.Comparator;
import java.util.TreeSet;

class Materia implements Informacion, Comparator<Materia> {
    private String nombre;
    private Profesor titular;
    private TreeSet<Estudiante> coleccionEstudiantes;

    //Constructor
    public Materia(String nombre, Profesor titular, Estudiante comparadorEstudiante) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new TreeSet<Estudiante>(comparadorEstudiante);
    }

    //Constructor sin argumentos
    public Materia(){ }

    public void agregarEstudiante (Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }

    public boolean eliminarEstudiante(int legajo){
        boolean encontro = false;
        for(Estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
            }
        }
        return encontro;
    }

    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return " Materia: "+ nombre + "\n" +
                "Titular: " + titular + "\n"+
                "Estudiantes: "+ coleccionEstudiantes.size()+" \n" + coleccionEstudiantes;
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public void listarContenidos() {
        System.out.println("\nMateria:  " + this.nombre);
        for (Estudiante estudiante : coleccionEstudiantes){
            System.out.println("\n-" + estudiante.toString());
        }
    }

    @Override
    public int compare(Materia o1, Materia o2) {
        String nombreMateria1 = o1.getNombre();
        String nombreMateria2 = o2.getNombre();

        return nombreMateria1.compareTo(nombreMateria2);
    }
}
