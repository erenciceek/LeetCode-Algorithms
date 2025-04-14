import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + Solution.containsDuplicate(nums1)); // true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + Solution.containsDuplicate(nums2)); // false

        int[] nums3 = {};
        System.out.println("Test 3: " + Solution.containsDuplicate(nums3)); // false
    }
}


class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}