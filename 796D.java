import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	static class Edge {
		int u, v;

		public Edge(int u, int v) {
			this.u = u;
			this.v = v;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] fa = new int[n + 1];
		Arrays.fill(fa, -1);
		int[] dis = new int[n + 1];
		Arrays.fill(dis, n + 5);

		Queue<Integer> queue = new LinkedList<Integer>();

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= k; i++) {
			int police = Integer.parseInt(st.nextToken());
			dis[police] = 0;
			fa[police] = police;
			queue.add(police);
		}

		Edge[] edges = new Edge[n];
		ArrayList<ArrayList<Integer>> map = new ArrayList<>();
		for (int i = 0; i <= n; i++)
			map.add(new ArrayList<Integer>());

		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			map.get(u).add(v);
			map.get(v).add(u);
			edges[i] = new Edge(u, v);
		}

		boolean[] used = new boolean[n + 1];
		while (!queue.isEmpty()) {
			int now = queue.poll();
			if (used[now])
				continue;
			used[now] = true;
			ArrayList<Integer> nextList = map.get(now);
			for (int i = 0; i < nextList.size(); i++) {
				int next = nextList.get(i);
				if (used[next])
					continue;

				if (dis[now] + 1 <= dis[next]) {
					fa[next] = fa[now];
					dis[next] = dis[now] + 1;
					queue.add(next);
				}

			}

		}

		// System.out.println(Arrays.toString(fa));
		// System.out.println(Arrays.toString(dis));
		int cnt = 0;
		StringBuffer sb = new StringBuffer("");
		for (int i = 1; i < n; i++) {
			int u = edges[i].u;
			int v = edges[i].v;
			if (fa[u] != fa[v]) {
				sb.append(i + " ");
				cnt++;
			}

		}
		System.out.println(cnt);
		System.out.println(sb.toString().trim());

	}
}