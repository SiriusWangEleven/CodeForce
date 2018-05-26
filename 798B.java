import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// String str = st.nextToken();
		// StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int ans = 2500;
		String[] strs = new String[n + 1];
		for (int i = 0; i < n; i++)
			strs[i] = in.next();

		int len = strs[0].length();

		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (j == i)
					continue;
				int t_cnt = countDiff(strs[i], strs[j], len);
				if (t_cnt < 0) {
					cnt = -1;
					break;
				}
				cnt += t_cnt;
			}
			if (cnt == -1) {
				ans = -1;
				break;
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);

	}

	private static int countDiff(String s, String t, int len) {
		int cnt = -1;
		for (int i = 0; i < len; i++) {
			int start = i;
			boolean match = true;
			for (int j = 0; j < len; j++) {
				if (s.charAt(j) != t.charAt((start + j) % len)) {
					match = false;
					break;
				}

			}
			if (match) {
				cnt = start;
				break;
			}
		}
		return cnt;
	}

}