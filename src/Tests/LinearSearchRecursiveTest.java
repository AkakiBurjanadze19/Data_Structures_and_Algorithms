package Tests;
import Algorithms.Searching.LinearSearchRecursive;

public class LinearSearchRecursiveTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int result = LinearSearchRecursive.search(arr, 50, 0);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
