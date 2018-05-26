import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		int mod = -1;
		for (int i = 0; i < m; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			map.get(tmp % m).add(tmp);
			if (map.get(tmp % m).size() >= k)
				mod = tmp % m;

		}
		if (mod == -1) {
			System.out.println("No");
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < Math.min(map.get(mod).size(), k); i++) {
				sb.append(map.get(mod).get(i) + " ");
			}
			System.out.println("Yes\n" + sb.toString().trim());
		}

	}
}