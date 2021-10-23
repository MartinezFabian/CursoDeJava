package tpLaFacultad;

import java.util.Comparator;
import java.util.TreeSet;

class Carrera implements Informacion, Comparator<Carrera> {
    private String nombre;
    private TreeSet<Materia> coleccionMaterias;

    //Constructor
    public Carrera(String nombre, Materia comparadorMateria) {
        this.nombre = nombre;
        this.coleccionMaterias = new TreeSet<Materia>(comparadorMateria);
    }

    //Constructor sin argumentos
    public Carrera(){ }

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public TreeSet<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(TreeSet<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public boolean eliminarMateria(String nombreMateria){
        boolean encontro = false;
        for (Materia materia : coleccionMaterias) {
            if (materia.getNombre().equals(nombreMateria)) {
                coleccionMaterias.remove(materia);
                encontro = true;
                break;
            }
        }
        return encontro;
    }

    public boolean encontrarMateria(String nombreMateria){
        boolean encontro = false;

        for(Materia materia : coleccionMaterias){
            if(materia.getNombre().equals(nombreMateria)){
                encontro = true;
            }
        }

        return encontro;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public void listarContenidos() {
        System.out.println("\nCarrera:  " + this.nombre + "\n");
        for (Materia materia : coleccionMaterias) {
            System.out.println("-" + materia.toString());
        }
    }



    @Override
    public int compare(Carrera o1, Carrera o2) {
        String nombreCarrera1 = o1.getNombre();
        String nombreCarrera2 = o2.getNombre();

        return nombreCarrera1.compareTo(nombreCarrera2);
    }
}
