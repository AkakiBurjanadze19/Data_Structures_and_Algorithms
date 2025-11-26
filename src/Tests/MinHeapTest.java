package Tests;

import Data_Structures.MinHeap;
import java.util.Arrays;

public class MinHeapTest {
    public static void main(String[] args) {
        int[] arr = {1, 20, 30, 15, 22, 3, 35};

        MinHeap.buildHeap(arr);

        System.out.println("Min Heap: " + Arrays.toString(arr));
    }
}