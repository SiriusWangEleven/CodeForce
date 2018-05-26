import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int x1, x2, x, y1, y2, y;
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();

		int disX = Math.abs(x1 - x2);
		int step1 = disX / x;
		int disY = Math.abs(y1 - y2);
		int step2 = disY / y;

		if (step1 * x != disX || step2 * y != disY) {
			System.out.println("NO");
		} else if (Math.abs(step1 - step2) % 2 != 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}
}