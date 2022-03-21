package ArraysQues.easy;

import java.util.HashMap;

public class RemoveDuplicatesUsingMaps {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
        removeDups(arr);
    }

    private static void removeDups(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Boolean> hmp = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
            if (hmp.get(arr[i]) == null) {
                System.out.println(arr[i] + " ");
            }
            hmp.put(arr[i], true);
        }
    }
}
