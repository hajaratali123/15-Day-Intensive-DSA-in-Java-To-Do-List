package recursion.Intermediate_Level;



import java.util.Scanner;

public class FibonacciNumber {
    // Recursive function with Memoization
    public static int fibo(int n, int[] dp) {
        if (n <= 1) return n; // Base case
        if (dp[n] != 0) return dp[n]; // Return if already computed

        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp); // Store computed value
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] dp = new int[n + 1]; // Memoization array
        System.out.println("Fibonacci of " + n + ": " + fibo(n, dp));
    }
}
