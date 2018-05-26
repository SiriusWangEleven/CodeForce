import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// int n = Integer.valueOf(st.nextToken());
		long a = in.nextLong();
		long b = in.nextLong();
		if (b - a >= 10) {
			System.out.println(0);
			return;
		}
		int ans = 1;
		for (long i = b - (b - a) + 1; i <= b; i++) {
			ans *= (i % 10);
		}
		System.out.println(ans % 10);
	}
}