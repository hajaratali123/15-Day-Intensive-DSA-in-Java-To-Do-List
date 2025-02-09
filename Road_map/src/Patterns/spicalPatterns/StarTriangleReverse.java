package Patterns.spicalPatterns;

import java.util.Scanner;

public class StarTriangleReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = sc.nextInt();
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
