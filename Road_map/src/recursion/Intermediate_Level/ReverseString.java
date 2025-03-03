package recursion.Intermediate_Level;

public class ReverseString {
    // Recursive function to reverse a string
    static String reverse(String str) {
        if (str.isEmpty()) return str; // Base case: empty string
        return reverse(str.substring(1)) + str.charAt(0); // Recursive step
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed String: " + reverse(input)); // Output: "olleh"
    }
}

