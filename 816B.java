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
		int k = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		int p[] = new int[200005];
		int c[] = new int[200005];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			p[a]++;
			p[b + 1]--;
		}
		for (int i = 1; i < 200003; i++) {
			p[i] += p[i - 1];
			c[i] = c[i - 1];
			if (p[i] >= k)
				c[i]++;
		}
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			System.out.println(c[r] - c[l - 1]);
		}

	}
}