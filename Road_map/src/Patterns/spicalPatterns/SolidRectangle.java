package Patterns.spicalPatterns;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        int m = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
