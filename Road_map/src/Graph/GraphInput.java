package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices and edges:");
        int V = sc.nextInt();
        int E = sc.nextInt();

        // Initialize adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Add edges (undirected graph)
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Print adjacency list
        System.out.println("Adjacency list:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }

        sc.close();
    }
}
