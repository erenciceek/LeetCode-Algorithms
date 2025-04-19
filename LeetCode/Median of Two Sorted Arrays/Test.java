public class Test {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(Solution.findMedianSortedArrays(nums1,nums2));
    }
}


class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int[] arr = new int[n];

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j])
                arr[k++] = nums1[i++];
            else
                arr[k++] = nums2[j++];
        }

        while (i < n1)
            arr[k++] = nums1[i++];
        while (j < n2)
            arr[k++] = nums2[j++];

        if (n % 2 == 0)
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        else
            return arr[n / 2];
    }
}