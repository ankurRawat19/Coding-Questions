package ArraysQues.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    public static int[] createTargetArray(int[] nums, int[] index){
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : index){
            list.add(i,nums[k++]);
        }
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
