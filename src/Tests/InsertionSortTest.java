package Tests;
import Algorithms.Sorting.InsertionSort;
import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        System.out.println("array before sorting: " + Arrays.toString(arr));

        InsertionSort.sort(arr);

        System.out.println("array after sorting: " + Arrays.toString(arr));
    }
}