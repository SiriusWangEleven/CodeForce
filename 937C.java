import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long k = in.nextLong();
		long d = in.nextLong();
		double t = in.nextDouble();

		if (k % d == 0) {
			// turn on immediately after turning off
			System.out.println(t);
			return;
		}
		double ans = 0;
		double cook = 0;

		long left = 0;

		if (k > d)
			left = d - k % d;
		else
			left = d - k;

		double oneLoop = k + left * 0.5;
		long loopTime = (long) (t / oneLoop);

		ans += loopTime * (k + left);
		cook += loopTime * oneLoop;

		if (cook + k < t) {
			cook += k;
			ans += k;
		} else {
			ans += t - cook;
			cook = t;
		}

		if (cook + left * 0.5 < t) {
			cook += left * 0.5;
			ans += left;
		} else {
			ans += (t - cook) * 2;
		}

		System.out.println(ans);
	}
}