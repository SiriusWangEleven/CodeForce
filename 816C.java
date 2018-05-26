import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);
	static int X = 0, Y = 0, minNum = 501;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int grid[][] = new int[n + 1][m + 1];
		boolean hasZeroR[] = new boolean[n + 1];
		boolean hasZeroC[] = new boolean[m + 1];
		int minR[] = new int[n + 1];
		int minC[] = new int[m + 1];
		Arrays.fill(hasZeroC, false);
		Arrays.fill(hasZeroR, false);
		Arrays.fill(minC, 0);
		Arrays.fill(minR, 0);

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
				if (grid[i][j] == 0) {
					hasZeroC[j] = hasZeroR[i] = true;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			minR[i] = 501;
			for (int j = 1; j <= m; j++) {
				minR[i] = Math.min(minR[i], grid[i][j]);
			}
			// System.out.println("min row " + i +" : " + minR[i]);
		}
		for (int j = 1; j <= m; j++) {
			minC[j] = 501;
			for (int i = 1; i <= n; i++) {
				minC[j] = Math.min(minC[j], grid[i][j]);
			}
			// System.out.println("min col " + j +" : " + minC[j]);
		}
		StringBuffer ans = new StringBuffer();
		int moves = 0;
		if (n <= m) {
			for (int i = 1; i <= n; i++) {
				if (hasZeroR[i])
					continue;

				for (int k = 0; k < minR[i]; k++) {
					ans.append("row " + i + "\n");
					moves++;
				}

				for (int j = 1; j <= m; j++) {
					grid[i][j] -= minR[i];
					minC[j] = Math.min(minC[j], grid[i][j]);
					if (minC[j] == 0)
						hasZeroC[j] = true;
				}

			}

			for (int j = 1; j <= m; j++) {
				if (hasZeroC[j])
					continue;

				for (int k = 0; k < minC[j]; k++) {
					ans.append("col " + j + "\n");
					moves++;
				}
				for (int i = 1; i <= n; i++) {
					grid[i][j] -= minC[j];
					minR[i] = Math.min(minR[i], grid[i][j]);
				}

			}
		} else {
			for (int j = 1; j <= m; j++) {
				if (hasZeroC[j])
					continue;

				for (int k = 0; k < minC[j]; k++) {
					ans.append("col " + j + "\n");
					moves++;
				}
				for (int i = 1; i <= n; i++) {
					grid[i][j] -= minC[j];
					minR[i] = Math.min(minR[i], grid[i][j]);
				}

			}
			for (int i = 1; i <= n; i++) {
				if (hasZeroR[i])
					continue;

				for (int k = 0; k < minR[i]; k++) {
					ans.append("row " + i + "\n");
					moves++;
				}

				for (int j = 1; j <= m; j++) {
					grid[i][j] -= minR[i];
					minC[j] = Math.min(minC[j], grid[i][j]);
					if (minC[j] == 0)
						hasZeroC[j] = true;
				}

			}
		}

		boolean fail = false;

		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++)
				if (grid[i][j] > 0) {
					fail = true;
					break;
				}
		if (fail) {
			System.out.println(-1);
			return;
		}
		System.out.println(moves);
		System.out.println(ans);
	}
}