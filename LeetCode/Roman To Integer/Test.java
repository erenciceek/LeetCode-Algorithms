import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		System.out.println(sol.romanToInt("III"));

	}
}

class Solution {
	// 5 ms Beats 62.59%of users with Java -- 43.78 mb Beats 64.37%of users with  Java
	public int romanToInt(String s) {

		if (s == null || s.length() == 0)
			return -1;

		int sum = 0;

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");

		int length = s.length();
		for (int i = 0; i < length; i++) {
			sum += map.get(s.charAt(i));
		}

		return sum;
	}

	// 4 ms Beats 94.91%of users with Java --- 43.73mb Beats 64.37%of users with  Java
	public int romanToInt2(String s) {

		if (s == null || s.length() == 0)
			return -1;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int len = s.length();
		int result = map.get(s.charAt(len - 1));

		for (int i = 0; i <= len - 2; i++) {
			int value = map.get(s.charAt(i));
			int nextVal = map.get(s.charAt(i + 1));

			if (value >= nextVal) {
				result += value;
			} else {
				result -= value;
			}
		}
		return result;
	}
}
