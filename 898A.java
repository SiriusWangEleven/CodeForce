import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		in.close();

		int a = n / 10;
		int b = n % 10;
		if (b == 0) {
			System.out.println(n);
			return;
		}
		if (b > 5)
			a++;
		if (a > 0)
			System.out.print(a);
		System.out.println(0);
	}

	public static void print(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}