package recursion.Intermediate_Level;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return; // Base case
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Output: [1, 2, 3, 5, 8]
    }
}

