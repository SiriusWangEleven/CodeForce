import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int a;
		long len = 0;
		for (int i = 0; i < n; i++) {
			a = in.nextInt();
			if (set.contains(a)) {
				while (set.contains(a) && a > 0) {
					a--;
				}
				len += a;
				set.add(a);
			} else {
				len += a;
				set.add(a);
			}
		}

		System.out.println(len);

	}
}