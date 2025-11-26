package Tests;
import Algorithms.Sorting.HeapSort;
import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] arr = {30, 15, 10, 25, 50, 12, 5, 1};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        HeapSort.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}