import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += fun(Integer.parseInt(st.nextToken()), k);
		}
		int total = ans / 2 + (ans % 2);
		System.out.println(total);
	}

	static int fun(int n, int k) {
		int ans = n / k;
		if (n % k != 0)
			ans++;
		return ans;
	}

}