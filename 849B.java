import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);
	static final double EPS = 1e-7;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int pty[] = new int[n + 5];

		for (int i = 1; i <= n; i++) {
			pty[i] = Integer.valueOf(st.nextToken());
		}
		double k12 = (pty[2] - pty[1]) / 1.0;
		double d12 = pty[1] - k12;

		double k = 0;
		double d1 = 0, d2 = 0;
		k = k12;
		d1 = d12;

		boolean ok = true;

		if (sameLine(k, d1, 3, pty[3])) {
			int index = -1;
			for (int i = 4; i <= n; i++) {
				if (sameLine(k, d1, i, pty[i]))
					continue;

				d2 = pty[i] - k * i;
				index = i;
				break;
			}
			if (index == -1) {
				// cannot find second line
				ok = false;
			} else {
				// find second line
				// have to check if third line exists
				for (int i = index + 1; i <= n; i++) {
					if (sameLine(k, d1, i, pty[i])
							|| sameLine(k, d2, i, pty[i]))
						continue;
					ok = false;
					break;
				}
			}
		} else {
			// A B C not on the same line
			// AB & C
			double kab = (pty[2] - pty[1]) / 1.0;
			double dab = pty[1] - kab;
			double dc = pty[3] - kab * 3;
			boolean ab_c = checkTwoLines(kab, dab, dc, 4, n, pty);
			// AC & B
			double kac = (pty[3] - pty[1]) / 2.0;
			double dac = pty[1] - kac;
			double db = pty[2] - 2 * kac;
			boolean ac_b = checkTwoLines(kac, dac, db, 4, n, pty);
			// BC & A
			double kbc = (pty[3] - pty[2]) / 1.0;
			double dbc = pty[2] - kbc * 2;
			double da = pty[1] - kbc;
			boolean bc_a = checkTwoLines(kbc, dbc, da, 4, n, pty);

			if (ab_c || ac_b || bc_a) {
				ok = true;
			} else {
				ok = false;
			}
		}

		if (ok)
			System.out.println("Yes");
		else {
			System.out.println("No");
		}
	}

	static boolean checkTwoLines(double k, double d1, double d2, int start,
			int n, int pty[]) {
		for (int i = start; i <= n; i++) {
			if (sameLine(k, d1, i, pty[i]) || sameLine(k, d2, i, pty[i]))
				continue;
			return false;
		}
		return true;
	}

	static boolean dEql(double a, double b) {
		if (Math.abs(a - b) > EPS)
			return false;
		return true;
	}

	static boolean sameLine(double k, double d, int x, int y) {
		double ansY = k * x + d;
		if (dEql(ansY, y * 1.0))
			return true;
		return false;
	}
}