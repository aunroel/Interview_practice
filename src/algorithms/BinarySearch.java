package algorithms;

public class BinarySearch {

    public static void main(String[] args) {

    }

    public int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) /2;
            if (array[x] > mid) {
                low = mid +1;
            } else if (array[x] < mid){
                high = mid -1;
            }else
                return mid;
        }

        return -1;
    }


    public int binarySearchRec(int[] array, int x, int low, int high) {
        if (low > high) return -1;

        int middle = (low + high) / 2;
        if (array[x] > middle) {
            return binarySearchRec(array, x, middle + 1, high);
        }else if (array[x]  < middle){
            return binarySearchRec(array, x, low, middle-1);
        }else
            return middle;
    }
}
