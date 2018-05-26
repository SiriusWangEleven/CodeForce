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
		int k = Integer.parseInt(st.nextToken());
		String str = br.readLine().trim();
		int[] latin = new int[1024];
		boolean ok = true;
		for (char c : str.toCharArray()) {
			latin[(int) c]++;
			if (latin[(int) c] > k) {
				ok = false;
				break;
			}
		}
		if (ok) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}