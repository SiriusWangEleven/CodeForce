import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readL);
		int a = in.nextInt();
		int b = in.nextInt();
		int f = in.nextInt();
		int k = in.nextInt();
		long dist = 1L * a * k;

		ArrayList<Long> gas = new ArrayList<>();
		gas.add(0L);
		long start = f;
		gas.add(start);
		while (start <= dist) {
			start += 2 * (a - f);
			if (start > dist)
				break;
			gas.add(start);

			start += 2 * f;
			if (start > dist)
				break;
			gas.add(start);
		}
		gas.add(dist);

		// System.out.println(gas);

		long left = b;

		long cnt = 0;
		for (int j = 1; j < gas.size(); j++) {
			long gap = gas.get(j) - gas.get(j - 1);

			if (b < gap) {
				cnt = -1;
				break;
			}

			if (left < gap) {
				left = b - gap;
				cnt++;
			} else {
				left -= gap;
			}
			// System.out.println("left==" + left + ", gas pos==" + gas.get(j) +
			// ", cnt==" + cnt);
		}
		System.out.println(cnt);
	}
}