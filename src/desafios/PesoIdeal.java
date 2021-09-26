/* Debes crear un programa que permita calcular el peso ideal de una persona teniendo en cuenta lo siguiente:

Si la persona es una mujer, el peso ideal será igual a la altura en cm -120
Si la persona es un hombre, el peso ideal será igual a la altura en cm -110

El programa pedirá al usuario dos datos:
La altura en cm
El género, pudiendo ser este hombre o mujer.

En función de los datos introducidos, el programa imprimirá en consola el peso ideal.

*/


package desafios;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese altura en cm: ");
        float altura = scanner.nextFloat();

        System.out.print("1. Mujer\n2. Hombre\nIngrese su genero: ");
        int genero = scanner.nextInt();

        float pesoIdeal;

        if(genero == 1){
            pesoIdeal = altura - 120;
        }else{
            pesoIdeal = altura - 110;
        }

        System.out.println("Peso ideal = " + pesoIdeal + "kg");
    }
}
