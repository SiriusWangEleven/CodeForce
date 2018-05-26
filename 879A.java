import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int start = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			int cnt = 0;
			while (true) {
				if (s + cnt * d > start) {
					start = s + cnt * d;
					break;
				}
				cnt++;
			}
		}
		System.out.println(start);

	}
}