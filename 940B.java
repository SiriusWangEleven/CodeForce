import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long n = in.nextInt();
		long k = in.nextInt();
		long a = in.nextInt();
		long b = in.nextInt();

		long coin = 0;

		if (k == 1) {
			coin = (n - 1) * 1L * a;
			System.out.println(coin);
			return;
		}

		long rest = -1;
		while (n >= k) {
			rest = n % k;
			if (rest != 0) {
				n -= rest;
				coin += rest * a;
			} else {
				if ((n - n / k) * a > b) {
					coin += b;
				} else {
					coin += (n - n / k) * a;
				}
				n /= k;
			}
			// System.out.println("n==" + n + ", coin==" + coin);
		}

		coin += (n - 1) * a;

		System.out.println(coin);
	}
}