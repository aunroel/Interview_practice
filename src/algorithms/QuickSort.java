package algorithms;

public class QuickSort {

    public static void main(String[] args) {

    }

    public void quickSort(int[] array, int left, int right) {
        int index = partition(array,left,right);
        if (left < index - 1){
            quickSort(array, left, index - 1);
        }else {
            quickSort(array, index, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[(left + right)/2];
        while (left <= right) {
            while (array[left] < pivot)
                left++;

            while (array[right] > pivot)
                right--;

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private int myPartition(int[] array, int left, int right) {
        int pivot = array[(left + right)/2];
        while (left <= right) {
            while (array[left] < pivot)
                left++;
            while (array[right] > pivot)
                right--;

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
