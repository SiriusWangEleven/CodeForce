import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt2 = 0;
		int cnt5 = 0;
		int n = in.nextInt();
		int k = in.nextInt();
		int ori = n;

		while (true) {
			if (n % 2 == 0) {
				cnt2++;
				n /= 2;
			} else
				break;
		}
		while (true) {
			if (n % 5 == 0) {
				cnt5++;
				n /= 5;
			} else
				break;
		}
		StringBuilder sb = new StringBuilder();
		if (cnt2 + cnt5 == 0) {
			sb.append(n);
			for (int i = 0; i < k; i++)
				sb.append(0);
		} else if (Math.min(cnt2, cnt5) >= k) {
			sb.append(ori);
		} else {
			long ans = ori;
			int tail0 = Math.min(cnt2, cnt5);
			if (cnt2 >= cnt5) {
				for (int i = 0; i < cnt2 - cnt5; i++) {
					ans = ans * 5;
					tail0++;
					if (tail0 >= k)
						break;
				}
			} else {
				for (int i = 0; i < cnt5 - cnt2; i++) {
					ans = ans * 2;
					tail0++;
					if (tail0 >= k)
						break;
				}
			}
			sb.append(ans);

			if (tail0 < k) {
				for (int i = 0; i < k - tail0; i++) {
					sb.append(0);
				}
			}
		}
		System.out.println(sb);
	}
}