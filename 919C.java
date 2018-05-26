import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		boolean[][] map = new boolean[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == '.')
					map[i][j + 1] = true;
			}
		}
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			ans += cal_row(i, m, k, map);
		}
		for (int j = 1; j <= m; j++) {
			ans += cal_col(j, n, k, map);
		}
		if (k == 1)
			ans /= 2;
		System.out.println(ans);
	}

	private static int cal_col(int j, int n, int k, boolean[][] map) {
		// TODO Auto-generated method stub
		int ans = 0;
		int i = 1;
		while (i <= n) {
			if (map[i][j]) {
				int t = -1;
				for (t = i; t <= n; t++) {
					if (!map[t][j])
						break;
				}
				int len = t - i;
				if (len >= k)
					ans += len - k + 1;
				i = t;
			} else {
				i++;
			}
		}
		return ans;
	}

	private static int cal_row(int i, int m, int k, boolean map[][]) {
		// TODO Auto-generated method stub
		int ans = 0;
		int j = 1;
		while (j <= m) {
			if (map[i][j]) {
				int t = -1;
				for (t = j; t <= m; t++) {
					if (!map[i][t])
						break;
				}
				int len = t - j;
				if (len >= k)
					ans += len - k + 1;
				j = t;
			} else {
				j++;
			}
		}
		return ans;
	}
}