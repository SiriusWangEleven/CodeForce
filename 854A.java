import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = in.nextInt();
		int a = 1, b = n - 1;
		for (b = n / 2 + 1; b <= n - 1; b++) {
			a = n - b;
			if (gcd(b, a) == 1)
				break;
		}
		System.out.println(a + " " + b);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}