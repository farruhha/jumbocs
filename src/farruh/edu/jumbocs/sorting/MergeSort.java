package farruh.edu.jumbocs.sorting;

public class MergeSort {

    static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        sort(new int[]{1,3,4,2,11,23,12,6});
    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            System.out.println("Inside sort : low : " +low +" mid : " +mid +" high:  "+ high);
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {

        int[] temp = new int[high - low + 2];
        int left = low;
        int right = mid + 1;
        int k = 0;

        System.out.println(" Inside the merge : low : " + low +" - mid :" + mid +" high : " + high);

        while (left <= mid && right <= high) {
            if (array[left] < array[right]) {
                temp[k++] = array[left++];
            }
            if (array[left] > array[right]) {
                temp[k++] = array[right];
            }
        }

        while (left <= mid) {
            temp[k++] = array[left++];
        }

        while (right <= high) {
            temp[k++] = array[right++];
        }

        for (int i = low; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }


}
