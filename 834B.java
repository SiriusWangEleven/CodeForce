import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		int k = in.nextInt();
		String str = in.next();
		int lastId[] = new int[26];
		boolean used[] = new boolean[26];
		Arrays.fill(lastId, -1);
		Arrays.fill(used, false);

		for (int i = 0; i < n; i++) {
			lastId[str.charAt(i) - 'A'] = i;
		}
		// System.out.println(Arrays.toString(lastId));
		boolean ok = true;

		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (!used[c - 'A']) {
				used[c - 'A'] = true;
				k--;
			}

			if (k < 0) {
				ok = false;
				break;
			}

			if (lastId[c - 'A'] == i)
				k++;

		}
		if (!ok)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}
	}

}