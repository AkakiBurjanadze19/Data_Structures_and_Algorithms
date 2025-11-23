package Tests;
import Algorithms.Sorting.MergeSort;
import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 3, 30, 25, 18};

        System.out.println("array before sorting: " + Arrays.toString(arr));

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("array after sorting: " + Arrays.toString(arr));
    }
}