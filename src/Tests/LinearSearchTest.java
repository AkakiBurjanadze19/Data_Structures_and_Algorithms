package Tests;
import Algorithms.Searching.LinearSearch;

public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr = {30, 20, 12, 15, 16};

        int result = LinearSearch.linearSearch(arr, 16);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
