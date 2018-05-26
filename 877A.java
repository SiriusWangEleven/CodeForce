import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// int n = Integer.valueOf(st.nextToken());
		String problem = in.next();
		List<String> names = Arrays.asList(new String[] { "Nikita", "Danil",
				"Olya", "Slava", "Ann" });
		int ok = 0;
		for (int i = 0; i < names.size(); i++) {

			int firstIndex = problem.indexOf(names.get(i));
			int lastIndex = problem.lastIndexOf(names.get(i));
			// System.out.println(firstIndex + " " + lastIndex);
			if (firstIndex == -1)
				continue;
			ok++;
			if (lastIndex != firstIndex)
				ok++;

		}

		String ans = ok == 1 ? "YES" : "NO";
		System.out.println(ans);
	}
}