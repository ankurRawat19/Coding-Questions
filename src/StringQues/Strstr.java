package StringQues;

import java.util.Locale;

public class Strstr {
    public static void main(String[] args) {
        String hayStack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(hayStack,needle));
    }

    public static int strStr(String haystack, String needle){
        char[] hayArr = haystack.toCharArray();
        char[] needArr = needle.toCharArray();
        if(hayArr.length == 0){
            return -1;
        }
        if (needArr.length == 0){
            return 0;
        }
        for(int i = 0 ; i < hayArr.length - needArr.length; i++){
            if(hayArr[i] == needArr[0]){
                if(comapare(hayArr,needArr,i,i+needArr.length - 1)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean comapare(char[] arr1, char[] arr2, int start, int end){
        for (int i = 0 ; i <= (arr1.length - arr2.length) ; i++){
            int count = 0;
            for (int j = 0 ; j < arr2.length ;j++){
                if(arr2[j] == arr1[j+i]){
                    count++;
                }
            }
            if (count == arr2.length){
                return true;
            }
        }
        return false;
    }


//    public static int strStr(String haystack, String needle) {
//        int ans = 0;
//        if(needle == null){
//            return 0;
//        }
//        if(haystack.contains(needle)){
//             ans = haystack.indexOf(needle);
//            return ans;
//        }else
//            return -1;
//    }
}
