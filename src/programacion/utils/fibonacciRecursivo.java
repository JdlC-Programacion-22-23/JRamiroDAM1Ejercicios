package programacion.utils;

public class fibonacciRecursivo {
    public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibonacci_1 = fibonacciRecursivo(n - 1);
            int fibonacci_2 = fibonacciRecursivo(n - 2);
            return fibonacci_1 + fibonacci_2;
        }
    }
    
}
