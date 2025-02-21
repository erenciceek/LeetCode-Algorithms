import java.util.Arrays;
public class Test {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int[] expectedNums = {0, 1,4,0, 3};

        int k = Solution.removeElement(nums, val);
        assert k == expectedNums.length : "Uzunluklar eşleşmiyor!";

        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums);

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] :
                    "Elemanlar eşleşmiyor. nums[" + i + "] = " + nums[i] +
                            ", expectedNums[" + i + "] = " + expectedNums[i];
        }
        System.out.println("Test passed!");
    }


}

class Solution {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}