import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();

		String a = "11";
		String b = "1";
		System.out.println(sol.addBinary2(a, b));
	}
}

class Solution {

	// with bitwise operators
	public String addBinary2(String a, String b) {
		int carry = 0;
		int i = a.length() - 1, j = b.length() - 1;
		StringBuilder sum = new StringBuilder();

		while (i >= 0 || j >= 0) {
			int ak = i < 0 ? 0 : (a.charAt(i--) - '0');
			int bk = j < 0 ? 0 : (b.charAt(j--) - '0');
			int carryOut = (ak & bk) | (ak & carry) | (bk & carry);
			sum.append((ak ^ bk ^ carry));
			carry = carryOut;
		}
		return carry == 1 ? sum.append(carry).reverse().toString() : sum.reverse().toString();
	}

	// without bitwise operators, not efficient
	public String addBinary(String a, String b) {
		ArrayList<Character> result = new ArrayList<Character>();
		int max = (a.length() > b.length()) ? a.length() : b.length();
		boolean carry = false;
		for (int i = 0; i < max; i++) {
			if (i < a.length() && i < b.length()) {
				if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '1') {
					if (carry)
						result.add('1');
					else
						result.add('0');

					carry = true;
				} else if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '0'
						|| a.charAt(a.length() - 1 - i) == '0' && b.charAt(b.length() - 1 - i) == '1') {
					if (!carry)
						result.add('1');
					else {
						result.add('0');
					}
				} else {
					if (carry) {
						result.add('1');
						carry = false;
					} else {
						result.add('0');
					}
				}
			}

			if (i >= b.length()) {
				if (carry) {
					if (a.charAt(a.length() - 1 - i) == '1')
						result.add('0');
					else {
						result.add('1');
						carry = false;
					}
				} else {
					result.add(a.charAt(a.length() - 1 - i));
				}
			} else if (i >= a.length()) {
				if (carry) {
					if (b.charAt(b.length() - 1 - i) == '1')
						result.add('0');
					else {
						result.add('1');
						carry = false;
					}
				} else {
					result.add(b.charAt(b.length() - 1 - i));
				}
			}

		}
		if (carry)
			result.add('1');
		String res = "";
		int size = result.size();
		for (int x = 0; x < size; x++) {
			res += result.get(size - 1 - x);
		}
		return res;
	}

}
