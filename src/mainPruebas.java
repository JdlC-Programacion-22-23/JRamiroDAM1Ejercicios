import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import programacion.Pruebas.*;
import java.util.ArrayList;

public class mainPruebas {
    private static String Resultado = "";

    public static void main(String[] args) {
        int unoP = 0;
        int dosP = 0;
        int[] unArray = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < unArray.length; i++) {
            unArray[i] = (int) Math.random() * 100;
        }
        /*
         * dentro de un Try, se introduce los sucesos que van ha hacer que se lance un
         * error de Compilacion,
         * Seguimos dentro del Try y ponemos Catch, se utiliza para responder las
         * excepciones con acciones
         * que nosotros metemos dentro de un catch, en un Catch, su sintaxis es
         * (Tipo de Excepcion | Nombre De La Excepcion 'puede ser cualquiera')
         */
        try {
            /*
             * El problema que tenemos aqui es un tipo OutOfBounds con lo cual el catch
             * imprimira el mensaje dado
             * Podemos activar el catch de esta manera:
             * catch (Exception IOException) {
             * System.out.println("Ese array no vale 1!!!");
             */

            unArray[7] = 90;
        } catch (Exception IOException) {
            System.out.println("La posicion del array no existe!!!");

            /*
             * Ahora toca hacer funcionar una clase que está en otro fichero.java Se hace de
             * la siguiente
             * manera, necesitaras importar el paquete, en mi caso el paquete seria
             * programacion.negocios
             * y despues escribir la siguiente forma, si quieres mostrar en pantalla el
             * resultado de una clase se hace de la siguiente manera
             * Las variables que introduzca dentro del parentesis en la clase, "Paso" sus
             * datos para usarlos en su clase
             */
            System.out.println(pruebas1.pruebas12String(Resultado));
            pruebas1 pruebame = new pruebas1();

            /*
             * Los Elementos terniarios son un tipo de elemntos capaces de probar una
             * cuestion y si es verdadero hace una accion y sino hace otra accion parecido a
             * un if
             */
            System.out.println("elige un numero");
            int numeroElegido = in.nextInt();
            String mayor = (numeroElegido > 1) ? "Es mayor" : "Es menor";
        }

        /*
         * En este ejemplo que pido unos datos y luego los retorno hago uso del metodo
         * toString(), el metodo toString es un metodo el cual retorna siempre una
         * cadena de caracteres y puedes llamar a las variables, metodos que necesites
         * que estén en public y con el paquete importado dentro de la clase
         */
        PedidaCompleja.pConCompleja();
    }
}
