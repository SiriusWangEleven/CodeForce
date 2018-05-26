import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws IOException {
		int n = in.nextInt();
		int sin = in.nextInt();
		int dou = in.nextInt();
		int half = 0;

		int deny = 0;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			if (num == 2) {
				if (dou > 0) {
					dou--;
				} else {
					deny += 2;
				}
			} else {
				if (sin > 0) {
					sin--;
				} else if (dou > 0) {
					dou--;
					half++;
				} else if (half > 0) {
					half--;
				} else {
					deny++;
				}
			}

		}
		System.out.println(deny);
	}
}