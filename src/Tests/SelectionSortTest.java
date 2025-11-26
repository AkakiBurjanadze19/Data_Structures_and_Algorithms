package Tests;
import Algorithms.Sorting.BubbleSort;
import Algorithms.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] arr = {30, 15, 10, 25, 50, 12, 5, 1};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        SelectionSort.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
