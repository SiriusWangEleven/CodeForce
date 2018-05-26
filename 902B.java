import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static LinkedList<LinkedList<Integer>> list;
	static int ans = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int color[] = new int[n + 1];
		int des[] = new int[n + 1];
		list = new LinkedList<LinkedList<Integer>>();
		for (int i = 0; i <= n; i++) {
			LinkedList<Integer> nodeList = new LinkedList<Integer>();
			list.add(nodeList);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 2; i <= n; i++) {
			int fa = Integer.valueOf(st.nextToken());
			list.get(fa).add(i);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++)
			des[i] = Integer.valueOf(st.nextToken());

		// System.out.println(list);

		updateTree(1, des, 0);
		System.out.println(ans);

	}

	public static void updateTree(int node, int color[], int fa_color) {
		// System.out.println("node==" + node);

		if (color[node] != fa_color) {
			ans++;
		}

		for (int i = 0; i < list.get(node).size(); i++) {
			updateTree(list.get(node).get(i), color, color[node]);
		}

		// System.out.println("loop");

	}

	// public static void count(int node, int color[], int des[]) {
	// if (color[node] != des[node]) {
	// ans++;
	// updateTree(node, color, des[node]);
	// }
	// for (int i = 0; i < list.get(node).size(); i++)
	// count(list.get(node).get(i), color, des);
	//
	// }
}