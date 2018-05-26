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
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		boolean[] hole = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= m; i++)
			hole[Integer.parseInt(st.nextToken())] = true;
		int pos = 1;
		boolean inHole = hole[pos];
		for (int i = 1; i <= k; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if (!inHole) {
				pos = change(pos, u, v);
				inHole = hole[pos];
			}
		}
		System.out.println(pos);
	}

	static int change(int pos, int u, int v) {
		if (pos != u && pos != v)
			return pos;
		if (pos == u)
			return v;
		else {
			return u;
		}
	}

}