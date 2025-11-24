package Algorithms.Sorting;

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
 */
public class MergeSort2 {
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1; // size of left half
        int n2 = right - mid; // size of right half

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        // copy left half
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }

        // copy right half
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = left; k <= right; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
    }

    /*
        Time Complexity: O(n log n)
        Space Complexity: O(n)
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
}