import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// n = Integer.valueOf(st.nextToken());

		int n = in.nextInt();
		boolean a[] = new boolean[105];
		for (int i = 0; i <= 34; i++) {
			for (int j = 0; j <= 14; j++) {
				int tmp = i * 3 + j * 7;
				if (tmp > 100)
					break;
				a[tmp] = true;
			}
		}
		for (int i = 0; i < n; i++) {
			int tmp = in.nextInt();
			if (a[tmp])
				System.out.println("YES");
			else {
				System.out.println("NO");
			}
		}

	}

}