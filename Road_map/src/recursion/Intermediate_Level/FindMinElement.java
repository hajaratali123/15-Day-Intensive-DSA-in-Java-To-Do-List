package recursion.Intermediate_Level;

public class FindMinElement {

    public static int findMin(int[] arr, int i) {
        if(i== arr.length-1) return arr[i];
        return Math.min(arr[i],findMin(arr,i+1));
    }
    public static int findMin2(int[] arr){
        int min = arr[0];
        for(int j =0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        return min;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = arr[0];
        System.out.println("The min element is:"+ findMin(arr,0));
        System.out.println("The min element is:"+ findMin2(arr));
    }
}
