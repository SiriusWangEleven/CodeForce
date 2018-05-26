import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		boolean used[] = new boolean[n + 1];
		int list[] = new int[n + 1];
		int cnt[] = new int[n + 1];
		ArrayList<Integer> left = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int tmp = Integer.valueOf(st.nextToken());
			used[tmp] = false;
			cnt[tmp]++;
			list[i] = tmp;
		}

		for (int i = 1; i <= n; i++) {
			if (cnt[i] == 0)
				left.add(i);
		}
		// System.out.println(left);
		// System.out.println(Arrays.toString(cnt));
		int leftNum = left.size();
		int j = 0;
		int i = 0;
		int ans = 0;
		while (i < n && j < leftNum) {
			int now = list[i];
			int candidate = left.get(j);

			if (cnt[now] == 1) {
				i++;
				continue;
			}
			if (candidate < now) {
				cnt[now]--;
				list[i] = candidate;
				j++;
				i++;
				ans++;
			} else {
				if (!used[now]) {
					used[now] = true;
					i++;
				} else {
					cnt[now]--;
					list[i] = candidate;
					j++;
					i++;
					ans++;
				}
			}
		}

		System.out.println(ans);
		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < n - 1; k++) {
			sb.append(list[k]);
			sb.append(" ");
		}
		sb.append(list[n - 1]);
		System.out.println(sb.toString());
	}
}