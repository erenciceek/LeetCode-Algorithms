import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		System.out.println(sol.isPalindrome(5553555));

	}
}

class Solution {
	
	
	public boolean isPalindrome(int x) {
        String num  = Integer.toString(x);
        int size = num.length();
        for (int i = 0; i < size/2 ;i++) {
        	if(num.charAt(i) != num.charAt(size-1-i))
        			return false;
        		
        }
        return true;
    }
	

   
	
}
