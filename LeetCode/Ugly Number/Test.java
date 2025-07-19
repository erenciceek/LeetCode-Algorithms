public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.isUgly(6));
    }
}

class Solution {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0)
            n /= 2;

        while (n % 3 == 0)
            n /= 3;

        while (n % 5 == 0)
            n /= 5;

        return n == 1;
    }

    public boolean isPrime(int x){
        if (x % 2 == 0)
            return x == 2 ? true : false;

        for (int i=3 ; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}