import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        int arr[] = Solution.buildArray(nums);
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

class Solution {
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            arr[i] = nums[nums[i]];
        }

        return arr;
    }

}
