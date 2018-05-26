import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int mmax = -1;
		for (int i = 0; i < n; i++) {
			int tmp = Integer.valueOf(st.nextToken());
			mmax = Math.max(mmax, tmp);
		}
		if (mmax <= 25)
			System.out.println(0);
		else
			System.out.println(mmax - 25);

	}
}