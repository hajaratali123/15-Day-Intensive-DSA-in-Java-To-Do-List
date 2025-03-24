package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a weighted edge
class WeightedEdge {
    int v, weight;

    public WeightedEdge(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + v + ", " + weight + ")";
    }
}

public class DirectedWeightedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of vertices and edges
        System.out.println("Enter the number of nodes (vertices) and edges:");
        int V = sc.nextInt();
        int E = sc.nextInt();

        // Creating adjacency list for weighted graph
        List<List<WeightedEdge>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Input: Edges (u -> v) with weights
        System.out.println("Enter the directed edges with weights (u v w):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            adjList.get(u).add(new WeightedEdge(v, weight)); // u -> (v, weight)
        }

        // Printing adjacency list representation of the weighted graph
        System.out.println("Adjacency List Representation of Directed Weighted Graph:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }

        sc.close();
    }
}
