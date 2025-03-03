package recursion.Intermediate_Level;



import java.util.Scanner;

public class PrintNumbers {
    // Prints numbers from N to 1 (Backwards)
    public static void backPrint(int n) {
        if (n == 0) return; // Base case
        System.out.println(n);
        backPrint(n - 1); // Recursive call
    }

    // Prints numbers from 1 to N (Forwards)
    public static void backPrintFront(int n) {
        if (n == 0) return; // Base case
        backPrintFront(n - 1); // Recursive call
        System.out.println(n);
    }

    // Prints numbers from x to N
    public static void frontPrint(int x, int n) {
        if (x > n) return; // Base case
        System.out.println(x);
        frontPrint(x + 1, n); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing in decreasing order:");
        backPrint(n);

        System.out.println("Printing in increasing order:");
        backPrintFront(n);

        System.out.println("Printing from 1 to N:");
        frontPrint(3, n);
    }
}

