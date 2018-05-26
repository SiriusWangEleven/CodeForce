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

		int n = in.nextInt();
		int a[] = new int[55];
		int sum[] = new int[55];
		int dp[] = new int[55];
		for (int i = 1; i <= n; i++)
			a[i] = in.nextInt();

		Arrays.fill(sum, 0);
		Arrays.fill(dp, 0);

		for (int i = n; i >= 1; i--) {
			sum[i] = sum[i + 1] + a[i];
			dp[i] = Math.max(dp[i + 1], sum[i + 1] - dp[i + 1] + a[i]);
		}
		System.out.println((sum[1] - dp[1]) + " " + dp[1]);

	}
}