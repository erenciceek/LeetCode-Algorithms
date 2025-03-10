public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.climbStairs(3));

    }
}
// 1 1 1  2 1  1 2       i=0,j=3  i=1,j=1
class Solution {
    public static int climbStairs(int n) {
        long count = 0;
        for (int k = 0; k <= n / 2; k++) {
            int y = n - 2 * k;
            count += combination(k + y, k);
        }
        return (int) count;
    }

    private static long combination(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
