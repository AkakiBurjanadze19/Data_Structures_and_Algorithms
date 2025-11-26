package Algorithms.Sorting;
import Data_Structures.MaxHeap;

public class HeapSort {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*
        Time Complexity: O(n log n)
        Space Complexity: O(1)
     */
    public static void sort(int[] array) {
        int heapSize = array.length;

        MaxHeap.buildHeap(array);

        for (int i = heapSize - 1; i > 0; i--) {
            swap(array, 0, i);
            heapSize--;
            MaxHeap.heapify(array, 0, heapSize);
        }
    }
}