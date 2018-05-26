import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	static TreeSet<Integer> treeSet[];
	static Vector<Integer>[] vecs;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		int ps[] = new int[400];
		ps[0] = 0;
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			int tmp = Integer.valueOf(st.nextToken());
			ps[i] = ps[i - 1] + tmp;
		}

		int ans = 360;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int a = ps[j] - ps[i];
				int b = 360 - a;
				ans = Math.min(ans, Math.abs(a - b));
			}
		}
		System.out.println(ans);

	}

}