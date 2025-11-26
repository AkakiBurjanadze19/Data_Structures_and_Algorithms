package Algorithms.Searching;

public class LinearSearchRecursive {
    public static int search(int[] array, int element, int i) {
        // base case
        if (i >= array.length) {
            return -1;
        }

        if (array[i] == element) {
            return i;
        }

        i++;
        return search(array, element, i);
    }
}