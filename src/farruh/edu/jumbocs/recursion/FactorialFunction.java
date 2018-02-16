package farruh.edu.jumbocs.recursion;

public class FactorialFunction {
    public static int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
