package pattern;

public class FirstUniuqCharString {

	public static int firstUniqChar(String s) {
		int ar[] = new int[26];
		char[] c = s.toCharArray();
		for (char ccs : c) {
			ar[ccs - 'a']++;

		}
		for (int i = 0; i < c.length; i++) {
			if (ar[c[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		String value = "atestonea";
		System.out.println(firstUniqChar(value));
	}

}
