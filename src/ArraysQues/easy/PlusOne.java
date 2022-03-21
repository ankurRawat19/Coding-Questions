package ArraysQues.easy;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
//        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i =len-1; i>=0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] res = new int[len+1];
        res[0] = 1;
//        for(int i=1; i<=len; i++){
//            res[i] = 0;
//        }
        return res;
    }
}
