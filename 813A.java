import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static int n, m;
	static int working[];

	public static void main(String[] args) {

		n = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += in.nextInt();

		m = in.nextInt();
		working = new int[100010];
		int maxR = 0;
		for (int i = 0; i < m; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			maxR = r;
			for (int j = l; j <= r; j++)
				working[j] = 1;
		}

		int ans = -1;

		if (sum > maxR) {
			ans = -1;
		} else if (working[sum] == 1)
			ans = sum;
		else if (sum < maxR) {
			for (int i = sum + 1; i <= maxR; i++) {
				if (working[i] == 1) {
					ans = i;
					break;
				}
			}
		}

		System.out.println(ans);

	}
}