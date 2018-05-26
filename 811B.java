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
		int m = Integer.valueOf(st.nextToken());
		int a[] = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++)
			a[i] = Integer.valueOf(st.nextToken());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.valueOf(st.nextToken());
			int r = Integer.valueOf(st.nextToken());
			int x = Integer.valueOf(st.nextToken());
			int cnt = 0;
			for (int j = l; j <= r; j++) {
				if (a[j] < a[x])
					cnt++;
			}
			if (cnt == x - l)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
		}
	}
}