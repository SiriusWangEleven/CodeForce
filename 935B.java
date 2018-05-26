import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		String str = in.next();
		int coin = 0;
		int x = 0, y = 0, lx = 0, ly = 0, rx = 0, ry = 0;

		int step = 0;
		while (step < n) {
			lx = x;
			ly = y;
			if (str.charAt(step) == 'U') {
				y++;
			} else {
				x++;
			}

			if (x == y) {
				if (step + 1 < n) {
					if (str.charAt(step + 1) == 'U') {
						ry = y + 1;
					} else {
						rx = x + 1;
					}

					if ((lx - ly) * (rx - ry) < 0)
						coin++;
				}
			}

			step++;
		}
		System.out.println(coin);

	}

}