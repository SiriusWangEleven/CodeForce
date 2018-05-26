import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		int l = Integer.valueOf(st.nextToken());
		int r = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		long ls = (long) k * l;
		long rs = (long) k * r;
		// System.out.println(Long.MAX_VALUE);
		// System.out.println("ls==" + ls);
		// System.out.println("rs==" + rs);
		// System.out.println("y==" + y);
		// System.out.println("x==" + x);
		if (ls > y || rs < x) {
			System.out.println("NO");
		} else {
			// System.out.println("second");
			boolean find = false;
			for (long i = ls; i <= rs; i += k) {
				if (i >= x && i <= y) {
					find = true;
					break;
				}
			}
			if (find)
				System.out.println("YES");
			else {
				System.out.println("NO");
			}
		}
	}

}