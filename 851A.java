import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);
	static final double EPS = 1e-7;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		int t = Integer.valueOf(st.nextToken());

		if (t <= k)
			System.out.println(t);
		else if (t > k && t <= n)
			System.out.println(k);
		else {
			System.out.println(k - (t - n));
		}
	}
}