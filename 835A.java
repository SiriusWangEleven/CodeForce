import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int s = in.nextInt(), v1 = in.nextInt(), v2 = in.nextInt(), t1 = in
				.nextInt(), t2 = in.nextInt();
		int ans1 = s * v1 + 2 * t1;
		int ans2 = s * v2 + 2 * t2;
		if (ans1 < ans2)
			System.out.println("First");
		else if (ans1 > ans2)
			System.out.println("Second");
		else {
			System.out.println("Friendship");
		}
	}

}