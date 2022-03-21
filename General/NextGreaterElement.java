package General;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0 ; i < nums1.length; i++){
            boolean found = false;
            int index = search(nums1[i], nums2);
            for(int j = index+1; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    nums1[i] = nums2[j];
                    found = true;
                    break;
                }
            }
             if(!found){
                nums1[i] = -1;
            }
        }
        return nums1;
    }

    public static int search(int val, int[] nums2){
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == val)
            return i;
        }
        return -1;
    }

}
