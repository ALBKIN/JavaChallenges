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

    public static void main(String[] args) {
        //Instantiate a MinHeap, assign to minHeap
        MinHeap minHeap = new MinHeap();

        //Display contents of minHeap
        System.out.println(minHeap.heap);
        System.out.println(minHeap.size);
    }
}
