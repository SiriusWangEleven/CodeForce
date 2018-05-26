import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static PriorityQueue<Integer> list_square = new PriorityQueue<>();
	static PriorityQueue<Integer> list_not_square = new PriorityQueue<>();
	static int squre = 0, not_square = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int now = Integer.valueOf(st.nextToken());
			process(now);
		}

		long ans = 0;
		int dis = Math.abs(squre - not_square) / 2;
		if (squre > not_square) {

			for (int i = 0; i < dis; i++) {
				ans += list_square.poll();
			}

		} else if (squre < not_square) {
			for (int i = 0; i < dis; i++) {
				ans += list_not_square.poll();
			}
		}

		System.out.println(ans);

	}

	public static void process(int num) {
		int sq = (int) Math.sqrt(num);
		if (sq * sq == num) {
			squre++;
			if (num == 0)
				list_square.add(2);
			else {
				list_square.add(1);
			}
		} else {
			not_square++;
			int q1 = num - sq * sq;
			int q2 = (sq + 1) * (sq + 1) - num;
			if (q1 > q2)
				list_not_square.add(q2);
			else {
				list_not_square.add(q1);
			}
		}
	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}