import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws IOException {
		long n = in.nextLong();
		long k = in.nextLong();
		if ((n / k) % 2 == 1)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}