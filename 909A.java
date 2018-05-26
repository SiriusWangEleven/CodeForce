import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static LinkedList<LinkedList<Integer>> list;
	static int ans = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String first = st.nextToken();
		String last = st.nextToken();

		StringBuilder ans = new StringBuilder();
		ans.append(first.charAt(0));
		for (int i = 1; i < first.length(); i++) {
			if(first.charAt(i) < last.charAt(0))
				ans.append(first.charAt(i));
			else {
				break;
			}
		}
		ans.append(last.charAt(0));
		System.out.println(ans.toString());

	}
}