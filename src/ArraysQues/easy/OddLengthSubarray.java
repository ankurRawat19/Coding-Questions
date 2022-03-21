package ArraysQues.easy;

public class OddLengthSubarray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i ; j < arr.length ; j++)
                if(isOddSubArr(i, j)){
                    ans += sum(arr,i,j);
                }
        }

        return ans;
    }
    public static boolean isOddSubArr(int i, int j){
        if((j-i+1)%2 != 0)
            return true;
        else
            return false;
    }
     public static int sum(int[] arr, int i, int j){
        int sum = 0;
        for (int index = i ; index <= j ; index++){
            sum += arr[index];
        }
        return sum;
     }
}
