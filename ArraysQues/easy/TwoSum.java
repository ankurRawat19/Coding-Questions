package ArraysQues.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hmp = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0 ; i < nums.length; i++){
            int compliment = target - nums[i];
            if(hmp.get(compliment) != null){
                res[0] = i;
                res[1] = hmp.get(compliment);
                break;
            }
            else{
                hmp.put(nums[i],i);
            }
        }
        return res;
    }
}
