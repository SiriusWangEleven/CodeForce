import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// int n = Integer.valueOf(st.nextToken());
		String str1 = in.next();
		String str2 = new StringBuilder(str1).reverse().toString();
		int len = str1.length();
		int dp1[] = new int[len + 5];
		int dp2[] = new int[len + 5];
		fun(dp1, str1);
		fun(dp2, str2);
		// System.out.println(Arrays.toString(dp1));
		// System.out.println(Arrays.toString(dp2));

		int max = 0;
		for (int i = 0; i < len; i++) {
			max = Math.max(max, dp1[i] + dp2[len - 1 - i] - 1);
		}
		System.out.println(max);
	}

	public static void fun(int dp[], String str) {
		Arrays.fill(dp, 1);
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) >= str.charAt(j))
					dp[i] = Math.max(dp[j] + 1, dp[i]);
			}
		}
	}
}