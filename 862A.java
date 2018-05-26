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
		int k = in.nextInt();
		boolean[] set = new boolean[105];
		Arrays.fill(set, false);
		for (int i = 0; i < n; i++) {
			int temp = in.nextInt();
			set[temp] = true;
		}
		int ans = 0;
		if (set[k])
			ans++;
		for (int i = 0; i < k; i++)
			if (!set[i])
				ans++;

		System.out.println(ans);
	}
}