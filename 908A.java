import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static LinkedList<LinkedList<Integer>> list;
	static int ans = 0;

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();

		int ans = 0;
		String vowel = "aeiou";
		String odd = "13579";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (vowel.indexOf(c) >= 0 || odd.indexOf(c) >= 0)
				ans++;
		}
		System.out.println(ans);

	}
}