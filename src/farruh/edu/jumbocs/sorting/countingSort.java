package farruh.edu.jumbocs.sorting;

public class countingSort {

    public static void countingSort(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] temp = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]] = 1 + temp[arr[i]];
        }

        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i - 1] + temp[i];
        }

        int [] newArray = new int[arr.length + 1];
        for (int i = arr.length - 1; i >=0 ; i--) {
            int val = arr[i];
            int index = temp[val];
            newArray[index] = val;
            temp[val] -= temp[val] ;
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        countingSort(new int[]{5, 4, 1, 6, 9, 2, 2, 4});
    }
}
