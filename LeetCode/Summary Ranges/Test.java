import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(Solution.summaryRanges(nums));
    }
}


class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> strList = new ArrayList<>();
        if (nums.length == 0) return strList;

        boolean flag = true;
        int temp = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            if (current == nums[i + 1] - 1) {
                if (flag) {
                    temp = current;
                    flag = false;
                }
            } else if (flag) {
                strList.add(String.valueOf(current));
            } else {
                String str = temp + "->" + current;
                strList.add(str);
                flag = true;
            }
        }

        int last = nums[nums.length - 1];
        if (flag) {
            strList.add(String.valueOf(last));
        } else {
            String str = temp + "->" + last;
            strList.add(str);
        }

        return strList;
    }
}