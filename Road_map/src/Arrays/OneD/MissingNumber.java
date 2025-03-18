package Arrays.OneD;


//Find the Missing Number in an Array of 1 to N
//Problem: An array contains numbers from 1 to N with one missing. Find the missing number.
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4};
        int n =arr.length;
        int sumN = n*(n+1)/2;
        System.out.println(sumN);
        int sumArr = 0;

        for (int num : arr){
            sumArr+=num;
        }
        System.out.println("Missing Number: " + (sumN - sumArr));

    }
}
