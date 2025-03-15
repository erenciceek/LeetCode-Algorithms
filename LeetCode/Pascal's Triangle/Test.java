import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = Solution.generate(numRows);
        System.out.println(triangle);

    }
}
// 1 | 1 1 | 1 2 1 | 1 3 3 1 | 1 4 6 4 1 | 1 5 10 10 5 1

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
}