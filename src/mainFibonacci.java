import java.util.Scanner;
import programacion.utils.fibonacciRecursivo;
public class mainFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        if (args.length > 0) {
            numero = Integer.parseInt(args[0]);
        } else {
            System.out.println("indica el numero para realizar fibonacci");
            int nFibonacci = in.nextInt();
            numero = nFibonacci;
        }
        System.out.println(fibonacciRecursivo.fibonacciRecursivo(numero));
    }
}