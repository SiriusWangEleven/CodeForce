import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int a[] = new int[n + 1];

		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
			if (a[i] == 1)
				cnt++;
		}

		if (cnt > 0) {
			System.out.println(n - cnt);
			return;
		}

		for (int i = 1; i <= n - 1; i++) {
			int mmax = Math.max(a[i], a[i + 1]);
			int mmin = Math.min(a[i], a[i + 1]);
			if (mmax == mmin)
				continue;
			if (1 == gcd(mmax, mmin)) {
				System.out.println(n);
				return;
			}
		}

		int minLen = Integer.MAX_VALUE;

		for (int i = n - 1; i >= 1; i--) {
			int tmp = a[i];
			int cntOp = 0;
			for (int j = i; j <= n; j++) {
				if (a[j] == a[i])
					continue;
				int mmax = Math.max(tmp, a[j]);
				int mmin = Math.min(tmp, a[j]);
				int gmod = gcd(mmax, mmin);
				// System.out.println("gmod==" + gmod);
				if (gmod == a[j])
					continue;
				cntOp++;
				tmp = gmod;
				if (gmod == 1) {
					minLen = Math.min(minLen, cntOp);
					break;
				}
			}
		}

		if (minLen == Integer.MAX_VALUE)
			System.out.println(-1);
		else {
			System.out.println(minLen + n - 1);
		}

	}

	static public int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}