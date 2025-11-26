package Data_Structures;

public class BinaryHeap {
    private static int parent(int i) {
        return (i - 1) / 2;
    }

    private static int left(int i) {
        return i * 2 + 1;
    }

    private static int right(int i) {
        return i * 2 + 2;
    }

    public static void main(String[] args) {
        System.out.println("Binary Heap");
    }
}