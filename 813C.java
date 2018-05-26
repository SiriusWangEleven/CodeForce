import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int ans = 0;
	static int disRoot[];
	static int disX[];
	static ArrayList<Integer>[] edges;
	static int n, x;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());

		edges = new ArrayList[n + 1];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new ArrayList<Integer>();
		}
		disRoot = new int[n + 1];
		disX = new int[n + 1];
		Arrays.fill(disRoot, -1);
		Arrays.fill(disX, -1);
		disRoot[1] = 0;
		disX[x] = 0;

		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edges[a].add(b);
			edges[b].add(a);
		}
		dfs(1, disRoot);
		dfs(x, disX);
		for (int i = 1; i <= n; i++) {
			if (disX[i] < disRoot[i]) {
				ans = Math.max(ans, disRoot[i]);
			}
		}
		System.out.println(ans * 2);
	}

	static void dfs(int node, int d[]) {
		for (int v : edges[node]) {
			if (d[v] == -1) {
				d[v] = d[node] + 1;
				dfs(v, d);
			}
		}
	}
}