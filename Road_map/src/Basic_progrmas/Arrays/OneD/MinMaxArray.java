package Basic_progrmas.Arrays.OneD;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Arrays: ");
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("The Maximum number :"+ maxele(arr,max));
        System.out.println("The Minimum number :"+ minEle(arr,min));

        for (int num : arr){
            if(num < min  ) min = num;
            if(num > max  ) max=num;
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static int maxele(int[] arr ,int max){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
    public  static int minEle(int[] arr,int min){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]< min ){
                min = arr[i];
            }
        }
        return min;
    }
}
