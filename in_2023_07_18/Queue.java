package in_2023_07_18;

import in_2023_07_16.Vertex;

public class Queue {

    public LinkedListVertex queue;
    public int size;

    public Queue() {
        this.queue = new LinkedListVertex();
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(Vertex data) {
        this.queue.addToTail(data);
        this.size++;
    }

    public Vertex peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.queue.head.data;
        }
    }

    public Vertex dequeue() {
        if (!this.isEmpty()) {
            Vertex data = this.queue.removeHead();
            this.size--;
            return data;
        } else {
            throw new Error("LinearDataStructure.Queues.Queue is empty");
        }
    }

}
