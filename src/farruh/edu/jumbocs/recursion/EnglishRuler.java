package farruh.edu.jumbocs.recursion;

public class EnglishRuler {

    public static void drawRuler(int nInches, int majarLength) {
        drawLine(majarLength, 0);
        for (int i = 1; i <= nInches; i++) {
            drawInterval(majarLength - 1);
            drawLine(majarLength, i);
        }
    }

    private static void drawInterval(int centralLength) {
        if (centralLength >= 1) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    private static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }


    private static void drawLine(int tickLength, int tickLabel) {
        for (int j = 0; j < tickLength; j++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        drawRuler(2, 5);
    }
}
