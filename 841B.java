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
		int n = Integer.parseInt(st.nextToken());
		long sum = 0;
		boolean hasOdd = false;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			long tmp = Integer.parseInt(st.nextToken());
			if (tmp % 2 == 1)
				hasOdd = true;
			sum += tmp;
		}
		if (sum % 2 == 1) {
			System.out.println("First");
		} else {
			if (hasOdd)
				System.out.println("First");
			else
				System.out.println("Second");
		}

	}

}