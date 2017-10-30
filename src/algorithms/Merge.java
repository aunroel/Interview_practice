package algorithms;

public class Merge {

    public static void main(String[] args) {

    }

    public void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
    }

    void mergeSort(int[] array, int[] helper, int low, int high){
        if (low < high){
            int mid = (low + high)/2;
            mergeSort(array,helper,low,mid);
            mergeSort(array,helper, mid+1,high);
            merge(array, helper, low, mid, high);
        }
    }

    private void merge(int[] array, int[] helper, int low, int mid, int high) {
        for (int i = low; i < high; i++) {
            helper[i] = array[i];
        }

        int helper_left = low;
        int helper_right = mid + 1;
        int current = low;

        while (helper_left <= mid && helper_right <= high) {
            if (helper[helper_left] <= helper[helper_right]){
                array[current] = helper[helper_left];
                helper_left++;
            }else {
                array[current] = helper[helper_right];
                helper_right++;
            }
            current++;
        }

        int remaining = mid - helper_left;
        for (int i = 0; i < remaining; i++) {
            array[current + i] = helper[helper_left + i];
        }
    }

    void myMergeSort(int[] array) {
        int[] helper = new int[array.length];
        myMergeSort(array, helper, 0, array.length - 1);
    }

    private void myMergeSort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int mid = (low + high)/2;
            myMergeSort(array, helper, low, mid);
            myMergeSort(array, helper, mid+1, high);
            myMerge(array, helper, low, mid, high);
        }
    }

    private void myMerge(int[] array, int[] helper, int low, int mid, int high) {
        for (int i = low; i < high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = mid + 1;
        int current = low;

        while (helperLeft <= mid && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;
            }else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int rem = mid - helperLeft;
        for (int i = 0; i < rem; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

}
