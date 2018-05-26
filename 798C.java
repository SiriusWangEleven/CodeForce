import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		int a[] = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		int now = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
			now = gcd(Math.max(now, a[i]), Math.min(now, a[i]));
		}
		System.out.println("YES");
		if (now > 1) {
			System.out.println(0);
			return;
		}
		int cnt = 0;
		for (int i = 1; i <= n - 2; i++) {
			if (a[i] % 2 == 0)
				continue;
			while (a[i] % 2 != 0) {
				int t1 = a[i];
				int t2 = a[i + 1];
				a[i] = t1 - t2;
				a[i + 1] = t1 + t2;
				cnt++;
			}
		}
		// System.out.println("cnt==" + cnt);
		while (!(a[n - 1] % 2 == 0 && a[n] % 2 == 0)) {
			int t1 = a[n - 1];
			int t2 = a[n];
			a[n - 1] = t1 - t2;
			a[n] = t1 + t2;
			// System.out.println(a[n - 1] + " " + a[n]);
			cnt++;
		}
		System.out.println(cnt);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else {
			return gcd(b, a % b);
		}
	}
}