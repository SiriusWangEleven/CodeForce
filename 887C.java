import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n = 24;
	static int color[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		color = new int[n + 1];
		boolean face[] = new boolean[7];
		for (int i = 1; i <= n; i++)
			color[i] = Integer.valueOf(st.nextToken());

		int sameFaceCnt = 0;

		for (int i = 1; i <= n; i += 4) {
			if (check(i, i + 1, i + 2, i + 3)) {
				face[i / 4 + 1] = true;
				sameFaceCnt++;
			}
		}
		// System.out.println(sameFaceCnt);
		if (sameFaceCnt != 2) {
			System.out.println("NO");
			return;
		}

		boolean ans = true;

		if (face[1] && face[3]) {
			int grp1[] = { 13, 14, 5, 6, 17, 18, 21, 22 };
			int grp2[] = { 15, 16, 7, 8, 19, 20, 23, 24 };
			ans = checkRotate(grp1, grp2);
		} else if (face[2] && face[6]) {
			int grp1[] = { 3, 4, 17, 19, 10, 9, 16, 14 };
			int grp2[] = { 1, 2, 18, 20, 12, 11, 15, 13 };
			ans = checkRotate(grp1, grp2);
		} else {
			// face[4] && face[5]
			int grp1[] = { 1, 3, 5, 7, 9, 11, 22, 24 };
			int grp2[] = { 2, 4, 6, 8, 10, 12, 21, 23 };
			ans = checkRotate(grp1, grp2);
		}
		if (ans)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}

	}

	public static boolean checkRotate(int a[], int b[]) {
		boolean ok1 = true;
		boolean ok2 = true;

		int len = a.length;

		for (int i = 0; i < len; i += 2) {
			ok1 = ok1
					&& check(a[i], a[i + 1], b[(i + 2) % len], b[(i + 3) % len]);

			ok2 = ok2
					&& check(a[i], a[i + 1], b[((i - 1) % len + len) % len],
							b[((i - 2) % len + len) % len]);
		}
		// System.out.println(ok1);
		// System.out.println(ok2);
		return (ok1 || ok2);
	}

	public static boolean check(int x1, int x2, int x3, int x4) {
		if (color[x1] == color[x2] && color[x1] == color[x3]
				&& color[x1] == color[x4])
			return true;
		return false;
	}
}