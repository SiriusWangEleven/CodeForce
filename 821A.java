import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		int grid[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] = in.nextInt();

		boolean find = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				find = false;
				int sum = grid[i][j];
				if (sum == 1)
					continue;
				for (int k = 0; k < n; k++) {
					for (int t = 0; t < n; t++) {
						if (grid[i][k] + grid[t][j] == sum) {
							find = true;
							break;
						}
					}
					if (find)
						break;
				}
				if (!find) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}