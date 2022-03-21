package ArraysQues.easy;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0 ; i < nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
    return maxSum;
    }
}
