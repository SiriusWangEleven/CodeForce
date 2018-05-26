import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// System.out.println(1 ^ 3);
		int n = in.nextInt();
		int cnt = 0;
		for (int i = 3; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int x = (i ^ j);
				if (x <= n && x >= j && i + j > x)
					cnt++;
			}
		}
		System.out.println(cnt);
	}

}