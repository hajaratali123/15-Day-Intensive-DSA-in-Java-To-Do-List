package recursion.Intermediate_Level;



public class RecursiveBinarySearch {
    public static int BinarySearch(int[] arr,int start,int end,int target){
        if(start>end){
            return-1;
        }
        int mid=start+(end-start)/2;
        if(mid==target){
            return mid;
        }
        else if(mid<target){
            return BinarySearch(arr,mid+1,end,target);
        }
        else {
            return BinarySearch(arr,start,mid-1,target);
        }
    }
    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        }
        else return binarySearch(arr, mid + 1, end, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        System.out.println("Binary Search:"+BinarySearch(arr,0,arr.length,target));
        System.out.println("Index of : "+ target +" is "+ binarySearch(arr, 0, arr.length - 1, target)); // Output: 3

    }
}
