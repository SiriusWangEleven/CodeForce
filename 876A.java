import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int minAB = Math.min(a, b);
		int minABC = Math.min(c, minAB);

		int dis = 0;
		if (n >= 2)
			dis = minAB + (n - 2) * minABC;
		System.out.println(dis);

	}

}