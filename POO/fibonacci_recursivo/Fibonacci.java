package  POO.fibonacci_recursivo;

public class Fibonacci {
    public long f_recusivo(long n) {
        if (n == 0){
            return 0;
        } else {
            if (n==1) {
                return 1;
            } else {
                return (f_recusivo(n-1)+f_recusivo(n - 2));
            }
        }
    }
}
