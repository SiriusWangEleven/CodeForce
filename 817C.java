import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		long n = in.nextLong();
		long s = in.nextLong();
		long minNum = getMin(s);
		// System.out.println("minNum==" + minNum);
		if (n < minNum)
			System.out.println(0);
		else {
			System.out.println(n - minNum + 1);
		}

	}

	static long getMin(long s) {
		long ans = (s / 9) * 9;
		if (ans != s)
			ans += 9;

		ans = ans - ans % 10 + 10;
		while (true) {
			if (ans - getStringSum(ans) >= s) {
				break;
			}
			ans += 10;
		}
		return ans;
	}

	static int getStringSum(long s) {
		int sum = 0;
		while (s != 0) {
			sum += s % 10;
			s = s / 10;
		}
		return sum;
	}

}