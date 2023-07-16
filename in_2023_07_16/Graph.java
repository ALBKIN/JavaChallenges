package in_2023_07_16;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void removeVertex(Vertex vertex) {
        vertices.remove(vertex);
    }

    // method to create double way edge between two vertices
    public void addEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.addEdge(vertex2);
        vertex2.addEdge(vertex1);
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
        vertex2.removeEdge(vertex1);
    }

    public ArrayList<Vertex> getVertices() {
        return this.vertices;
    }

    public Vertex getVertexByValue(String value) {
        for (Vertex v : this.vertices) {
            if (v.getData() == value) {
                return v;
            }
        }
        return null;
    }

    public void print() {
        for (Vertex v : this.vertices) {
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        Graph trainNetwork = new Graph();
        Vertex atlantaStation = trainNetwork.addVertex("Atlanta");
        Vertex newYorkStation = trainNetwork.addVertex("New York");
        /*
        TO TEST REMOVAL METHOD
        trainNetwork.removeVertex(atlantaStation);
         */

        // TEST ADD BOTH WAY EDGE:
        trainNetwork.addEdge(atlantaStation, newYorkStation);
        trainNetwork.print();

        System.out.println("Testing the removeEdge() method: ");
        trainNetwork.removeEdge(atlantaStation, newYorkStation);
        trainNetwork.print();

    }
}

