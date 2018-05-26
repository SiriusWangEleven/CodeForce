import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		n = in.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();

		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}

		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList<Integer> difIds = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				set.add(a[i]);
			else {
				difIds.add(i);
			}
		}

		if (difIds.size() == 1) {
			for (int i = 1; i <= n; i++) {
				if (!set.contains(i)) {
					int id = difIds.get(0);
					a[id] = i;
				}
			}
		} else {
			// size == 2
			while (difIds.size() != 0) {
				boolean flag = false;
				for (int i = 0; i < difIds.size(); i++) {
					int id = difIds.get(i);
					if (set.contains(a[id]) && !set.contains(b[id])) {
						a[id] = b[id];
						set.add(b[id]);
						flag = true;

					} else if (!set.contains(a[id]) && set.contains(b[id])) {
						set.add(a[id]);
						flag = true;

					}
					if (flag) {
						difIds.remove(i);
						break;
					}
				}
				if (!flag) {
					int id1 = difIds.get(0);
					int id2 = difIds.get(1);
					a[id1] = b[id2];
					break;
				}
			}

		}

		for (int i = 0; i < n - 1; i++)
			System.out.print(a[i] + " ");
		System.out.println(a[n - 1]);

	}
}