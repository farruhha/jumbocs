package farruh.edu.jumbocs.recursion;

public class TailRec {

    static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }

    static int fact2(int n, int acc) {
        if (n == 1) return acc;
        return fact2(n - 1, acc * n);
    }

    static int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }



    static int fib(int n, int i, int j) {
        if (n == 1) {
            return i;
        } else {
            return fib(n - 1, i + j, i);
        }
    }

    public static void main(String... args) {
        System.out.println(fact(4));
        System.out.println(fact2(4, 1));
        System.out.println(fib(4));
    }
}
