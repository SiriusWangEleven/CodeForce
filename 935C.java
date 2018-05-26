import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		double r = in.nextDouble();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x = 0, y = 0;
		double R = 0;

		double disFafa = dis(x1, y1, x2, y2);

		if (disFafa >= r) {
			System.out.println(x1 + " " + y1 + " " + r);
			return;
		}

		if (disFafa == 0) {
			x = x1 + r / 2;
			y = y1;
			R = r / 2;
			System.out.println(x + " " + y + " " + R);
			return;
		}

		R = (disFafa + r) / 2;
		double disFifa = R - disFafa;

		double sin = (y1 - y2) / disFafa;
		double cos = (x1 - x2) / disFafa;

		x = x1 + disFifa * cos;
		y = y1 + disFifa * sin;

		System.out.println(x + " " + y + " " + R);

	}

	static double dis(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

}