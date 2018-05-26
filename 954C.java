import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] move = new int[200005];
		int maxGap = 1;
		int maxValue = 0;
		for (int i = 0; i < n; i++) {
			move[i] = in.nextInt();
			maxValue = Math.max(maxValue, move[i]);
			if (i > 0) {
				maxGap = Math.max(maxGap, Math.abs(move[i] - move[i - 1]));
			}
		}
		// System.out.println(maxGap + " " + maxValue);
		int y = maxGap;
		int x = maxValue / y;
		if (maxValue % y != 0)
			x += 1;

		// System.out.println(x + " " + y);

		int preX = move[0] / y;
		int preY = move[0] % y;
		if (preY != 0)
			preX += 1;
		else
			preY = y;

		boolean ok = true;
		for (int i = 1; i < n; i++) {
			int nowX = move[i] / y;
			int nowY = move[i] % y;
			if (nowY != 0)
				nowX += 1;
			else {
				nowY = y;
			}
			if (Math.abs(nowY - preY) + Math.abs(nowX - preX) != 1) {
				ok = false;
				break;
			}
			preX = nowX;
			preY = nowY;
		}
		if (ok) {
			System.out.println("YES");
			System.out.println(x + " " + y);
		} else {
			System.out.println("NO");
		}

	}

}