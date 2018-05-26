import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int h1 = in.nextInt();
		int a1 = in.nextInt();
		int c1 = in.nextInt();
		int h2 = in.nextInt();
		int a2 = in.nextInt();

		int phase = 0;
		String action[] = { "HEAL", "STRIKE" };
		LinkedList<String> list = new LinkedList<>();

		while (h2 > 0) {
			if (h2 <= a1) {
				phase++;
				list.add(action[1]);
				break;
			}
			if (h1 <= a2) {
				list.add(action[0]);
				h1 = h1 + c1 - a2;

			} else {
				list.add(action[1]);
				h1 -= a2;
				h2 -= a1;
			}
			phase++;
		}
		System.out.println(phase);
		for (int i = 0; i < phase; i++)
			System.out.println(list.get(i));

	}

	public static void print(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}