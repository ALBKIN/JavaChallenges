package in_2023_07_18;

import in_2023_07_16.Edge;
import in_2023_07_16.Graph;
import in_2023_07_16.Vertex;

import java.util.*;

public class Dijkstra {


    public static Dictionary[] dijkstra(Graph g, Vertex startingVertex) {
        Dictionary<String, Integer> distances = new Hashtable<>();
        Dictionary<String, Vertex> previous = new Hashtable<>();

        for (Vertex v : g.getVertices()) {
            distances.put(v.getData(), Integer.MAX_VALUE);
            previous.put(v.getData(), new Vertex(null));
        }
        distances.put(startingVertex.getData(), 0);
        Vertex current = startingVertex;
        for (Edge e : current.getEdges()) {
            Integer alternate = e.getWeight() + distances.get(current.getData());
            String neighborValue = e.getEnd().getData();
            if (alternate < distances.get(neighborValue)) {
                distances.put(neighborValue, alternate);
                previous.put(neighborValue, current);

            }

        }

        return new Dictionary[]{distances, previous};
    }

    public static void dijkstraResultPrinter(Dictionary[] d) {
        System.out.println("Distances:\n");
        for (Enumeration keys = d[0].keys(); keys.hasMoreElements(); ) {
            String nextKey = keys.nextElement().toString();
            System.out.println(nextKey + ": " + d[0].get(nextKey));
        }
        System.out.println("\nPrevious:\n");
        for (Enumeration keys = d[1].keys(); keys.hasMoreElements(); ) {
            String nextKey = keys.nextElement().toString();
            Vertex nextVertex = (Vertex) d[1].get(nextKey);
            System.out.println(nextKey + ": " + nextVertex.getData());
        }
    }

    public static void main(String[] args) {
        Graph testGraph = new Graph(true, true);
        Vertex a = testGraph.addVertex("A");
        Vertex b = testGraph.addVertex("B");
        Vertex c = testGraph.addVertex("C");
        Vertex d = testGraph.addVertex("D");
        Vertex e = testGraph.addVertex("E");
        Vertex f = testGraph.addVertex("F");
        Vertex g = testGraph.addVertex("G");

        testGraph.addEdge(a, c, 100);
        testGraph.addEdge(a, b, 3);
        testGraph.addEdge(a, d, 4);
        testGraph.addEdge(d, c, 3);
        testGraph.addEdge(d, e, 8);
        testGraph.addEdge(e, b, -2);
        testGraph.addEdge(e, f, 10);
        testGraph.addEdge(b, g, 9);
        testGraph.addEdge(e, g, -50);

        dijkstraResultPrinter(dijkstra(testGraph, a));

    }
}