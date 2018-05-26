import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		int x = in.nextInt();
		int y = in.nextInt();

		if (y < 1 || (y == 1 && x > 0)) {
			System.out.println("No");
			return;
		}
		if (x - (y - 1) < 0) {
			System.out.println("No");
			return;
		}
		if ((x - y + 1) % 2 != 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}