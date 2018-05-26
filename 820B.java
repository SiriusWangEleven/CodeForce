import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = in.nextInt();
		int a = in.nextInt();
		double minabs = 360;
		int vex = 3;
		double start = 360 / (2.0 * n);
		for (int i = 3; i <= n; i++) {
			double angle = (i - 2) * start;
			if (Math.abs(angle - a) < minabs) {
				minabs = Math.abs(angle - a);
				vex = i;

			}
		}
		System.out.println(vex+" 1 2");
	}
}