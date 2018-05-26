import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	static int num[];
	static int map[][];
	static int n;

	public static void main(String[] args) {

		num = new int[101];
		map = new int[101][101];

		for (int i = 1; i <= 100; i++)
			num[i] = i * (i - 1) / 2;

		n = Integer.parseInt(in.nextLine());
		// in.next();
		for (int i = 1; i <= n; i++) {
			String string = in.nextLine();
			// System.out.println(string);
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(j) == '.')
					map[i][j + 1] = 0;

				else
					map[i][j + 1] = 1;
			}
			// System.out.println(Arrays.toString(map[i]));
		}
		int sum = 0;
		int row = 0;
		int col = 0;

		for (int i = 1; i <= n; i++) {
			row = 0;
			col = 0;
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == 1)
					row++;
				if (map[j][i] == 1)
					col++;
			}
			sum += num[row];
			sum += num[col];
		}
		System.out.println(sum);

	}
}