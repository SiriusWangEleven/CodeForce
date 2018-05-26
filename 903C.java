import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		TreeMap<Integer, Integer> map = new TreeMap<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int now = Integer.valueOf(st.nextToken());
			if (map.containsKey(now)) {
				int cnt = map.get(now) + 1;
				map.put(now, cnt);
			} else {
				map.put(now, 1);
			}
		}

		int listLen[] = new int[5005];
		int listCnt[] = new int[5005];

		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int len = 0;
		while (it.hasNext()) {
			listLen[len] = it.next();
			listCnt[len] = map.get(listLen[len]);
			len++;
		}

		// print(listLen, len);
		// print(listCnt, len);
		//
		// System.out.println();
		int ans = 0;

		for (int i = len - 1; i >= 0; i--) {
			if (listCnt[i] <= 0)
				continue;
			ans += listCnt[i];
			int tmp = listCnt[i];
			for (int j = i; j >= 0; j--) {
				listCnt[j] -= tmp;

				// System.out.println("j==" + j + ", cntJ==" + listCnt[j]);
			}
			// print(listCnt, len);
		}
		System.out.println(ans);

	}

	public static void print(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}