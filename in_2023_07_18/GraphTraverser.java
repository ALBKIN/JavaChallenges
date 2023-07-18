package in_2023_07_18;

import in_2023_07_16.Vertex;
import in_2023_07_16.Edge;

import java.util.ArrayList;

public class GraphTraverser {

    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        System.out.println(start.getData());
        if (start.getEdges().size() > 0) {
            Vertex neighbor = start.getEdges().get(0).getEnd();

            if (!visitedVertices.contains(neighbor)) {
                visitedVertices.add(neighbor);
                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

    public static void main(String[] args) {
        TestGraph test = new TestGraph();
        Vertex startingVertex = test.getStartingVertex();
        ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
        visitedVertices.add(startingVertex);

        GraphTraverser.depthFirstTraversal(startingVertex, visitedVertices);
    }
}
