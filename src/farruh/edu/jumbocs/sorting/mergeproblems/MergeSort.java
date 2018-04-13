package farruh.edu.jumbocs.sorting.mergeproblems;

public class MergeSort {

    int[] nums;
    int[] tempArray;

    public MergeSort(int nums[]) {
        this.nums = nums;
        tempArray = new int[nums.length];
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = nums[i];
        }
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                nums[k] = tempArray[i];
                i++;
            } {
                nums[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            nums[k] = tempArray[i];
            i++;
            k++;
        }
        while (j <= high) {
            nums[k] = tempArray[j];
            j++;
            k++;
        }

    }

    public void print(){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(new int[]{1, 3, 2, 4, 5, 4, 8});
        mergeSort.mergeSort(0, 6);
        mergeSort.print();


    }
}
