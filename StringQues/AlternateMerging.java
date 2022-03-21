package StringQues;

import java.util.Arrays;

public class AlternateMerging {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqr";
        System.out.println(mergeAlternately(str1,str2));

    }
    public static String mergeAlternately(String word1, String word2) {
        char[] c = new char[word1.length() + word2.length()];
        int i = word1.length() - 1, j = word2.length() - 1, k = c.length - 1;
        //add extra chars of word1 at the end
        while (i > j) {
            c[k--] = word1.charAt(i--);
        }
        //add extra chars of word2 at the end

        while (j > i) {
            c[k--] = word2.charAt(j--);
        }
        // remaining character counts are equal . so  keep adding alternatively starting wuth chars from word2.
        while (i >= 0) {
            c[k--] = word2.charAt(i);
            c[k--] = word1.charAt(i--);

        }

        return new String(c);
    }
}
