package Algorithms.Array;

public class MaximumSubarray {
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    private static int[] findMaxCrossingSubarray(int[] array, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE; // greatest left array sum found so far
        int rightSum = Integer.MIN_VALUE; // greatest right array sum found so far
        int sum = 0; // sum of left array sum + right array sum
        int maxLeft = 0;
        int maxRight = 0;

        // find maximum subarray of the left half
        for (int i = mid; i >= low; i--) {
            sum = sum + array[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        sum = 0;
        // find maximum subarray of the right half
        for (int j = mid + 1; j <= high; j++) {
            sum = sum + array[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }

        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }

    /*
        Time Complexity: O(n log n)
        Space Complexity: O(log n)
     */
    public static int[] findMaximumSubarray(int[] array, int low, int high) {
        if (high == low) {
            return new int[]{low, high, array[low]};
        } else {
            int mid = low + (high - low) / 2;

            int[] left = findMaximumSubarray(array, low, mid);
            int[] right = findMaximumSubarray(array, mid + 1, high);
            int[] cross = findMaxCrossingSubarray(array, low, mid, high);

            int leftSum = left[2];
            int rightSum = right[2];
            int crossSum = cross[2];

            if (leftSum >= rightSum && leftSum >= crossSum) {
                return left;
            } else if (rightSum >= leftSum && rightSum >= crossSum) {
                return right;
            } else {
                return cross;
            }
        }
    }
}