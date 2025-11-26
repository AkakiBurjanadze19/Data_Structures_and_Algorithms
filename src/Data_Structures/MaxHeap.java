package Data_Structures;

public class MaxHeap {
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
        int l = left(i); // left child index
        int r = right(i); // right child index

        int largest = i;

        if (l < heapSize && array[l] > array[largest]) {
            largest = l;
        }

        if (r < heapSize && array[r] > array[largest]) {
            largest = r;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, largest, heapSize);
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

    public static void main(String[] args) {
        System.out.println("Binary Heap");
    }
}