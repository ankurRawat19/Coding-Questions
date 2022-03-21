package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleSwapString {
    public static void main(String[] args) {
        String str = "bank";
        String str2 = "kanb";
        System.out.println(areAlmostEqual(str,str2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
       if(s1.equals(s2)){
           return true;
       }
        List<Integer> list = new ArrayList<>();
       for(int i = 0 ; i < s1.length(); i++){
           if(s1.charAt(i) != s2.charAt(i)){
               list.add(i);
           }
           if(list.size() > 2){
               return false;
           }
       }
       if (list.size() == 2){
           if(s1.charAt(list.get(0)) == s2.charAt(list.get(1)) && s1.charAt(list.get(1)) == s2.charAt(list.get(0))){
               return true;
           }else
               return false;
       }
        return false;
    }
}
