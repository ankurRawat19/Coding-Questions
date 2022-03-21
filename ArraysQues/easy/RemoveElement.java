package ArraysQues.easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 0;
        int n = removeVal(arr, val);
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }

    private static int removeVal(int[] arr, int val) {
        int j = 0;
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] != val){
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}
