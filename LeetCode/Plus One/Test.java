import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numArr = new int[]{9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(Solution.plusOne(numArr)));


    }
}


class Solution {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = sum;
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }
            return newDigits;
        }

        return digits;
    }
}