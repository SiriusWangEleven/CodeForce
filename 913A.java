import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int ans = (int) (Math.log(Math.pow(10, 8)) / Math.log(2)) + 1;

		if (n >= ans) {
			System.out.println(m);
			return;
		} else {
			System.out.println(m % (int)(Math.pow(2, n)));
		}
	}

}