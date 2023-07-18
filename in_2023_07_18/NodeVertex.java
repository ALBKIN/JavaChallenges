package in_2023_07_18;

import in_2023_07_16.Vertex;

public class NodeVertex {

    public Vertex data;
    private NodeVertex next;

    public NodeVertex(Vertex data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(NodeVertex nodeVertex) {
        this.next = nodeVertex;
    }

    public NodeVertex getNextNode() {
        return this.next;
    }

}