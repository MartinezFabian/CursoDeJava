package TGN1;

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

        String nombre;
        String edadString;
        int edad = 0;
        String fila;
        String sillaString;
        int silla = 0;
        boolean correcto;
        int cont = 0;

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
                }catch (Exception e){
                    System.out.println("ERROR EN EL INGRESO DE DATOS");
                    System.exit(1); //Finalizar programa
                }

                if(edad < 1 || edad > 110){
                    System.out.println("Edad no valida");
                }

            }while (edad < 1 || edad > 110);


            fila = ingresarSoloLetra(s);

            do{
                correcto = true;
                sillaString = validacionString("Silla: ", s);

                //Verifico que el usuario ingreso un numero
                try {
                    silla = Integer.parseInt(sillaString);
                }catch (Exception e){
                    System.out.println("ERROR EN EL INGRESO DE DATOS");
                    System.exit(1); //Finalizar programa
                }

                //Verifico que la silla sea mayor a cero y menor o igual a la capacidad de la sala
                if(silla > 0 && silla <= cantidad){

                    if(cont > 0){
                        //Verifico que la butaca (fila y silla) no este ocupada
                        for(int j = 0; j < cont; j++){
                            if(silla == (espectadores[j].getSilla()) && fila.equals(espectadores[j].getFila())){
                                System.out.println("La silla ingresada esta ocupada");
                                correcto = false;
                                j = cont;
                            }
                        }

                    }

                }else{
                    System.out.println("La silla ingresada no existe, capacidad máxima: " + cantidad);
                    correcto = false;
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

        do{
            letras = validacionString("Fila: ", s);

            for (int i = 0; i < letras.length(); i++){
                if (Character.isLetter(letras.charAt(i))){
                    cont ++;
                }else{
                    cont = 2;
                }
            }

            if (cont > 1){
                System.out.println("Error solo puede contener una letra. Intente de nuevo\n");
                condicion = false;
                cont = 0;

            } else {
                condicion = true;
            }

        } while (!condicion);

        return letras;
    }

}
