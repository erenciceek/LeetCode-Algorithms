import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		System.out.println(sol.isValid("({})]"));
	}
}

class Solution {
	
	public boolean isValid(String s) {
   
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0 ;i<s.length();i++) {
        	
        	if(!stack.isEmpty()) {
        		char last = stack.peek();
        		if(last == '(' && s.charAt(i) == ')' || last == '{' && s.charAt(i) == '}' || last == '[' && s.charAt(i) == ']') {
        			stack.pop();
        			continue;
        		}
        	}
        	stack.push(s.charAt(i));
        	
        }
        if(stack.isEmpty())
        	return true;
        else
        	return false;
        
    }
	
}
