package in_2023_07_16;

import java.util.ArrayList;

public class Vertex {
    public String data;
    public ArrayList<Edge> edges;

    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new ArrayList<>();
    }

    public String getData() {
        return this.data;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        Edge newEdge = new Edge(this, endVertex, weight);
        edges.add(newEdge);
    }

    // METHOD TO REMOVE AN EDGE
    public void removeEdge(Vertex endVertex) {
        edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public void print(boolean showWeight) {
        String message = "";

        if (this.edges.size() == 0) {
            System.out.println(this.data + " -->");
            return;
        }

        for (int i = 0; i < this.edges.size(); i++) {
            if (i == 0) {
                message += this.edges.get(i).getStart().data + " --> ";
            }

            message += this.edges.get(i).getEnd().data;

            if (showWeight) {
                message += " (" + this.edges.get(i).getWeight() + ")";
            }
            if (i != this.edges.size() - 1) {
                message += ", ";
            }
        }
        System.out.println(message);
    }

    public static void main(String[] args) {

    }
}

