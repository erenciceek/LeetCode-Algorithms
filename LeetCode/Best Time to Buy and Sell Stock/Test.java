public class Test {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(Solution.maxProfit(arr));

    }
}

class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(minPrice > price){
                minPrice = price;
            }
            if(maxProfit < price - minPrice){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
