package farruh.edu.jumbocs.recursion;

public class AnagramApp {

    public static void doAnagram(int newSize) {
        if (newSize == 1) {
            return;
        }
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if (newSize == 2){

            }
        }
    }
}
