package recursion.Intermediate_Level;



import java.util.Scanner;

public class Power {
    // Basic Recursive Power Function (O(b))
    public static int pow(int a, int b) {
        if (b == 0) return 1; // Base case
        return a * pow(a, b - 1); // Recursive call
    }

    // Optimized Recursive Power Function (O(log b))
    public static int pow2(int a, int b) {
        if (b == 0) return 1; // Base case
        int ans = pow2(a, b / 2);
        if (b % 2 == 0) {
            return ans * ans; // If power is even
        } else {
            return ans * ans * a; // If power is odd
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int a = sc.nextInt();
        System.out.print("Enter the Power: ");
        int b = sc.nextInt();

        System.out.println("Power (Simple Recursion): " + pow(a, b));
        System.out.println("Power (Optimized): " + pow2(a, b));
    }
}

