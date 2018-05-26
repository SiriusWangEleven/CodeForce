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
		int len = (int) Math.sqrt(n);

		int ans = 0;
		if (len * len >= n) {
			ans = (len + len) * 2;
		} else if (len * (len + 1) >= n) {
			ans = (len + len + 1) * 2;
		} else {
			ans = (len + len + 2) * 2;
		}
		System.out.println(ans);
	}
}