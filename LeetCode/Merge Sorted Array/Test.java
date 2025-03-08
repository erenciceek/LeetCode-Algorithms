import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));

        // Example 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        solution.merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Merged array: " + Arrays.toString(nums1_2));


        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        solution.merge(nums1_3, m3, nums2_3, n3);
        System.out.println("Merged array: " + Arrays.toString(nums1_3));

        int[] nums1_4 = {4, 5, 6, 0, 0, 0};
        int m4 = 3;
        int[] nums2_4 = {1, 2, 3};
        int n4 = 3;
        solution.merge(nums1_4, m4, nums2_4, n4);
        System.out.println("Merged array: " + Arrays.toString(nums1_4));
    }
}
