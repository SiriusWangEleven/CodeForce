import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("");
		int k = in.nextInt();

		if (k > 36) {
			System.out.println(-1);
			return;
		}

		while (k >= 2) {
			sb.append("8");
			k -= 2;
		}
		if (k > 0)
			sb.append("6");

		System.out.println(sb.toString());

	}

}