package Basic_progrmas.string;

import java.util.Scanner;

public class MethodsOnString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = "abcd";
            // Methods on String
            System.out.println("Char at index 2: " + s.charAt(2));
            System.out.println("Length: " + s.length());

            // indexOf() and compareTo()
            System.out.println("Index of 'a': " + s.indexOf("a"));
            System.out.println("Index of character not exists: " + s.indexOf("Z"));

            String a = "abcd";
            String b = "abc";
            System.out.println("Comparison of 'abcd' and 'abc': " + a.compareTo(b));

            // startsWith and contains
            System.out.println("Starts with 'Su': " + s.startsWith("Su"));
            System.out.println("Contains 'naaa': " + s.contains("naaa"));

            // lowercase and uppercase
            System.out.println("Lowercase: " + s.toLowerCase());
            System.out.println("Uppercase: " + s.toUpperCase());

            // Concatenation
            System.out.println("Concatenation with + operator: " + (a + b));
            System.out.println("Concatenation with concat method: " + b.concat(a));

            // substring(i) and substring(i, j)
            String str = "Hajarat ali";
            System.out.println("Substring from index 2: " + str.substring(2));

            // Generate and print all substrings
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    System.out.print(str.substring(i, j) + " ");
                }
                System.out.println();
            }

            // + operator for string concatenation
            String st1 = "abd";
            String s2 = "efg";
            st1 = st1 + s2;
            System.out.println("+ operator result: " + st1);

            System.out.println("abc" + 10 + 30);
            System.out.println("abc" + (10 + 30));
            System.out.println(10 + 30 + "abc");

            // Convert int into string
            System.out.println("Enter a number");
            int num = sc.nextInt();
            String s3 = "abcd";
            s3 += num;

            String s4 = Integer.toString(num);
            String s5 = s4 + num;
            System.out.println(s3);
            System.out.println(s4);

            System.out.println(s4.length());
            System.out.println(s5.length());

            // Interning and new keyword
            String s1 = new String("hello");
            String s6 = "hello";
            System.out.println(s1 == s2); // false
            System.out.println(s1.intern() == s6); // true

        } finally {
            sc.close();
        }
    }
}
