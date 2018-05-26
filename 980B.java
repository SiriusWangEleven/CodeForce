import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		char[] model = new char[n];
		Arrays.fill(model, '.');
		StringBuffer[] strbuBuffers = new StringBuffer[4];
		for (int i = 0; i < 4; i++)
			strbuBuffers[i] = new StringBuffer(new String(model));
		if (k > (n - 2)) {
			k = k - n + 2;
			for (int i = 1; i < n - 1; i++)
				strbuBuffers[1].setCharAt(i, '#');
		}
		if (k % 2 == 1)
			strbuBuffers[2].setCharAt(n / 2, '#');
		for (int i = 1; i <= k / 2; i++) {
			strbuBuffers[2].setCharAt(i, '#');
			strbuBuffers[2].setCharAt(n - i - 1, '#');
		}
		System.out.println("YES");
		for (int i = 0; i < 4; i++)
			System.out.println(strbuBuffers[i].toString());
	}

}