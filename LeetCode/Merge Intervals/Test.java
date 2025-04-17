import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        intervals = Solution.merge(intervals);
        for(int i = 0; i<intervals.length; i++) {
            for (int j = 0; j< intervals[i].length;j++) {
                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }
}


