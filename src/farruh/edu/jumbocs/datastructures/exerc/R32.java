package farruh.edu.jumbocs.datastructures.exerc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class R32 {
    public static void main(String[] args) {
        selectRemove(new int[]{1, 3, 4, 5, 6});
    }

    static void selectRemove(int[] arr) {
        int entry = arr.length;
        int attempt = 0;
        while (entry != 0) {
            attempt++;
            Random random = new Random();
            int removeIndex = random.nextInt(arr.length);
            for (int i = removeIndex; i < entry - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[entry - 1] = 0;
            entry--;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Attempt " + attempt);
    }
}
