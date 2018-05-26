import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int ans = 0;
	static ArrayList<Integer>[] edges;
	static int n, q, a, b, c;
	static int fa[][];
	static int dep[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		fa = new int[n + 5][25];
		dep = new int[n + 5];
		edges = new ArrayList[n + 1];
		for (int i = 0; i < edges.length; i++)
			edges[i] = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			int p = Integer.parseInt(st.nextToken());
			edges[i].add(p);
			edges[p].add(i);
		}

		dfs(1, 0);

		// for (int i = 1; i <= n; i++)
		// System.out.println(Arrays.toString(fa[i]));
		//
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int lcaAB = lca(a, b);
			int lcaAC = lca(a, c);
			int lcaBC = lca(b, c);

			int disAB = dis(a, b, lcaAB);
			int disAC = dis(a, c, lcaAC);
			int disBC = dis(b, c, lcaBC);
			ans = 0;
			ans = Math.max(ans, disAB + disAC - disBC);
			ans = Math.max(ans, disAB + disBC - disAC);
			ans = Math.max(ans, disBC + disAC - disAB);
			ans = ans / 2 + 1;
			System.out.println(ans);

		}

	}

	static int dis(int x, int y, int lcaNode) {
		return dep[x] + dep[y] - 2 * dep[lcaNode];
	}

	static void dfs(int u, int f) {
		dep[u] = dep[f] + 1;
		fa[u][0] = f;
		for (int i = 1; i <= 20; i++)
			fa[u][i] = fa[fa[u][i - 1]][i - 1];

		for (int i = 0; i < edges[u].size(); i++) {
			int v = edges[u].get(i);
			if (v != f)
				dfs(v, u);
		}
	}

	static int lca(int x, int y) {

		if (dep[x] < dep[y]) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		for (int i = 20; i >= 0; i--) {
			if (dep[fa[x][i]] >= dep[y])
				x = fa[x][i];
		}
		if (x == y)
			return x;

		for (int i = 20; i >= 0; i--) {
			if (fa[x][i] != fa[y][i]) {
				x = fa[x][i];
				y = fa[y][i];
			}
		}
		return fa[x][0];

	}

}