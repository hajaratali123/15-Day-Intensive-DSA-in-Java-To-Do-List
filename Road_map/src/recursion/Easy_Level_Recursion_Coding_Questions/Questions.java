package recursion.Easy_Level_Recursion_Coding_Questions;

public class Questions {

    // Prints numbers from N to 1 using recursion
    void printNto1(int n) {
        if (n == 0) return; // Base case
        System.out.print(n + " ");
        printNto1(n - 1); // Recursive call
    }

    // Prints numbers from 1 to N using recursion
    void print1toN(int n) {
        if (n == 0) return; // Base case
        print1toN(n - 1); // Recursive call
        System.out.print(n + " ");
    }

    // Recursively calculates the sum of first N natural numbers
    int sumN(int n) {
        if (n == 0) return 0; // Base case
        return n + sumN(n - 1); // Recursive call
    }

    // Recursively calculates the factorial of a number
    int factorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    // Recursively calculates power (a^b)
    int power(int a, int b) {
        if (b == 0) return 1; // Base case: a^0 = 1
        return a * power(a, b - 1); // Recursive call
    }

    // Checks if a string is a palindrome using recursion
    boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true; // Base case
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1); // Recursive call
    }

    // Recursively finds the Greatest Common Divisor (GCD)
    int gcd(int a, int b) {
        if (b == 0) return a; // Base case
        return gcd(b, a % b); // Recursive call
    }

    // Finds the Least Common Multiple (LCM) using the GCD formula
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // Using GCD formula
    }

    // Recursively computes the nth Fibonacci number
    int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }

    // Recursively finds the sum of digits of a number
    int sumOfDigits(int n) {
        if (n == 0) return 0; // Base case
        return (n % 10) + sumOfDigits(n / 10); // Recursive call
    }

    // Main method to test all recursive functions
    public static void main(String[] args) {
        Questions q = new Questions();

        System.out.println("Printing numbers from N to 1:");
        q.printNto1(5);
        System.out.println("\n");

        System.out.println("Printing numbers from 1 to N:");
        q.print1toN(5);
        System.out.println("\n");

        System.out.println("Sum of first N natural numbers:");
        System.out.println(q.sumN(5)); // Output: 15

        System.out.println("Factorial of a number:");
        System.out.println(q.factorial(5)); // Output: 120

        System.out.println("Power (a^b):");
        System.out.println(q.power(2, 3)); // Output: 8

        System.out.println("Check if string is palindrome:");
        System.out.println(q.isPalindrome("madam", 0, 4)); // Output: true
        System.out.println(q.isPalindrome("hello", 0, 4)); // Output: false

        System.out.println("GCD of two numbers:");
        System.out.println(q.gcd(24, 36)); // Output: 12

        System.out.println("LCM of two numbers:");
        System.out.println(q.lcm(4, 6)); // Output: 12

        System.out.println("Nth Fibonacci number:");
        System.out.println(q.fibonacci(5)); // Output: 5

        System.out.println("Sum of digits of a number:");
        System.out.println(q.sumOfDigits(1234)); // Output: 10
    }
}
