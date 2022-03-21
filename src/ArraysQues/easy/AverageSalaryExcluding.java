package ArraysQues.easy;

import java.util.Arrays;

public class AverageSalaryExcluding {
    public static void main(String[] args) {
    int[] arr = {4000,3000,1000,2000};
        System.out.println(average(arr));
    }
    public static double average(int[] salary) {
        double ans = 0;
        Arrays.sort(salary);
        for(int i = 1; i < salary.length - 1; i++){
            ans = (ans + salary[i]);
        }
        ans=ans/(salary.length - 2);
        return ans;
    }
}
