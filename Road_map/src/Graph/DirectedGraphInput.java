package Graph;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectedGraphInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of nodes (vertices) and edges
        System.out.println("Enter the number of nodes (vertices) and edges:");
        int V = sc.nextInt();
        int E = sc.nextInt();

        // Creating adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Input: Directed edges (u -> v)
        System.out.println("Enter the directed edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v); // Only one-directional edge u -> v
        }

        // Printing the adjacency list representation
        System.out.println("Adjacency List Representation of Directed Graph:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }

        sc.close();
    }
}
