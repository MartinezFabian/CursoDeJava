/*
Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir introducir un nº por consola.
Después de introducir el nº y pulsar ENTER, el programa devuelve en consola la raíz cuadrada del número.
*/

package claseMath;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese un número: ");
        double num = scanner.nextDouble();

        System.out.println("La raíz de " + num + " es = " + Math.sqrt(num));
    }
}
