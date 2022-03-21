package ArraysQues.easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1,0,3,1,12};
        moveZeroes(arr);
    }

    private static void moveZeroes(int[] nums) {
        int j = 0;
        //Initializing 2 pointers one to check non zero element
        // and other to inject that non zero element to the array where 0 is
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (j != i)
                    nums[i] = 0;//making all other loations as 0 in array
                j++;
            }
        }
    }
}
