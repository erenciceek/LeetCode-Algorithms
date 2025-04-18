import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(Solution.combinationSum(candidates,target));
    }
}

class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(result, current, candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            int candidate = candidates[i];
            if (candidate > target) continue;

            current.add(candidate);
            backtrack(result, current, candidates, target - candidate, i);
            current.remove(current.size() - 1);
        }
    }
}
