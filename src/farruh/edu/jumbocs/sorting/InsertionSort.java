package farruh.edu.jumbocs.sorting;

public class InsertionSort {

    int[] insertion(int[] elements) {

        int size = elements.length;
        int temp;
        int j;

        for (int i = 1; i < size; i++) {
            temp = elements[i];
            for (j = i; j > 0 && elements[j - 1] > temp; j--) {
                elements[j] = elements[j - 1];
            }
            elements[j] = temp;
        }
        return elements;
    }
}
