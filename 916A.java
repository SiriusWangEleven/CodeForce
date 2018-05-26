import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int h = in.nextInt();
		int m = in.nextInt();

		for (int i = 0; ; i++) {
			int sum = (i * x) % (24 * 60);

			int hh = sum / 60;
			int mm = sum % 60;

			int tmpH = h;
			int tmpM = m;
			tmpH = (tmpH - hh + 24) % 24;
			if (tmpM >= mm) {
				tmpM -= mm;
			} else {
				tmpM = tmpM + 60 - mm;
				tmpH = (tmpH - 1 + 24) % 24;
			}
			if (tmpH % 10 == 7 || tmpM % 10 == 7) {
				System.out.println(i);
				return;
			}
		}
	}
}