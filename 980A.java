import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		String nec = br.readLine();
		int pearl = 0, link = 0;
		for (char c : nec.toCharArray()) {
			if (c == '-')
				link++;
			else {
				pearl++;
			}
		}
		if (pearl == 0 || link % pearl == 0)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}

	}

}