package recursion.Intermediate_Level;

public class FindMaxElement {

    static int findMax(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.max(arr[i], findMax(arr, i + 1));
    }
    static int findMax2(int[] arr) {
        int max = arr[0];
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]>max){
                max=arr[j];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = arr[0];
        System.out.println("The max element is:"+ findMax(arr,0));


        System.out.println("The max element is:"+ findMax2(arr));



    }
}
