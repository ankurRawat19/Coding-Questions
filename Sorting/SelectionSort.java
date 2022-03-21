package Sorting;

import java.util.Arrays;

//good for small arrays only
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

//    private static void swap(int[] arr, int first, int last) {
//        int temp = arr[first];
//        arr[first] = arr[last];
//        arr[last] = temp;
//    }

//    private static int findMax(int[] arr, int start, int end) {
//        int max = start;
//        for (int i = 0 ; i < arr.length; i++){
//            if(arr[i] > arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }
}
