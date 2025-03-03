package recursion.Intermediate_Level;

import java.util.Scanner;

public class ReverseArray {

    static void reverse(int[] arr, int i, int j){
        if(i>=j) return;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr,i+1,j-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Size of the Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        reverse(arr,0,n-1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
