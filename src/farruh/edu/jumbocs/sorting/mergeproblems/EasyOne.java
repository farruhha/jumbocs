package farruh.edu.jumbocs.sorting.mergeproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasyOne {

    public static void main(String args[]) throws Exception {
        //Sample code to perform I/O:

//        Scanner s = new Scanner(System.in);
//        int lineNumber = s.nextInt();
//        List<String> listStrings = new ArrayList<>();
//        for (int i = 0; i < lineNumber; i++) {
//            listStrings.add(s.next());
//        }

        int[] array = sort(new int[]{1, 3, 4, 5, 5, 2, 4});
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static int[] sort(int[] arrays) {
        return mergeSort(arrays, 0, arrays.length - 1);
    }

    private static int[] mergeSort(int[] arrays, int low, int high) {
        if (low >= high) {
            return arrays;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arrays, low, mid);
        mergeSort(arrays, mid + 1, high);
        return merge(arrays, low, mid + 1, high);
    }

    private static int[] merge(int[] arrays, int low, int mid, int high) {
        //1,3,2,5,4,7,6,8,9
        //1,3,2,5,   4,7,6,8,9
        //1,3,   2,5,   4,7,   6,8,9
        //1, 3,   2, 5,   4, 7,   6, 8,9
        //1, 3,   2, 5,   4, 7,   6, 8,  9

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arrays[left] < arrays[right]) {
                temp[k++] = arrays[left++];
            }
            if (arrays[left] > arrays[right]) {
                temp[k++] = arrays[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arrays[left++];
        }
        while (right <= high) {
            temp[k++] = arrays[right++];
        }

        for (int i = low; i < high; i++) {
            arrays[low + i] = temp[i];
        }
        return arrays;
    }
}
