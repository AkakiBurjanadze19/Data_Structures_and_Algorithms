import Algorithms.BinarySearch;
import Algorithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        System.out.println(BinarySearch.binarySearch(arr, 5));
//        System.out.println(BinarySearch.binarySearch(arr, 10));

        System.out.println(LinearSearch.linearSearch(arr, 5));
        System.out.println(LinearSearch.linearSearch(arr, 10));
    }
}