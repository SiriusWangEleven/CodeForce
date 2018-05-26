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
		int r = Integer.valueOf(st.nextToken());
		int d = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int ans = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			int rSau = Integer.valueOf(st.nextToken());
			int ls = r - d + rSau;
			ls = ls * ls;
			int rs = r - rSau;
			rs = rs * rs;
			int dis = x * x + y * y;
			if (dis >= ls && dis <= rs)
				ans++;

		}
		System.out.println(ans);
	}
}