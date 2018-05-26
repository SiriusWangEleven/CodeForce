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
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int now = 0;
		int day = 0;
		for (int i = 0; i < n; i++) {
			now += a[i];
			k -= Math.min(8, now);
			now -= Math.min(8, now);
			day++;
			if (k <= 0)
				break;
		}
		if (k > 0)
			day = -1;

		System.out.println(day);
	}
}