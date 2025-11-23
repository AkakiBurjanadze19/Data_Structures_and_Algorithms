package Tests;
import java.util.Arrays;
import Algorithms.Array.MaximumSubarray;

public class MaximumSubarrayTest {
    public static void main(String[] args) {
        int[] arr = {10, -5, 15, -2, 20, -15, 86, 40, -5};

        System.out.println(Arrays.toString(MaximumSubarray.findMaximumSubarray(arr, 0, arr.length - 1)));
    }
}