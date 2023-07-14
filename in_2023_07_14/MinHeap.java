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

    public int getParent(int current) {
        return (int) Math.floor(current / 2);
    }

    public int getLeft(int current) {
        return current *2;
    }

    public int getRight(int current) {
        return (current * 2) + 1;
    }

    public static void main(String[] args) {
        //Instantiate a MinHeap, assign to minHeap
        MinHeap minHeap = new MinHeap();

        // Sample content of minHeap
        minHeap.add(10);
        minHeap.add(13);
        minHeap.add(21);
        minHeap.add(61);
        minHeap.add(22);
        minHeap.add(23);
        minHeap.add(99);

        //Display contents of minHeap
        System.out.println(minHeap.heap);
        System.out.println(minHeap.size);

        // Add 42 to minHeap using add() below
        minHeap.add(42);

        // Display parent, left and right indices of currentIndex
        int currentIndex = 3;
        System.out.println("----------");
        System.out.println("Let's look at index " + currentIndex);
        System.out.println("Parent index: " + minHeap.getParent(currentIndex));
        System.out.println("Left child index: " + minHeap.getLeft(currentIndex));
        System.out.println("Right child index: " + minHeap.getRight(currentIndex));

        // Display the parent, left and right child values of currentValue
        int currentValue = minHeap.heap.get(currentIndex);
        System.out.println("The value at index 3 is " + currentValue);
        System.out.println("Parent value: " + minHeap.heap.get(minHeap.getParent(currentIndex)));
        System.out.println("Left child value: " + minHeap.heap.get(minHeap.getLeft(currentIndex)));
        System.out.println("Right child value: " + minHeap.heap.get(minHeap.getRight(currentIndex)));

    }
}
