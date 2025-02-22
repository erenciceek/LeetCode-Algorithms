public class Test {
    public static void main(String[] args) {
        String str = "Hello World   ";
        System.out.println(Solution.lengthOfLastWord(str));

    }
}



class Solution {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}