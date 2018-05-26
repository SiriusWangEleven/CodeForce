import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);
	static Comparator<Voucher> cmp = new Comparator<Voucher>() {
		public int compare(Voucher a, Voucher b) {
			if (a.w != b.w)
				return a.w - b.w;
			else
				return a.l - b.l;
		}
	};
	static int n, x;
	static PriorityQueue<Voucher>[] ques;
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws IOException {
		ques = new PriorityQueue[200005];
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= x; i++)
			ques[i] = new PriorityQueue<Voucher>(cmp);

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st
					.nextToken()), w = Integer.parseInt(st.nextToken());
			Voucher v = new Voucher(l, w);
			if (r - l + 1 >= x)
				continue;
			ques[r - l + 1].add(v);
		}

		int cost = Integer.MAX_VALUE;

		for (int i = 1; i <= x / 2; i++) {
			if (ques[i].isEmpty() || ques[x - i].isEmpty())
				continue;
			Iterator<Voucher> it1 = ques[i].iterator();
			while (it1.hasNext()) {
				Voucher a = it1.next();
				Iterator<Voucher> it2 = ques[x - i].iterator();
				while (it2.hasNext()) {
					Voucher b = it2.next();

					if (a.l + i - 1 < b.l || b.l + x - i - 1 < a.l) {
						int sum = a.w + b.w;
						if (sum < cost) {
							cost = sum;
						}
						break;
					}

				}
			}
		}
		if (cost == Integer.MAX_VALUE)
			System.out.println(-1);
		else {
			System.out.println(cost);
		}
	}

	static void initialize() throws IOException {

	}
}

class Voucher {
	int l, w;

	public Voucher(int l, int w) {
		this.l = l;
		this.w = w;
	}

}