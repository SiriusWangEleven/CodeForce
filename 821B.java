import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		long m = in.nextLong();
		long b = in.nextLong();
		long ans = 0;
		for (long y = 0; y <= b; y++) {
			long x = (b - y) * m;
			long sum = getSum(x) * (y + 1) + getSum(y) * (x + 1);
			ans = Math.max(sum, ans);
		}
		System.out.println(ans);
	}

	static long getSum(long x) {
		return (x + 1) * x / 2;
	}
}