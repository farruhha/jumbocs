package farruh.edu.jumbocs.recursion;

public class LinearRecursion {
    public static int linearSum(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return linearSum(data, n - 1) + data[n - 1];
        }
    }

    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static double efficientPower(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            double partial = power(x, n / 2);
            double result = partial * partial;

            if (n % 2 == 1) {
                result *= x;
            }
            return result;
        }
    }
}
