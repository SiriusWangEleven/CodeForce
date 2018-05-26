import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		Long k = Long.valueOf(st.nextToken());

		Queue<Integer> que = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			que.add(Integer.valueOf(st.nextToken()));

		int cnt[] = new int[n + 1];

		if (k >= n - 1) {
			System.out.println(n);
			return;
		}

		int ans = -1;
		while (ans == -1) {
			int head = que.poll();

			while (!que.isEmpty()) {
				int next = que.peek();
				if (head > next) {
					cnt[head]++;
					que.poll();
					que.add(next);
					if (cnt[head] == k) {
						ans = head;
						break;
					}
				} else {
					cnt[next]++;
					que.add(head);
					if (cnt[next] == k) {
						ans = next;
					}
					break;
				}
			}

		}

		System.out.println(ans);
	}
}