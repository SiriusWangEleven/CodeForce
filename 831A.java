import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws IOException {
		int n = in.nextInt();
		int a[] = new int[1005];
		for (int i = 1; i <= n; i++)
			a[i] = in.nextInt();

		String ans = "YES";
		int state = 1; // 1 increase, 2 constant, 3 decreasing

		for (int i = 2; i <= n; i++) {
			if (state == 1) {
				if (a[i] > a[i - 1])
					state = 1;
				else if (a[i] == a[i - 1])
					state = 2;
				else
					state = 3;
			} else if (state == 2) {
				if (a[i] > a[i - 1]) {
					ans = "NO";
					break;
				} else if (a[i] == a[i - 1])
					state = 2;
				else {
					state = 3;
				}
			} else {
				if (a[i] >= a[i - 1]) {
					ans = "NO";
					break;
				} else {
					state = 3;
				}
			}
		}
		System.out.println(ans);

	}
}