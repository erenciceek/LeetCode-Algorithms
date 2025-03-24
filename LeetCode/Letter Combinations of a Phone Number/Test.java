
import java.util.HashMap;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> result = Solution.letterCombinations("23");
        System.out.println(result);
    }
}


class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        HashMap<Character, String> digitToChar = new HashMap<>();
        digitToChar.put('2', "abc");
        digitToChar.put('3', "def");
        digitToChar.put('4', "ghi");
        digitToChar.put('5', "jkl");
        digitToChar.put('6', "mno");
        digitToChar.put('7', "pqrs");
        digitToChar.put('8', "tuv");
        digitToChar.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToChar);
        return res;
    }

    private static void backtrack(String digits, int index, StringBuilder curStr, List<String> res, HashMap<Character, String> digitToChar) {
        if (index == digits.length()) {
            res.add(curStr.toString());
            return;
        }

        String possibleChars = digitToChar.get(digits.charAt(index));
        for (char c : possibleChars.toCharArray()) {
            curStr.append(c);
            backtrack(digits, index + 1, curStr, res, digitToChar);
            curStr.deleteCharAt(curStr.length() - 1);
        }
    }
}