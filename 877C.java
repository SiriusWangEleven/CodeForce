import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// int n = Integer.valueOf(st.nextToken());
		int n = in.nextInt();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 2; i <= n; i += 2) {
			sb.append(" ");
			sb.append(i);
			cnt++;
		}
		for (int i = 1; i <= n; i += 2) {
			sb.append(" ");
			sb.append(i);
			cnt++;
		}
		for (int i = 2; i <= n; i += 2) {
			sb.append(" ");
			sb.append(i);
			cnt++;
		}
		System.out.println(cnt);
		System.out.println(sb.toString().trim());
	}

}