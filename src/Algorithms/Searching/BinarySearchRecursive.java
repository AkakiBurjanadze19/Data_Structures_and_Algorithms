package Algorithms.Searching;

/*
    Time Complexity: O(log n)
    Space Complexity: O(1)
 */
public class BinarySearchRecursive {
    public static int search(int[] array, int element, int left, int right) {
        // base case
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (array[mid] == element) {
            return mid;
        } else if (array[mid] < element) {
            return search(array, element, mid + 1, right);
        } else {
            return search(array, element, left, mid - 1);
        }
    }
}