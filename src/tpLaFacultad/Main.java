package tpLaFacultad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        Carrera comparadorCarrera = new Carrera();

        Facultad facultad = new Facultad("UTN frre", comparadorCarrera);

        //Agregar Carreras a una Facultad
        Materia comparadorMateria = new Materia();

        facultad.agregarCarrera(new Carrera("Ingeniería en Sistemas de Información", comparadorMateria));
        facultad.agregarCarrera(new Carrera("Tecnicatura Universitaria en Programación", comparadorMateria));
        facultad.agregarCarrera(new Carrera("Ingeniería Electromecánica", comparadorMateria));

        facultad.listarContenidos();

        //Eliminar Carreras de la facultad.

        facultad.eliminarCarrera("Ingeniería Electromecánica");

        System.out.println("\nSe elimino una carrera: ");
        facultad.listarContenidos();

        //Agregar materias a una Carrera.
        Estudiante comparadorEstudiante = new Estudiante();

        facultad.getColeccionCarrera().first()
                .agregarMateria(new Materia("Matemática discreta",
                        new Profesor("Belen", "Fernandez", 12345, 40000, 5), comparadorEstudiante));

        facultad.getColeccionCarrera().first()
                .agregarMateria(new Materia("Sistemas y Organizaciones",
                        new Profesor("Maria", "Vallejos", 13254, 40000, 6), comparadorEstudiante));

        facultad.getColeccionCarrera().first()
                .agregarMateria(new Materia("Algoritmo y Estructura de Datos",
                        new Profesor("Alexis", "Dominguez", 23154, 40000, 2), comparadorEstudiante));

        facultad.getColeccionCarrera().first().listarContenidos();

        // Eliminar materias a una Carrera.

        facultad.getColeccionCarrera().first().eliminarMateria("Matemática discreta");


        System.out.println("\nSe elimino una materia: ");
        facultad.getColeccionCarrera().first().listarContenidos();


        // Agregar Estudiantes a una Materia.
        Estudiante estudianteUno = new Estudiante("Franco", "Fernandez", 23123);
        Estudiante estudianteDos = new Estudiante("Lucas", "Rodriguez", 32323);
        Estudiante estudianteTres = new Estudiante("Mauricio", "Perez", 31121);

        facultad.getColeccionCarrera().first().getColeccionMaterias().first().agregarEstudiante(estudianteUno);
        facultad.getColeccionCarrera().first().getColeccionMaterias().first().agregarEstudiante(estudianteDos);
        facultad.getColeccionCarrera().first().getColeccionMaterias().first().agregarEstudiante(estudianteTres);

        System.out.println("\nSe agregaron estudiantes: ");

        facultad.getColeccionCarrera().first().getColeccionMaterias().first().listarContenidos();

        // Eliminar Estudiante de una Materia.
        facultad.getColeccionCarrera().first().getColeccionMaterias().first().eliminarEstudiante(31121);
        System.out.println("\nSe elimino un estudiante de una materia: ");
        facultad.getColeccionCarrera().first().getColeccionMaterias().first().listarContenidos();

        // Modificar el Profesor de la materia.

        Profesor profesorNuevo = new Profesor("Sebastian", "Romero", 11223, 40000, 1);

        System.out.println("\nNuevo profesor: ");
        System.out.println(profesorNuevo.toString());
        //El método calcularSueldo() de la clase Profesores calcula el sueldo sumando un 10% al básico por cada año de antiguedad.
        double sueldo = profesorNuevo.calcularSueldo();
        System.out.println("Sueldo profesor: $" + sueldo);

        facultad.getColeccionCarrera().first().getColeccionMaterias().first().modificarTitular(profesorNuevo);

        System.out.println("\nSe modifico el profesor de una materia: ");
        facultad.getColeccionCarrera().first().listarContenidos();

        //El método verCantidad() de la interface Información muestra la cantidad de elementos que contiene,
        // es decir que en el caso de la clase Carreras, devolverá la cantidad de materias que posee,
        // en el caso de la clase Materias, la cantidad de estudiantes que tienen, etc.

        System.out.println("\nCantidad de materias de la carrera " + facultad.getColeccionCarrera().first().getNombre()
        + ": " + facultad.getColeccionCarrera().first().verCantidad());

        System.out.println("\nCantidad de estudiantes de la materia " +
                facultad.getColeccionCarrera().first().getColeccionMaterias().first().getNombre() + ": "
                + facultad.getColeccionCarrera().first().getColeccionMaterias().first().verCantidad());


        // Encontrar materias de una carrera en particular indicando el nombre de la materia.
        // Si la materia existe nos deberá preguntar si deseamos eliminar.

        boolean continuar = false;

        do{
            String nombreMateria = validacionString("\nIngrese el nombre de la materia: ");

            boolean encontro = facultad.getColeccionCarrera().first().encontrarMateria(nombreMateria);

            if(encontro){

                System.out.println("\n¿Desea eliminar la materia: " + nombreMateria + "? \n1. Si\n2. No");
                int eleccion = scanner.nextInt();

                if(eleccion == 1){
                    //Elimino la materia
                    facultad.getColeccionCarrera().first().eliminarMateria(nombreMateria);
                    System.out.println("\nLa materia fue eliminada con éxito.");

                    facultad.getColeccionCarrera().first().listarContenidos();
                }

            }else{
                System.out.println("\nLa materia ingresada no existe");
            }

            try{
                System.out.println("\n¿Desea ingresar otra materia? \n1.Si\n2.No");
                int respuesta = scanner.nextInt();

                if(respuesta == 1){
                    continuar = true;
                }else{
                    continuar = false;
                }
            }catch (InputMismatchException e){
                continuar = false;
                System.out.println("Error en el ingreso de datos.");
            }

        }while (continuar);

    }

    //Verifica que la cadena ingresada no sea una cadena vacia
    public static String validacionString(String peticion){
        Scanner scanner = new Scanner(System.in);
        String s1;

        do {
            System.out.print(peticion);
            s1 = scanner.nextLine();
        }while (s1.equals(""));

        return s1;
    }
}
