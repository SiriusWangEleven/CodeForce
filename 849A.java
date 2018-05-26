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
		int n = Integer.valueOf(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int a[] = new int[100];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}
		if (n % 2 == 1 && a[0] % 2 == 1 && a[n - 1] % 2 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}