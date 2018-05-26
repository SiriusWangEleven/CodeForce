import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.valueOf(st.nextToken());
		int cube[][] = new int[3][6];
		boolean num[] = new boolean[1001];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 6; j++) {
				int tmp = Integer.valueOf(st.nextToken());
				cube[i][j] = tmp;
				num[tmp] = true;
			}
		}
		// System.out.println("ok");
		check(cube, num);

		for (int i = 1; i <= 1000; i++) {
			if (!num[i]) {
				System.out.println(i - 1);
				return;
			}
		}

	}

	public static void check(int cube[][], boolean num[]) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i)
					continue;
				check2(cube[i], cube[j], num);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i)
					continue;
				for (int k = 0; k < n; k++) {
					if (k == i || k == j)
						continue;
					check3(cube[i], cube[j], cube[k], num);
				}
			}
		}
	}

	public static void check2(int a[], int b[], boolean num[]) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int tmp = a[i] * 10 + b[j];
				num[tmp] = true;
			}
		}
	}

	public static void check3(int a[], int b[], int c[], boolean num[]) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					int tmp = a[i] * 100 + b[j] * 10 + c[k];
					num[tmp] = true;
				}
			}
		}
	}
}