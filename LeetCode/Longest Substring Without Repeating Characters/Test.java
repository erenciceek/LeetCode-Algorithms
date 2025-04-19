import java.util.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(Solution.lengthOfLongestSubstring("pwwkew"));
    }
}

class Solution {
    public static int lengthOfLongestSubstring(String s) {

        int size = s.length();
        if (size < 2){
            return size;
        }
        int max = 0;

        for (int i = 0; i < size; i++) {
            Set<Character> seen = new HashSet<>();
            int j = i;
            while (j < size && !seen.contains(s.charAt(j))) {
                seen.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, j - i);

            if (size - i <= max) break;
        }
        return max;
    }
}