public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] strs = {"flower","flew","flight"};
		
		System.out.println(sol.longestCommonPrefix2(strs));
	}
}

class Solution {
	
	// runtime 8ms , memory 41.30mb
	public String longestCommonPrefix(String[] strs) {		
		if(strs.length == 0)		return "";
	
		int minLength = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++){
			minLength = Math.min(minLength, strs[i].length());
		}
		
		String result = "";
		for (int i = 0 ; i < minLength ; i++) {
			char temp_letter = strs[0].charAt(i);
			
			for (int j = 1;j < strs.length; j++) {
				if(strs[j].charAt(i) != temp_letter) {
					return result;
				}
			}
			result += temp_letter;		
		}
	
		return result;
    }
	
	// runtime -ms , memory 40.40mb 
	public String longestCommonPrefix2(String[] strs) {		
		if(strs.length == 0)		return "";
	
		String temp = strs[0];
		for (int i = 1 ; i<strs.length;i++) {
			while(strs[i].indexOf(temp)!= 0) 
				temp = temp.substring(0,temp.length()-1);
		}
		return temp;
		
    }
	
	
}
