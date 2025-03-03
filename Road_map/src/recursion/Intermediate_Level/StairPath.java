package recursion.Intermediate_Level;



import java.util.Scanner;

public class StairPath {
    // Recursive function to find the number of ways to reach the nth stair
    public static int stair(int n) {
        if (n <= 2) return n; // Base cases: 1 step = 1 way, 2 steps = 2 ways
        return stair(n - 1) + stair(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println("Ways to climb " + n + " stairs: " + stair(n));
    }
}
