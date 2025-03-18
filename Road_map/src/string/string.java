package string;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = "Ali";
        String a = "Hajarat";
        System.out.println(a==b);

        String c = new String(a+b);
        System.out.println(c);

        String text = "java";
        System.out.println(text.length());
        System.out.println(text.charAt(3));

//        System.out.println("Enter the String :");
//        String str = sc.next();
//        System.out.println("The String :"+ str);


        String s1 = "Hello";
        String  s2 = "World";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        String ac = "Java";
        String bc = "Java";
        String cc = new String("Java");

        System.out.println(ac == bc);         // Output: true  (same reference in String Pool)
        System.out.println(ac == cc);         // Output: false (different objects in Heap)
        System.out.println(ac.equals(cc));    // Output: true  (checks content)

        String text2 = "Java";
        System.out.println(text2.toUpperCase()); // Output: "JAVA"
        System.out.println(text2.toLowerCase()); // Output: "java"

        String name = "  Java  ";
        System.out.println(name.trim()); // Output: "Java"

        String str = "apple";
        System.out.println(str.replace('p', 'b')); // Output: "abble"

        String sentence = "Java,Python,C++";
        String[] words = sentence.split(",");
        System.out.println(words[0]); // Output: "Java"

        String text3 = "HelloWorld";
        System.out.println(text3.startsWith("Hello")); // true
        System.out.println(text3.endsWith("Java"));   // false



    }
}
