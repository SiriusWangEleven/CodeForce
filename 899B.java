import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int calendar[] = { 31, 2, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int cnt29 = 0;

		int month[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int tmp = Integer.valueOf(st.nextToken());
			if (tmp == 29)
				cnt29++;
			if (tmp / 10 == 2)
				tmp = 2;
			month[i] = tmp;
		}

		if (cnt29 > 1) {
			System.out.println("No");
			return;
		}

		for (int i = 0; i < 12; i++) {
			boolean ok = match(i, month, n);
			if (ok) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}

	public static boolean match(int first, int month[], int n) {
		boolean ok = true;
		for (int i = 0; i < n; i++) {
			if (month[i] != calendar[(first + i) % 12]) {
				ok = false;
				break;
			}
		}
		return ok;
	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}