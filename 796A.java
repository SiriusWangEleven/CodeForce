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
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] a = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		int l = m, r = m;
		while (l > 1) {
			l--;
			if (a[l] != 0 && a[l] <= k)
				break;
		}
		while (r < n) {
			r++;
			if (a[r] != 0 && a[r] <= k)
				break;
		}
		int disL = -1, disR = -1;
		if (l == m || a[l] > k || a[l] == 0)
			disL = 100;
		else {
			disL = m - l;
		}
		if (r == m || a[r] > k || a[r] == 0)
			disR = 100;
		else {
			disR = r - m;
		}

		System.out.println(Math.min(disL, disR) * 10);

	}

}