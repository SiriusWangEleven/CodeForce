import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n, k;
		boolean ans = false;
		n = in.nextInt();
		k = in.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[k + 1];

		int zeroId = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (a[i] == 0)
				zeroId = i;
		}
		for (int i = 0; i < k; i++) {
			b[i] = in.nextInt();
		}
		a[zeroId] = b[0];
		if (k > 1)
			ans = true;
		else {
			for (int i = 0; i < n - 1; i++) {
				if (a[i] > a[i + 1])
					ans = true;
			}
		}
		if (ans)
			System.out.println("Yes");
		else {
			System.out.println("No");
		}
	}
}