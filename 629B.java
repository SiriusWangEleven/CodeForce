import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	static int f[];
	static int m[];
	static int n;

	public static void main(String[] args) {

		f = new int[380];
		m = new int[380];
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int a, b;
			String string = in.next();
			a = in.nextInt();
			b = in.nextInt();
			if (string.charAt(0) == 'M') {
				for (int j = a; j <= b; j++)
					m[j]++;
			} else {
				for (int j = a; j <= b; j++)
					f[j]++;
			}
			// System.out.println(string+" "+a+" "+b);
		}
		int num = 0;
		for (int i = 1; i <= 366; i++) {
			num = Math.max(num, Math.min(f[i], m[i]));
		}
		System.out.println(num * 2);

	}
}