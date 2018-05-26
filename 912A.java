import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long x = in.nextLong();
		long y = in.nextLong();
		long z = in.nextLong();
		in.close();
		long sumYellow = x * 2 + y;
		long sumBlue = y + 3 * z;

		long ans = 0;
		if (sumYellow > a)
			ans += sumYellow - a;
		if (sumBlue > b)
			ans += sumBlue - b;
		System.out.println(ans);
	}

}