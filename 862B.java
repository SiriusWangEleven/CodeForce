import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

public class Main
{

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	static TreeSet<Integer> treeSet[];
	static Vector<Integer>[] vecs;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		vecs = new Vector[n + 1];
		treeSet = new TreeSet[2];
		for (int i = 0; i < 2; i++)
			treeSet[i] = new TreeSet<Integer>();

		for (int i = 0; i <= n; i++)
			vecs[i] = new Vector<Integer>();

		for (int i = 1; i < n; i++)
		{
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken());
			int v = Integer.valueOf(st.nextToken());
			vecs[u].add(v);
			vecs[v].add(u);
		}
		dfs(1, 0);
		
		long ans = (1L * treeSet[0].size() * treeSet[1].size()) - (n-1);
		System.out.println(ans);

	}

	static void dfs(int node, int setId)
	{
		if (treeSet[setId].contains(node))
			return;
		treeSet[setId].add(node);
		for (int i = 0; i < vecs[node].size(); i++)
		{
			dfs(vecs[node].get(i), (setId + 1) % 2);
		}
	}
}