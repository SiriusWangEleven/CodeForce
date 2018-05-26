import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int a = in.nextInt(), b = in.nextInt();
		int min = Math.min(a, b);
		int ans = 1;
		for (int i = 2; i <= min; i++)
			ans *= i;
		System.out.println(ans);
	}
}