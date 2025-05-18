package Dijkstra_Algorithm;

public class ShortestPath {
    static final int V = 9;

    int minDistance(int distance[], Boolean sptSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (!sptSet[v] && distance[v] <= min) {
                min = distance[v];
                min_index = v;
            }

        return min_index;
    }

    void printSolution(int distance[]) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t\t " + distance[i]);
    }

    void dijkstra(int graph[][], int src) {
        int distance[] = new int[V];
        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        distance[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(distance, sptSet);
            sptSet[u] = true;

            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 &&
                    distance[u] != Integer.MAX_VALUE &&
                    distance[u] + graph[u][v] < distance[v])
                    distance[v] = distance[u] + graph[u][v];
        }

        printSolution(distance);
    }
}
