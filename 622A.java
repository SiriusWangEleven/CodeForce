import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static long N = (long) (2 * 1e14);
	static long ed = 14142136;

	public static void main(String[] args) {
		long pos = in.nextLong();
		N = 2 * pos;
		long index = binary_search(1, ed, N);
		;
		long left = N - mul(index);
		left /= 2;
		// System.out.println(index+" "+left);
		System.out.println(left == 0 ? index : left);

	}

	static long binary_search(long st, long ed, long N) {
		long mid = (st + ed) >> 1;
		if (mul(mid) <= N && mul(mid + 1) > N)
			return mid;
		if (mul(mid) > N) {
			return binary_search(st, mid, N);
		} else
			return binary_search(mid, ed, N);

	}

	static long mul(long x) {
		return x * x + x;
	}
}