package Tests;
import Algorithms.Array.MaximumSubarraySum;

public class MaximumSubarraySumTest {
    public static void main(String[] args) {
        int[] arr = {10, -5, 15, -2, 20, -15, 86, 40, -5};

        int maxSubArraySum = MaximumSubarraySum.findMaximumSubarraySum(arr, 0, arr.length - 1);
        System.out.println(maxSubArraySum);
    }
}