import java.math.BigDecimal;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long a, b, l, r;
		a = in.nextLong();
		b = in.nextLong();
		l = in.nextLong();
		r = in.nextLong();

		long aExp[] = new long[65];
		long bExp[] = new long[65];
		aExp[0] = bExp[0] = 1L;
		int aMax = (int) Math.floor(18.0 * Math.log(10) / Math.log(a));
		int bMax = (int) Math.floor(18.0 * Math.log(10) / Math.log(b));
		cal(aExp, a, aMax);
		cal(bExp, b, bMax);

		TreeSet<Long> set = new TreeSet<Long>();

		for (int i = 0; i <= aMax; i++) {
			for (int j = 0; j <= bMax; j++) {
				// sum could exceed Long.MAX_VALUE
				BigDecimal aa = new BigDecimal(aExp[i]);
				BigDecimal bb = new BigDecimal(bExp[j]);
				BigDecimal sum = aa.add(bb);
				BigDecimal ll = new BigDecimal(l);
				BigDecimal rr = new BigDecimal(r);
				if (sum.compareTo(ll) >= 0 && sum.compareTo(rr) <= 0) {
					set.add(sum.longValue());
				}
			}
		}

		long ans = 0;
		if (set.isEmpty()) {
			ans = r - l + 1;
			System.out.println(ans);
			return;
		}
		if (!set.contains((long) l)) {
			ans = set.first() - l;
		}
		if (!set.contains((long) r)) {
			ans = Math.max(ans, r - set.last());
		}
		while (set.size() > 1) {
			long left = set.first();
			set.remove(left);
			long right = set.first();
			ans = Math.max(ans, right - left - 1);
		}
		System.out.println(ans);
	}

	static void cal(long a[], long num, int aMax) {
		for (int i = 1; i <= aMax; i++) {
			a[i] = a[i - 1] * num;
		}
	}
}