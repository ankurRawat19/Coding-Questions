package General;

public class ProdSumDigitsOfNum {
    public static void main(String[] args) {
        int num = 4421;
        System.out.println(subtractProductAndSum(num));
    }
    public static int subtractProductAndSum(int n) {
    int sum = 0;
    int prod = 1;
    int diff = 0;

    while(n > 0){
        int digit = 0;
        digit = n % 10;
        prod = prod * digit;
        sum = sum + digit;
        n = n/10;
    }
    diff = prod - sum;
    return diff;
    }
}
