import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int map[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				map[i][j] = in.nextInt();
		}

		boolean acc = false;

		for (int i = 0; i < 4; i++) {
			if (map[i][3] == 1) {
				if (map[i][0] + map[i][1] + map[i][2] > 0) {
					acc = true;
					break;
				}
				if (map[(i + 2) % 4][1] == 1) {
					acc = true;
					break;
				}
				if (map[(i + 1) % 4][0] == 1 || map[(i - 1 + 4) % 4][2] == 1) {
					acc = true;
					break;
				}
			}
		}
		if (acc)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}

	}
}