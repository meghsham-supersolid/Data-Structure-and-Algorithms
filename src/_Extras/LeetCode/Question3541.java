package _Extras.LeetCode;

public class Question3541 {
    public static void main(String[] args) {

        System.out.println(-105 % 10);
//        System.out.println("Min int: " + Integer.MIN_VALUE);
//        System.out.println("Max int: " + Integer.MAX_VALUE);
//
//        int num = 1056389759;
//
//        if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
//            System.out.println("In-Range");
//        } else {
//            System.out.println("Out-Of-Range");
//        }
        Solution3541 sol = new Solution3541();
//        System.out.println("=>" + sol.maxFreqSum("successes"));
    }
}

class Solution3541 {
    public int maxFreqSum(String s) {
        int maxVowel = 0;
        int maxConsonant = 0;

        int[] letter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letter[(s.charAt(i) - 'a')]++;

            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    if (letter[(s.charAt(i) - 'a')] > maxVowel) {
                        maxVowel = letter[(s.charAt(i) - 'a')];
                    }
                    break;
                default:
                    if (letter[(s.charAt(i) - 'a')] > maxConsonant) {
                        maxConsonant = letter[(s.charAt(i) - 'a')];
                    }
            }
        }
        return maxConsonant + maxVowel;
    }
}