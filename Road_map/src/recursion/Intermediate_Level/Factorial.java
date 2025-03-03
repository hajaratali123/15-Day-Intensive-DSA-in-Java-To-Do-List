package recursion.Intermediate_Level;



import java.util.Scanner;

public class Factorial {
    // Recursive function for factorial
    public static int fact(int n) {
        if (n == 0 || n == 1) return 1; // Base case
        return n * fact(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + ": " + fact(num));
    }
}
