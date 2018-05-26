import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n, a, b, c;
		n = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		int sum = 0;
		if (n < b || b - c >= a) {
			sum = n / a;
		} else {
			while (n >= b) {
				n = n - b + c;
				sum++;
			}
			sum += n / a;
		}
		System.out.println(sum);

	}
}