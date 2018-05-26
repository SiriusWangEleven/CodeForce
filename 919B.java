import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[10005];

		int now = 1;
		int id = 1;
		while (true) {
			if (id > 10000)
				break;
			if (calDigits(now)) {
				num[id] = now;
				id++;
			}
			now++;
		}

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(num[n]);
	}

	public static boolean calDigits(int k) {
		int ans = 0;
		while (k > 0) {
			ans += k % 10;
			if (ans > 10)
				return false;
			k /= 10;
		}
		if (ans == 10)
			return true;
		return false;

	}
}