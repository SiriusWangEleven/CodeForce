import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws IOException {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		String s = in.next();
		String t = in.next();
		String sample = in.next();
		StringBuffer ans = new StringBuffer();
		boolean cap = true;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, i);
		}
		// System.out.println(map);
		for (int i = 0; i < sample.length(); i++) {
			char c = sample.charAt(i);
			if (Character.isDigit(c)) {
				ans.append(c);
				continue;
			}
			cap = Character.isUpperCase(c);
			c = Character.toLowerCase(c);

			int id = map.get(c);

			// System.out.println(id);
			char ans_c = t.charAt(id);
			if (cap)
				ans_c = Character.toUpperCase(ans_c);
			ans.append(ans_c);
		}
		System.out.println(ans);
	}
}