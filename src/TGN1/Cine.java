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
        ArrayList<Integer> filaA = new ArrayList<>();
        ArrayList <Integer> filaB = new ArrayList<>();
        ArrayList <Integer> filaC = new ArrayList<>();
        ArrayList <Integer> filaD = new ArrayList<>();
        ArrayList <Integer> filaE = new ArrayList<>();
        ArrayList <Integer> filaF = new ArrayList<>();

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

                //Verifica que el numero de silla sea valido
                if (silla > 0 && silla <= cantidad) {
                    //Verifica que en la fila seleccionada no este ocupada la silla
                    switch (fila) {
                        case "a": {
                            if (!filaA.contains(silla)) {
                                correcto = true;
                                filaA.add(silla);
                            } else System.out.println("Silla ocupada. Intente nuevamente.");
                        }
                        break;

                        case "b": {
                            if (!filaB.contains(silla)) {
                                correcto = true;
                                filaB.add(silla);
                            } else System.out.println("Silla ocupada. Intente nuevamente.");

                        }
                        break;

                        case "c": {
                            if (!filaC.contains(silla)) {
                                correcto = true;
                                filaC.add(silla);
                            } else System.out.println("Silla ocupada. Intente nuevamente.");
                        }
                        break;

                        case "d": {
                            if (!filaD.contains(silla)) {
                                correcto = true;
                                filaD.add(silla);
                            } else System.out.println("Silla ocupada. Intente nuevamente.");
                        }
                        break;

                        case "e": {
                            if (!filaE.contains(silla)) {
                                correcto = true;
                                filaE.add(silla);
                            } else System.out.println("Silla ocupada. Intente nuevamente.");
                        }
                        break;

                        case "f": {
                            if (!filaF.contains(silla)) {
                                correcto = true;
                                filaF.add(silla);
                            } else System.out.println("Silla ocupada. Intente nuevamente.");
                        }
                        break;

                        default: {
                            System.out.println("Error fila ingresada invalida o fuera de los limites.");
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

    //Verifica que el string ingresado sea solo una letra y que no este fuera de los limites
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
                letras = validacionString("Fila (a-f): ", s).toLowerCase();
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

                    if(!varLetras.contains(letras)){
                        System.out.println("Error fila ingresada fuera de los limites.");
                    }
                }

            } while ((!condicion) || (!varLetras.contains(letras)));


        return letras;
    }

}
