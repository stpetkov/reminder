package tryin;

public class Solution {
	public static String mix(String a, String b) {
		int aL = a.length();
		int bL = b.length();
		int min = Math.min(aL, bL);
		StringBuilder sb = new StringBuilder(aL + bL);
		for (int i = 0; i < min; i++) {
			sb.append(a.charAt(i));
			sb.append(b.charAt(i));
		}
		if (aL > bL) {
			sb.append(a, bL, aL);
		} else if (aL < bL) {
			sb.append(b, aL, bL);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String a = "abcdf";
		String b = "DFGD";
		System.out.println(mix(a, b));
	}
}