package claseMath;

public class PruebaMath {
    public static void main(String[] args) {
        double valor = 1.232;
        double valor2 = 2.322;

        //Funciones trigonométricas

        //Math.sin devuelve el seno de un angulo
        System.out.println(Math.sin(valor));
        //Math.cos devuelve el coseno de un angulo
        System.out.println(Math.cos(valor));
        //Math.tan devuelve la tangente de un angulo
        System.out.println(Math.tan(valor));
        //Math.atan devuelve el arco tangente entre -PI/2 y PI/2.
        System.out.println(Math.atan(valor));
        //Math.atan2 devuelve el arco tangente entre -PI y PI.
        System.out.println(Math.atan2(valor, valor2));

        //La función exponencial y su inversa

        //Math.exp devuelve el exponencial de un número
        System.out.println(Math.exp(valor));

        //Math.log devuelve el logaritmo natural en base e de un número
        System.out.println(Math.log(valor));

        //Las dos constantes PI y e

        //Math.PI devuelve el valor de PI
        System.out.println("PI: " + Math.PI);
        //Math.E devuelve el valor de E
        System.out.println("E :" + Math.E);

    }
}
