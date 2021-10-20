package TGN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Salas sala01 = new Salas(3, "Sala 01");
        sala01.setPelicula("Joker");
        sala01.setEspectadores(cargarEspectadores(scanner, sala01.getCapacidad()));
        System.out.println(sala01.toString());

        Acomodadores acomodador1 = new Acomodadores("Juan", 33);
        acomodador1.setSala(sala01);
        acomodador1.setSueldo(50000);
        System.out.println(acomodador1.toString());

        Empleados empleado1 = new Empleados("Carlos", 50);
        empleado1.setSueldo(39999);
        System.out.println(empleado1.toString());

        //Se debe poder listar los espectadores de una sala, pero en caso de que no haya sido asignada
        // se debe capturar el error emitiendo el mensaje "SIN ESPECTADORES CARGADOS".
        Salas sala02 = new Salas(5, "Sala 02");
        System.out.println(sala02.toString());

        scanner.close();

    }

    private static Espectadores[] cargarEspectadores(Scanner s, int cantidad) {
        Espectadores[] espectadores = new Espectadores[cantidad];

        //Filas
        ArrayList<Integer> coleccionEspectadoresA;
        coleccionEspectadoresA = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresB;
        coleccionEspectadoresB = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresC;
        coleccionEspectadoresC = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresD;
        coleccionEspectadoresD= new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresE;
        coleccionEspectadoresE = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresF;
        coleccionEspectadoresF = new ArrayList<>();

        String nombre;
        String edadString;
        int edad = 0;
        String fila;
        String sillaString;
        int silla = 0;
        boolean correcto;
        int cont = 0;
        boolean x = false;
        boolean z = false;

        System.out.println("Capacidad de la sala: " + cantidad);
        System.out.println("Ingresar los siguientes datos de los espectadores: ");

        for(int i = 0; i < espectadores.length; i++){

            System.out.println("\nEspectador " + (i+1) + ": ");

            nombre = validacionString("Nombre: ", s);

            do{
                edadString = validacionString("Edad: ", s);

                //Verifico que el usuario ingreso un numero
                try {
                    edad = Integer.parseInt(edadString);
                    z = true;
                }catch (Exception e){
                    System.out.println("ERROR EN EL INGRESO DE DATOS");
                    z = false;
                }

                if(edad < 1 || edad > 110){
                    System.out.println("Edad no valida");
                }

            }while ((edad < 1 || edad > 110) || !z);

            fila = ingresarSoloLetra(s);

            correcto = false;
            do{
                //Verifico que el usuario ingreso un numero
                do{
                    sillaString = validacionString("Silla: ", s);
                    try {
                        silla = Integer.parseInt(sillaString);
                        x = true;
                    }catch (Exception e){
                        x = false;
                        System.out.println("ERROR EN EL INGRESO DE DATOS");
                    }
                }while (!x);

                //Agregar la fila a la condicion del if de abajo asi tambien tiene en cuenta la fila, y agregar un if por cada fila

                if (silla > 0 && silla <= cantidad) {
                    switch (fila) {
                        case "a": {
                            if (!coleccionEspectadoresA.contains(silla)) {
                                correcto = true;
                                coleccionEspectadoresA.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");
                        }
                        break;

                        case "b": {
                            if (!coleccionEspectadoresB.contains(silla)) {
                                correcto = true;
                                coleccionEspectadoresB.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        }
                        break;

                        case "c": {
                            if (!coleccionEspectadoresC.contains(silla)) {
                                correcto = true;
                                coleccionEspectadoresC.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");
                        }
                        break;

                        case "d": {
                            if (!coleccionEspectadoresD.contains(silla)) {
                                correcto = true;
                                coleccionEspectadoresD.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");
                        }
                        break;

                        case "e": {
                            if (!coleccionEspectadoresE.contains(silla)) {
                                correcto = true;
                                coleccionEspectadoresE.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");
                        }
                        break;

                        case "f": {
                            if (!coleccionEspectadoresF.contains(silla)) {
                                correcto = true;
                                coleccionEspectadoresF.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");
                        }
                        break;

                        default: {
                            System.out.println("Error fila ingresada invalida o fuera de los limites.(Ingresa solo minusculas)");
                        }
                    }

                } else {
                    System.out.println("La silla ingresada no existe");
                }

            }while (!correcto);

            espectadores[i] = new Espectadores(nombre, edad, fila, silla);
            cont++;
        }

        return espectadores;
    }

    //Verifica que la cadena ingresada no sea una cadena vacia
    public static String validacionString(String peticion, Scanner scanner){
        String s1;

        do {
            System.out.print(peticion);
            s1 = scanner.nextLine();
        }while (s1.equals(""));

        return s1;
    }

    //Verifica que el string ingresado sea solo una letra
    public static String ingresarSoloLetra(Scanner s) {

        String letras;
        int cont = 0;
        boolean condicion;
        List<String> varLetras;
        varLetras = new ArrayList<>();
        varLetras.add("a");
        varLetras.add("b");
        varLetras.add("c");
        varLetras.add("d");
        varLetras.add("e");
        varLetras.add("f");


            do {
                System.out.print("Fila (a-f): ");
                letras = s.nextLine();
                cont = 0;

                for (int i = 0; i < letras.length(); i++) {
                    if (Character.isLetter(letras.charAt(i))) {
                        cont++;
                    } else {
                        cont = 2;
                    }
                }

                if (cont > 1) {
                    System.out.println("Error solo puede contener 1 letra. Intente de nuevo\n");
                    condicion = false;
                    cont = 0;
                } else {
                    condicion = true;
                }
            } while ((!condicion) || (!varLetras.contains(letras)));


        return letras;
    }

}
