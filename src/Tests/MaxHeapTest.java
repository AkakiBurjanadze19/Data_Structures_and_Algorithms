package Tests;
import Data_Structures.MaxHeap;
import java.util.Arrays;

public class MaxHeapTest {
    public static void main(String[] args) {
        int[] arr = {1, 20, 30, 15, 22, 3, 35};

        MaxHeap.buildHeap(arr);

        System.out.println("Max Heap: " + Arrays.toString(arr));
    }
}
