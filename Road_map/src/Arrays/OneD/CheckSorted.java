package Arrays.OneD;

//Check if an Array is Sorted (Ascending Order)

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,4,5};
        boolean check = false;

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] < arr[i-1]){
                check=false;
                break;
            }

        }
        System.out.println(check ? "Sorted" : "Not Sorted");

    }
}
