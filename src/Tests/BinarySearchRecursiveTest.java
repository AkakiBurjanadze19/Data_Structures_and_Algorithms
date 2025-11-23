package Tests;
import Algorithms.Searching.BinarySearchRecursive;

public class BinarySearchRecursiveTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = BinarySearchRecursive.binarySearch(arr, 5, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}