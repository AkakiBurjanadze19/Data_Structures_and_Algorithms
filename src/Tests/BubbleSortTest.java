package Tests;
import Algorithms.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {30, 15, 10, 25, 50, 12, 5, 1};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        BubbleSort.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
