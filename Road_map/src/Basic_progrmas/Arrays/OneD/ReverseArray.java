package Basic_progrmas.Arrays.OneD;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        for (int i = 0; i <n/2 ; i++) {
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
