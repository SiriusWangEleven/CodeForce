import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int x = 1;

		for (int plate = 1; plate < Math.min(n, a); plate++) {
			int pieces = a / plate;
			int picA = b / (n - plate);
			x = Math.max(x, Math.min(picA, pieces));
		}
		System.out.println(x);
	}

}