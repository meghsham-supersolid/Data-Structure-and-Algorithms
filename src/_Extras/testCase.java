package _Extras;

import java.util.Arrays;

public class testCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] charArray1 = (s1 + s2).toCharArray();
        char[] charArray2 = s3.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(charArray1);
        System.out.println(charArray2);


        if (charArray1.length == charArray2.length) {
            for (int i = 0; i < charArray1.length; i++) {
                boolean found = false;
                for (int j = 0; j < charArray2.length; j++) {
                    if (charArray1[i] == charArray2[j]) {
                        found = true;
                        charArray2[j] = '#';
                        break;
                    }
                }
                if (!found)
                    return false;
            }
            return true;
        }
        return false;
    }

}