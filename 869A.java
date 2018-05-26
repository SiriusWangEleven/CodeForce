import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		TreeSet<Integer> treeSet = new TreeSet<>();
		int a[] = new int[n + 1];
		int b[] = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
			treeSet.add(a[i]);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			b[i] = Integer.valueOf(st.nextToken());
			treeSet.add(b[i]);
		}
		// System.out.println(treeSet);
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int tmp = a[i] ^ b[j];
				if (treeSet.contains(tmp))
					cnt++;
			}
		}
		if (cnt % 2 == 0) {
			System.out.println("Karen");
		} else {
			System.out.println("Koyomi");
		}
	}
}