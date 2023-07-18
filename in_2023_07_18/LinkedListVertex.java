package in_2023_07_18;

import in_2023_07_16.Vertex;

public class LinkedListVertex {

    public NodeVertex head;

    public LinkedListVertex() {
        this.head = null;
    }

    public void addToHead(Vertex data) {
        NodeVertex newHead = new NodeVertex(data);
        NodeVertex currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(Vertex data) {
        NodeVertex tail = this.head;
        if (tail == null) {
            this.head = new NodeVertex(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new NodeVertex(data));
        }
    }

    public Vertex removeHead() {
        NodeVertex removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }
}