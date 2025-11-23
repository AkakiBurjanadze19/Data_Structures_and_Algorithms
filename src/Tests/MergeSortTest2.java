package Tests;
import Algorithms.Sorting.MergeSort2;
import java.util.Arrays;

public class MergeSortTest2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 3, 30, 25, 18};

        System.out.println("array before sorting: " + Arrays.toString(arr));

        MergeSort2.mergeSort(arr, 0, arr.length - 1);

        System.out.println("array after sorting: " + Arrays.toString((arr)));
    }
}
