import java.util.HashSet;
import java.util.Set;

public class Test
{
    public static void main(String[] args) {
        System.out.println(Solution.isHappy(2));
    }
}

class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);

            int result = 0;
            while (n > 0) {
                int digit = n % 10;
                result += digit * digit;
                n /= 10;
            }

            n = result;
        }

        return true;
    }
}
