import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int[] nums = {1,3,5,7};
		System.out.println(sol.searchInsert(nums, 5));
		
	}
}

class Solution {

	public int searchInsert(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length-1;
		
        while(start <= end){
            int mid = (start+end)/2;
            if (nums[mid] == target) 
            	return mid;
            else if (nums[mid] > target) 
            	end = mid-1;
            else 
            	start = mid+1;
        }
        return start;
   
    }
	
   
	
}
