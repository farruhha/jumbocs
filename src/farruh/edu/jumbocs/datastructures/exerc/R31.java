package farruh.edu.jumbocs.datastructures.exerc;

public class R31 {
    public static void main(String[] args) {
        int cur = 92;
        int a = 12;
        int b = 5;
        int n = 100;
        for (int i = 0; i < 5; i++) {
            int next = (a * cur + b) % n;
            System.out.println(next);
            cur = next;
        }
    }
}
