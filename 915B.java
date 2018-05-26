import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		int pos = in.nextInt();
		int l = in.nextInt();
		int r = in.nextInt();

		int ans = 0;
		if (l == 1 && r == n)
			ans = 0;
		else if (l == 1) {
			ans = Math.abs(pos - r) + 1;
		} else if (r == n) {
			ans = Math.abs(pos - l) + 1;
		} else {
			ans = Math.min(Math.abs(pos-l), Math.abs(pos-r)) + r -l + 2;
		}
		System.out.println(ans);
	}

}