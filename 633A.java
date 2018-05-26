import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		boolean ok = false;

		if (c % a == 0 || c % b == 0)
			ok = true;

		else {
			if (a > b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			// System.out.println(a+" "+b);
			while (c > a) {
				c -= b;
				if (c % a == 0) {
					ok = true;
					break;
				}
			}
		}
		System.out.println(ok == true ? "Yes" : "No");

	}

}