package General;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        int k = sumOfSquares(num);
        System.out.println("ans is : " + k);
        System.out.println("ans is : " + sumOfSquares(k));
        System.out.println("ans is : " + sumOfSquares(68));
        System.out.println("ans is : " + isHappy(18));

//        System.out.println("hi" + sumOfSquares(num));
    }
    public static boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        int res = sumOfSquares(n);
        while (res > 0){
            if(list.contains(res)) return false;
            list.add(res);
            res = sumOfSquares(res);
            System.out.println(res);
            if(res ==1)
                return true;
        }
            return false;
    }

    public static int sumOfSquares(int n){
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum = sum + (temp * temp);
            n /= 10;
        }
        System.out.println(sum);
        return sum;
    }


    public int kapil(int n){
        return 9;
    }

}
