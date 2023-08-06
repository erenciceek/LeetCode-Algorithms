import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(sol.strStr(haystack, needle));
	}
}

class Solution {
	
	// runtime : - ms ,memory : 40.72mb
	public int strStr(String haystack, String needle) {
	
		if (!haystack.contains(needle))
			return -1; 
		
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {    
        	if (haystack.charAt(i) == needle.charAt(0)) {
        		boolean flag = true;
        		for (int x = 1; x < needle.length() ; x++) {
        			if (haystack.charAt(i+x) != needle.charAt(x)) {
        				flag = false;
        				break;
        			} 			
        		}
        		if(flag)
        			return i;      		
        	}      	
        }		
		return -1;
    }

}
