package Patterns.spicalPatterns;

import java.util.Scanner;

public class OddNumberTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = sc.nextInt();
        int num =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
            }
            num+=2;
            System.out.println();
        }

    }
}
