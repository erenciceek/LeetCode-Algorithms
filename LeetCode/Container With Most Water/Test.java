public class Test {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(Solution.maxArea(height));
    }
}


class Solution {
    public static int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        int max_area = 0;

        while (start < end){
            int current_area = Math.min(height[start],height[end]) * (end - start);
            if (current_area > max_area)
                max_area = current_area;

            if (height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }

        return max_area;
    }
}