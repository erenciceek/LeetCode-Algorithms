public class Test {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {2, 3, 0, 1, 4};
        int[] nums3 = {1, 1, 1, 1};

        System.out.println("Test 1: " + Solution.jump(nums1));
        System.out.println("Test 2: " + Solution.jump(nums2));
        System.out.println("Test 3: " + Solution.jump(nums3));

    }
}


class Solution {
    public static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}