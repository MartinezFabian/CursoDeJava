/*
En este desafío se trata de crear un programa en JAVA que haga que el usuario deba de adivinar en el menor número
de intentos posibles un número entero aleatorio entre 1 y 100 generado por el programa.

Al ejecutar el programa, este generará un número aleatorio entre 1 y 100 que el usuario no sabrá.

A continuación, el programa pedirá la introducción de un número entero entre 1 y 100 por consola.

Si el número introducido por el usuario es mayor que el número aleatorio generado por el programa, saldrá un mensaje
por consola indicando que el número es menor.

Si el número introducido por el usuario es menor que el número aleatorio generado por el programa, saldrá un mensaje
por consola indicando que el número es mayor.

El proceso se repetirá indefinidamente hasta que averigüemos cuál es el número generado aleatoriamente por el programa.

Una vez acertado, debe imprimir en consola un mensaje de “Correcto!”.

El programa debe de indicar el nº de intentos consumidos para acertar con el número aleatorio y luego de que el usuario
ingrese el número se debe mostrar el número generado.


*/

package desafios;

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int valor;
        boolean correcto = false;
        int numeroAleatorio = (int)(Math.random() * 100) + 1;

        while(!correcto){
            //Pide el numero al usuario y valida que este entre 1 y 100
            do {
                System.out.print("Ingrese un numero entero entre 1 y 100: ");
                valor = scanner.nextInt();

                if (valor < 1 || valor > 100) {
                    System.out.println("El numero ingresado no se encuentra entre 1 y 100.");
                }
            } while (valor < 1 || valor > 100);

            cont++; //aumento el contador en uno

            if(valor == numeroAleatorio){
                correcto = true;
                System.out.println("Correcto!");
                System.out.println("El numero aleatorio es: " + numeroAleatorio);
                System.out.println("nº de intentos consumidos: " + cont);

            } else if(valor > numeroAleatorio){
                System.out.println("El número es menor");

            }else{
                System.out.println("El número es mayor");
            }
        }
    }
}
