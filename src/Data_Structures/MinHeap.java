package Data_Structures;

public class MinHeap {
    private static int parent(int i) {
        return (i - 1) / 2;
    }

    private static int left(int i) {
        return i * 2 + 1;
    }

    private static int right(int i) {
        return i * 2 + 2;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(log n)
     */
    public static void heapify(int[] array, int i, int heapSize) {
        int l = left(i);
        int r = right(i);

        int smallest = i;

        if (l < heapSize && array[l] < array[smallest]) {
            smallest = l;
        }

        if (r < heapSize && array[r] < array[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            swap(array, i, smallest);
            heapify(array, smallest, heapSize);
        }
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(log n)
     */
    public static void buildHeap(int[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            heapify(array, i, array.length);
        }
    }
}