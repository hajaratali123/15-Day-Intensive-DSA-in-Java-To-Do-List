package recursion.Intermediate_Level;

public class CheckSortedArray {

    static boolean isSorted(int[] arr,int index) {
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        System.out.println("is sorted :"+isSorted(arr,0));
    }
}
