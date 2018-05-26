import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static HashSet<Character> goodLetters;

	public static void main(String[] args) throws IOException {
		String good = in.next();
		goodLetters = new HashSet<Character>();
		for (int i = 0; i < good.length(); i++) {
			goodLetters.add(good.charAt(i));
		}
		String pattern = in.next();
		int patLen = pattern.length();
		int n = in.nextInt();
		while (n-- > 0) {
			String t = in.next();
			int tLen = t.length();
			boolean match = true;
			if (patLen - tLen > 1)
				match = false;
			int j = 0;
			int i = 0;
			while (match && i < patLen && j < tLen) {
				char c1 = pattern.charAt(i);
				char c2 = t.charAt(j);
				if (c1 != '*') {
					match = matchWith(c1, c2);
					i++;
					j++;
				} else {
					if (j + tLen - patLen + 1 < j)
						match = false;
					else {
						String replace = t.substring(j, j + tLen - patLen + 1);
						// System.out.println("sub==" + replace);
						match = allBad(replace);
						i++;
						j += tLen - patLen + 1;
					}

				}

			}
			// System.out.println("i==" + i + " , j==" + j);
			// System.out.println(match);
			if (j < tLen || j == tLen && i < patLen && pattern.charAt(i) != '*')
				match = false;

			if (match)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

	static boolean matchWith(char c1, char c2) {
		if (c1 == c2 || (c1 == '?' && goodLetters.contains(c2)))
			return true;
		return false;
	}

	static boolean allBad(String tmp) {
		for (int i = 0; i < tmp.length(); i++) {
			if (goodLetters.contains(tmp.charAt(i)))
				return false;
		}
		return true;
	}
}