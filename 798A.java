import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int cnt = 0;
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i))
				cnt++;
		}
		//System.out.println(cnt);
		if (cnt == 0 && len % 2 == 1)
			cnt++;
		
		if (cnt == 1)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}

	}

}