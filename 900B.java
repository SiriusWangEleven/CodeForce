import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// n = Integer.valueOf(st.nextToken());
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int max = 100005;

		int tmp = gcd(b, a);
		b /= tmp;
		a /= tmp;

		int i = 0;
		int pos = -1;
		while (i < max) {
			a *= 10;
			i++;
			if (a / b == c) {
				pos = i;
				break;
			}
			a %= b;
			if (a == 0)
				break;
		}
		if (a == 0 && pos == -1 && c == 0)
			pos = i + 1;
		System.out.println(pos);

	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}