package farruh.edu.jumbocs.recursion;

public class HanioTower {

    public static void move(int n, String start, String temp, String end) {
        if (n == 1) {
            System.out.println(n + " Move " + start + " to " + end);
        } else {
            move(n - 1, start, end, temp);
            System.out.println(n + " Move " + start + " to " + end);
            move(n - 1, temp, start, end);
        }
    }

    public static void main(String[] args) {
        move(3, "A", "B", "C");

    }
}
