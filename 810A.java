import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		double sum = 0;
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.valueOf(st.nextToken());
			sum += a;
		}
		while (Math.round(sum / n) < k) {
			cnt++;
			sum += k;
			n++;
		}
		System.out.println(cnt);
	}
}