import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();

		int[] nums = {1,1,3,4,5,5,5};
		System.out.println(sol.removeDuplicates(nums));
	}
}

class Solution {

	public int removeDuplicates(int[] nums) {
		
		if (nums.length==0) return 0;
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		int idx = 0;
		for (int i = 0 ; i <nums.length; i++) {
			if (!numList.contains(nums[i])) {
				numList.add(nums[i]);
				nums[idx] = nums[i];
				idx++;
			}
			else
				nums[i] = -1;
		
				
		}
		if (idx < nums.length)
			nums[idx] = -1;

		return numList.size();
	}
	
	
	public int removeDuplicates2(int[] nums) {
		
		if (nums.length==0) return 0;
	    int j=0;
	    
	    for (int i=0; i<nums.length; i++)
	    	
	        if (nums[i]!=nums[j])
	        	nums[++j]=nums[i];
	    
	    return ++j;
	}
}
