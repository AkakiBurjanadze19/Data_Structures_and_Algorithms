package Algorithms;

/*
    Time Complexity: O(log n)
    Space Complexity: O(1)
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}