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
		int n = in.nextInt();
		int k = in.nextInt();

		int mmax = 0;
		int mmin = 1;

		if (k == 0 || k == n)
			mmin = 0;
		else {
			mmin = 1;
		}

		if (k <= n / 3) {
			mmax = k * 2;
		} else {
			mmax = n - k;
		}
		System.out.println(mmin + " " + mmax);
	}
}