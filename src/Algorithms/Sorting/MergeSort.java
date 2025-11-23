package Algorithms.Sorting;

public class MergeSort {
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1; // left arr size
        int n2 = right - mid; // right arr size

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy left half
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }

        // copy right half
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // merge back into array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements from L
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // copy remaining elements from R
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    /*
        Time Complexity: O(n log n)
        Space Complexity: O(n)
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
}