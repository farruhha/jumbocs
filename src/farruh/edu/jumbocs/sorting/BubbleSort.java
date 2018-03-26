package farruh.edu.jumbocs.sorting;

public class BubbleSort {

    public int[] sort(int[] elements) {
        int size = elements.length;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        return elements;
    }
}
