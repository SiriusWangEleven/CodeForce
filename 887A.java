import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = new StringBuilder(st.nextToken()).reverse().toString();
		int i = 0;
		int cnt = 6;
		// System.out.println(str);
		while (i < str.length() && cnt > 0) {
			if (str.charAt(i) == '0')
				cnt--;
			i++;
		}
		if (cnt > 0) {
			System.out.println("no");
			return;
		}
		for (int j = i; j < str.length(); j++) {
			if (str.charAt(j) == '1') {
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");

	}
}