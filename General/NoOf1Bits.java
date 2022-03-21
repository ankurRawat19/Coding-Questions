package General;

public class NoOf1Bits {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(hammingWeight1(n));
    }
    public static int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static int hammingWeight1(int n){
        String s = Integer.toBinaryString(n);
        int count = 0 ;
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == '0'){
            count++;
            }
        }
        return count;
    }
}
