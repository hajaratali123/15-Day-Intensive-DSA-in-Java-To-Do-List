package Patterns.spicalPatterns;

import java.util.Scanner;

public class BinaryTraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("printing Binary Triangle ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if (i%2==1){
                    if(j%2==1){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("O");
                    }
                }
                else {
                    if (j%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("O");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("printing Binary Triangle 2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else
                    System.out.print("O");
            }
            System.out.println();
        }
    }
}
