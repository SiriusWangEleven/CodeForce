import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int ans = -1;
		int right = 1000000;
		for (int i = 1; i <= n; i++) {
			int prize = in.nextInt();
			ans = Math.max(ans, Math.min(prize-1, right-prize));
		}
		System.out.println(ans);
	}

}