import java.util.*;


public class Test {
    public static void main(String[] args) {
        int[] numbers = {4,3,2,7,8,2,3,1};
        System.out.println(Solution.findDisappearedNumbers(numbers));
    }
}

class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer>seen = new HashSet<>();
        List<Integer>result= new ArrayList<>();
        for(int num : nums){
            seen.add(num);
        }
        for(int i=1; i<=nums.length; i++){
            if(!seen.contains(i)){
                result.add(i);
            }
        }
        return result;

    }
}
