package Basic_progrmas.Arrays.OneD;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        int[] arr = {10,30,40,50};

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("One D Array :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter the value of array");
        for (int j = 0; j <n; j++) {
            arr2[j]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));


    }
}
