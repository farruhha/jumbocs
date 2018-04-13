package farruh.edu.jumbocs.sorting;

public class QuickSort {
    static int[] arry = new int[]{1, 3, 4, 2, 3, 4, 5, 2};

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j-1);
            quickSort(arr, j + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;

        for (int j = low + 1; j <= high; j++) {

            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i - 1];
        arr[i - 1] = arr[low];
        arr[low] = temp;
        return i - 1;
    }

    public static void main(String[] args) {
        quickSort(arry, 0, arry.length - 1);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }


}
