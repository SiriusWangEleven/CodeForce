import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();

		int x = -1, y = -1;
		for (int i = 0; i <= n / a; i++) {
			if ((n - i * a) % b == 0) {
				y = (n - i * a) / b;
				x = i;
				break;
			}
		}
		if (x == -1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			System.out.println(x + " " + y);
		}

	}

	public static void print(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}