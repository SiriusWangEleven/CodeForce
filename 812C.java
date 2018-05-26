import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	static int ansIndex;
	static long ans;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		long s = Long.valueOf(st.nextToken());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			a[i] = Integer.valueOf(st.nextToken());

		int l = 0, r = n;
		long sum = 0;
		while (l <= r) {

			int mid = (l + r) / 2;
			sum = count(a, mid, n, s);
			//System.out.println(mid + " " + sum);
			if (sum > s) {
				r = mid - 1;
			} else {
				ansIndex = mid;
				ans = sum;
				l = mid + 1;
			}
			// System.out.println("l==" + l + ", r==" + r);
		}

		System.out.println(ansIndex + " " + ans);
	}

	private static long count(int a[], int k, int n, long s) {
		long sum = 0;
		if (k == 0)
			return 0;
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i] * 1L + 1L * (i + 1) * k;
		}
		Arrays.sort(b);

		for (int i = 0; i < k; i++) {
			sum += b[i];
			if (sum > s)
				break;
		}

		return sum;
	}

}