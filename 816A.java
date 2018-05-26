import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String time = in.nextLine();
		// System.out.println(time);
		int ans = 0;
		int h = Integer.parseInt(time.substring(0, 2));
		int m = Integer.parseInt(time.substring(3, 5));
		int rh = 0;
		while (true) {
			rh = (h % 10) * 10 + h / 10;
			if (rh == m)
				break;
			m++;
			if (m >= 60) {
				h++;
				m %= 60;
				h %= 24;
			}
			ans++;
		}
		System.out.println(ans);

	}

}