package in_2023_07_18;

import in_2023_07_16.Vertex;

public class Node {

    public Vertex data;
    private Node next;

    public Node(Vertex data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

}