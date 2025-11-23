package Algorithms.Searching;

public class LinearSearchRecursive {
    public static int linearSearch(int[] array, int element, int i) {
        // base case
        if (i >= array.length) {
            return -1;
        }

        if (array[i] == element) {
            return i;
        }

        i++;
        return linearSearch(array, element, i);
    }
}