import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	static Comparator<Integer> comp = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1 - o2;
		}

	};

	public static void main(String[] args) throws IOException {
		int n = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(3);
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			queue.add(num);
			if (map.containsKey(num)) {
				int cnt = map.get(num) + 1;
				map.put(num, cnt);
			} else {
				map.put(num, 1);
			}
		}
		int a = queue.poll();
		int b = queue.poll();
		int c = queue.poll();
		long ans = 0;
		if (a == b && a == c) {
			int cnt = map.get(a);
			ans = getC(cnt, 3);
		} else if (a == b && a != c) {
			ans = map.get(c);
		} else if (a != b && a != c) {
			if (b != c)
				ans = map.get(c);
			else {
				int cnt = map.get(b);
				ans = getC(cnt, 2);
			}
		}
		System.out.println(ans);
	}

	static long getC(int n, int k) {
		long ans = 1L;
		for (int i = 1; i <= k; i++) {
			ans = ans * (n - i + 1) / i;
		}
		return ans;
	}
}