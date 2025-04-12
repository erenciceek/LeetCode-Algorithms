public class Test {
    public static void main(String[] args) {

        System.out.println(Solution.longestPalindrome("babad"));

    }
}

class Solution {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private static boolean isPalindrome(String str){
        int size = str.length();
        for (int i = 0; i < size/2 ;i++) {
            if(str.charAt(i) != str.charAt(size-1-i))
                return false;

        }
        return true;
    }
}
