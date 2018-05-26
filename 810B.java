import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	static Comparator<Integer> comp = new Comparator<Integer>() {
		public int compare(Integer a, Integer b) {
			return b - a;
		}
	};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int f = Integer.valueOf(st.nextToken());

		PriorityQueue<Integer> que = new PriorityQueue<>(comp);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.valueOf(st.nextToken());
			int l = Integer.valueOf(st.nextToken());
			if (k >= l)
				sum += l;
			else if (l <= 2 * k) {
				sum += k;
				que.add(l - k);
			} else {
				sum += k;
				que.add(k);
			}
		}

		while (!que.isEmpty() && f > 0) {
			sum += que.poll();
			f--;

		}
		System.out.println(sum);
	}
}