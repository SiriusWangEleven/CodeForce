import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int m = in.nextInt();
		int st = 5;
		int cnt = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (cnt <= m) {
			int tmp = 0;
			int num = st;
			while (num % 5 == 0) {
				num /= 5;
				tmp++;
			}
			cnt += tmp;
			map.put(cnt, st);

			st += 5;

		}
		if (map.containsKey(m)) {
			System.out.println(5);
			for (int i = 0; i < 4; i++)
				System.out.print(map.get(m) + i + " ");
			System.out.println(map.get(m) + 4);
		} else {
			System.out.println(0);
		}
		// System.out.println(map);
	}

}