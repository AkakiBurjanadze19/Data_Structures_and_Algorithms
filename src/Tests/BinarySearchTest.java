package Tests;
import Algorithms.Searching.BinarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = BinarySearch.search(arr, 5);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
