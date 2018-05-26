import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int permu[] = new int[4];
	static boolean vis[] = new boolean[4];
	static int x[] = { 0, 0, 1, -1 };
	static int y[] = { 1, -1, 0, 0 };
	static int n, m;
	static int sx, sy;
	static int[][] map = new int[60][60];
	static String cmd = "";
	static int ans = 0;

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		Arrays.fill(vis, false);
		input();
		ans = 0;
		dfs(0);
		System.out.println(ans);
	}

	public static void input() {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[i], -1);
			String str = in.next();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == '.')
					map[i][j] = 0;
				if (str.charAt(j) == 'S') {
					map[i][j] = 1;
					sx = i;
					sy = j;
				}
				if (str.charAt(j) == 'E')
					map[i][j] = 2;
			}
		}
		cmd = in.next();
		in.close();

	}

	public static void dfs(int now) {
		if (now == 4) {
			// System.out.println(Arrays.toString(permu));
			if (check())
				ans++;
			// System.out.println();
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (!vis[i]) {
				vis[i] = true;
				permu[now] = i;
				dfs(now + 1);
				vis[i] = false;
			}
		}
	}

	public static boolean check() {

		int tmpX = sx;
		int tmpY = sy;
		for (int i = 0; i < cmd.length(); i++) {
			char c = cmd.charAt(i);
			int index = (int) (c - '0');
			index = permu[index];
			// System.out.println("index==" + index);
			tmpX += x[index];
			tmpY += y[index];
			if (tmpX < 0 || tmpX >= n || tmpY < 0 || tmpY >= m)
				return false;
			if (map[tmpX][tmpY] == -1)
				return false;
			if (map[tmpX][tmpY] == 2)
				return true;
		}
		return false;
	}
}