

public class Test {
    public static void main(String[] args) {
        int[] numbers = {3,0,1};
        System.out.println(Solution.missingNumber(numbers));
    }
}

class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
