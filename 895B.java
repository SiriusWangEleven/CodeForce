import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	static TreeSet<Integer> treeSet[];
	static Vector<Integer>[] vecs;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int x = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		TreeMap<Integer, Integer> treeMap = new TreeMap<>();

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			int tmp = Integer.valueOf(st.nextToken());
			if (treeMap.containsKey(tmp)) {
				int cnt = treeMap.get(tmp);
				treeMap.put(tmp, cnt + 1);
			} else
				treeMap.put(tmp, 1);
		}
		// System.out.println(treeMap);
		Set<Integer> set = treeMap.keySet();
		// System.out.println(set);

		List<Object> list = (List<Object>) Arrays.asList(set.toArray());
		// System.out.println(list);
		// System.out.println(list.get(0).getClass());

		long ans = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				int left = (int) list.get(i);
				int right = (int) list.get(j);
				int cnt = count(left, right, x);
				if (cnt > k)
					break;
				if (cnt == k) {
					// System.out.println("left==" + left +", right==" + right);
					ans += 1L * treeMap.get(left) * treeMap.get(right);
				}
			}
		}

		System.out.println(ans);

	}

	public static int count(int st, int ed, int x) {
		int cnt = 0;
		if (st == ed) {
			if (st % x == 0)
				cnt++;
			return cnt;
		}
		if (st % x == 0) {
			cnt++;
		}
		cnt += (ed / x - st / x);
		return cnt;
	}

}