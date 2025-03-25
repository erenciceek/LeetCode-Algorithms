public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.reverse(-123));
    }
}


class Solution {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        String numStr = String.valueOf(Math.abs(x));
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        try {
            int reversed = Integer.parseInt(reversedStr);
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}