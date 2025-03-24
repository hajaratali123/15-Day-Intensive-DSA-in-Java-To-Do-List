package Graph;

import java.util.*;

// Graph Class
class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Edge>[] adjList; // Adjacency List
    private boolean isDirected;

    // Edge Class for Weighted Graphs
    static class Edge {
        int dest, weight;
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Constructor for Graph
    public Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge (Weighted or Unweighted)
    public void addEdge(int src, int dest, int weight) {
        adjList[src].add(new Edge(dest, weight));
        if (!isDirected) {
            adjList[dest].add(new Edge(src, weight));
        }
    }

    // Print the Graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge edge : adjList[i]) {
                System.out.print("(" + edge.dest + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    // BFS (Checking if Connected Graph)
    public boolean isConnected() {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Edge edge : adjList[node]) {
                if (!visited[edge.dest]) {
                    visited[edge.dest] = true;
                    queue.add(edge.dest);
                    count++;
                }
            }
        }
        return count == vertices; // If all nodes are visited, graph is connected
    }

    // Detect Cycle using DFS
    private boolean detectCycleDFS(int node, boolean[] visited, int parent) {
        visited[node] = true;
        for (Edge edge : adjList[node]) {
            if (!visited[edge.dest]) {
                if (detectCycleDFS(edge.dest, visited, node)) return true;
            } else if (edge.dest != parent) {
                return true; // Cycle Detected
            }
        }
        return false;
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (detectCycleDFS(i, visited, -1)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example: Undirected, Weighted Graph
        Graph graph = new Graph(5, false);
        graph.addEdge(0, 1, 2);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 5);
        graph.addEdge(4, 0, 6);
        graph.printGraph();

        System.out.println("Is Connected: " + graph.isConnected());
        System.out.println("Has Cycle: " + graph.hasCycle());
    }
}
