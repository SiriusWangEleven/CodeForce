import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long n = in.nextLong();
		int k = in.nextInt();

		int type = 1;
		long count = 0;

		long left = n;

		for (int i = 1; i <= k; i++) {
			long cap = in.nextLong();
			if (n % cap < left) {
				left = n % cap;
				type = i;
				count = n / cap;
			}

		}
		System.out.println(type + " " + count);

	}

}