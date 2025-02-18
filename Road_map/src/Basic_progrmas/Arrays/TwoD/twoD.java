package Basic_progrmas.Arrays.TwoD;

import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter the elements of Arrays :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("The out put :");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println(arr[i][j]);

            }

        }
        System.out.println("Using Enhanced For-Each Loop");
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));

        }
        System.out.println(Arrays.deepToString(arr));
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(Arrays.deepToString(matrix)); // Output: 6

    }
}
