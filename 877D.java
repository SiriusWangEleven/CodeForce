import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// static final double EPS = 1e-7;
	static class Node {
		int x, y, step;

		public Node(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}

		public String toString() {
			return "Current Node:(x==" + this.x + ", y==" + this.y + ", dis=="
					+ this.step + ")";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		boolean[][] board = new boolean[n + 1][m + 1];
		int dis[][] = new int[n + 1][];
		boolean vis[][] = new boolean[n + 1][];
		for (int i = 1; i <= n; i++) {
			dis[i] = new int[m + 1];
			vis[i] = new boolean[m + 1];
			for (int j = 1; j <= m; j++) {
				dis[i][j] = Integer.MAX_VALUE;
				vis[i][j] = false;
			}
		}
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++)
				if (str.charAt(j) == '.')
					board[i][j + 1] = true;
		}

		// System.out.println(map[1].charAt(4));

		int dirx[] = { 0, 0, 1, -1 };
		int diry[] = { 1, -1, 0, 0 };

		int x1, x2, y1, y2;
		st = new StringTokenizer(br.readLine());
		x1 = Integer.valueOf(st.nextToken());
		y1 = Integer.valueOf(st.nextToken());
		x2 = Integer.valueOf(st.nextToken());
		y2 = Integer.valueOf(st.nextToken());

		Queue<Node> que = new LinkedList<>();
		dis[x1][y1] = 0;
		que.offer(new Node(x1, y1, 0));

		while (!que.isEmpty()) {
			Node now = que.poll();
			// System.out.println(now);
			int x = now.x;
			int y = now.y;
			int step = now.step;
			vis[x][y] = true;

			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= k; j++) {
					int tmpX = x + dirx[i] * j;
					int tmpY = y + diry[i] * j;
					int tmpStep = step + 1;
					// System.out.println(map[tmpX].charAt(tmpY));
					if (tmpX > n || tmpX < 1 || tmpY > m || tmpY < 1
							|| board[tmpX][tmpY] == false
							|| tmpStep > dis[tmpX][tmpY] || vis[tmpX][tmpY])
						break;
					// System.out.println("X==" + tmpX + ", Y==" + tmpY
					// + ", Step==" + tmpStep);
					if (!vis[tmpX][tmpY] && tmpStep < dis[tmpX][tmpY]) {
						dis[tmpX][tmpY] = tmpStep;
						que.offer(new Node(tmpX, tmpY, tmpStep));
					}

				}
			}
		}

		// for (int i = 1; i <= n; i++) {
		// System.out.println(Arrays.toString(dis[i]));
		// }

		if (dis[x2][y2] == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(dis[x2][y2]);
		}
	}
}