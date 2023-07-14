package in_2023_07_14;

import java.util.ArrayList;
import java.util.Arrays;

public class MinHeap {

    public ArrayList<Integer> heap;
    public int size;

    // Define MinHeap constructor
    public MinHeap() {
        this.heap = new ArrayList<>();
        this.heap.add(null);
        this.size = 0;
    }

    // Define add()
    public void add(int value) {
        heap.add(value);
        size++;
        System.out.println("Adding " + value);
        System.out.println(this.heap);
        this.bubbleUp();
    }

    private void bubbleUp() {
        System.out.println("Restoring heap condition...");
    }


    public static void main(String[] args) {
        //Instantiate a MinHeap, assign to minHeap
        MinHeap minHeap = new MinHeap();

        //Display contents of minHeap
        System.out.println(minHeap.heap);
        System.out.println(minHeap.size);

        // Add 42 to minHeap using add() below
        minHeap.add(42);
    }
}
