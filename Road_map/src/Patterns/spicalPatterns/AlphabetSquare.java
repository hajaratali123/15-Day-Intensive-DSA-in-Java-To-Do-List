package Patterns.spicalPatterns;

import java.util.Scanner;

public class AlphabetSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = sc.nextInt();
        for (char i = 'A'; i <= 'A'+n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
