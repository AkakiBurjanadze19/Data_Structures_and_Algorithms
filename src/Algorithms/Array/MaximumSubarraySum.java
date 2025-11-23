package Algorithms.Array;

public class MaximumSubarraySum {
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    private static int findMaxCrossingSubarraySum(int[] array, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE; // greatest left array sum found so far
        int rightSum = Integer.MIN_VALUE; // greatest right array sum found so far
        int sum = 0; // sum of left array sum + right array sum

        // find maximum subarray sum of the left half
        for (int i = mid; i >= low; i--) {
            sum = sum + array[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        // find maximum subarray sum of the right half
        for (int j = mid + 1; j <= high; j++) {
            sum = sum + array[j];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum;
    }

    /*
        Time Complexity: O(n log n)
        Space Complexity: O(log n)
     */
    public static int findMaximumSubarraySum(int[] array, int low, int high) {
        if (high == low) {
            return array[low];
        } else {
            int mid = low + (high - low) / 2;

            int leftSum = findMaximumSubarraySum(array, low, mid);
            int rightSum = findMaximumSubarraySum(array, mid + 1, high);
            int crossSum = findMaxCrossingSubarraySum(array, low, mid, high);

            if (leftSum >= rightSum && leftSum >= crossSum) {
                return leftSum;
            } else if (rightSum >= leftSum && rightSum >= crossSum) {
                return rightSum;
            } else {
                return crossSum;
            }
        }
    }
}
