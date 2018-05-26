import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		int cnt = 0;
		int toRemove = 0;

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 2 * n; i++) {
			String op = in.next();
			if (op.compareTo("add") == 0) {
				int num = in.nextInt();
				stack.add(num);
				// System.out.println(tSet);
				// System.out.println(stack);
			} else if (op.compareTo("remove") == 0) {
				toRemove++;
				if (!stack.isEmpty()) {
					int top = stack.pop();
					if (top != toRemove) {
						cnt++;
						stack.clear();
					}

				}

			}

		}
		System.out.println(cnt);

	}
}