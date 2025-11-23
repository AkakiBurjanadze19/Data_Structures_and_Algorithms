package Algorithms;

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
 */
public class LinearSearch {
    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
}