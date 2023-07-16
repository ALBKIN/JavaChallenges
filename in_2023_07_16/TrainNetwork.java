package in_2023_07_16;

public class TrainNetwork {
    public static void main(String[] args) {

        Graph trainNetwork = new Graph(true, true);

        Vertex lA = trainNetwork.addVertex("Los Angeles");
        Vertex sF = trainNetwork.addVertex("San Francisco");
        Vertex nY = trainNetwork.addVertex("New York");
        Vertex aT = trainNetwork.addVertex("Atlanta");
        Vertex dE = trainNetwork.addVertex("Denver");
        Vertex cA = trainNetwork.addVertex("Calgary");

        trainNetwork.addEdge(sF, lA, 400);
        trainNetwork.addEdge(lA, sF, 400);
        trainNetwork.addEdge(nY, dE, 1800);
        trainNetwork.addEdge(dE, nY, 1800);
        trainNetwork.addEdge(cA, dE, 1000);
        trainNetwork.addEdge(dE, cA, 1000);
        trainNetwork.addEdge(lA, aT, 2100);
        trainNetwork.addEdge(aT, lA, 2100);

        trainNetwork.removeEdge(nY, dE);
        trainNetwork.removeEdge(cA, dE);
        trainNetwork.removeEdge(dE, cA);
        trainNetwork.removeVertex(cA);

        trainNetwork.print();
    }
}