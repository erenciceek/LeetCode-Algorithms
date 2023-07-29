
public class Test {

	public static void main(String[] args) {
		
		int[] nums = {3,3,4};		
		int[] result = twoSum(nums,7);
		System.out.println (result[0] + " , " + result[1]);

	}
	
	// TWO SUM --> 32 ms : Beats 54.35%of users with Java , 43.46 mb Beats 95.77%of users with Java
	public static int[] twoSum(int[] nums, int target) {
        
		int[] result = new int[2];
		boolean flag = false;
		
		for (int i = 0;i < nums.length; i++) {
			int first_num = nums[i];
			for (int j = i+1 ; j < nums.length ; j++) {
				if ((first_num + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
		if(!flag)
			System.out.println("Two numbers whose sum equals the target were not found!");
		return result;
    }
	

}




