import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static class Node {
		int id, cost;

		public Node(int id, int cost) {
			this.id = id;
			this.cost = cost;
		}

		public String toString() {
			return "id==" + this.id + ", cost==" + this.cost;
		}
	}

	static int now;

	static class MyComparator implements Comparator<Node> {
		public int compare(Node o1, Node o2) {
			System.out.println("now==" + now);
			System.out.println(o1);
			System.out.println(o2);
			return (now - o2.id) * o2.cost - (now - o1.id) * o1.cost;
		}
	}

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		String s = in.next();
		HashSet<Character> set = new HashSet<>();
		int ans = 0;
		int tmp = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				ans = Math.max(ans, tmp);
				tmp = 0;
				set.clear();
				continue;
			}

			// c is lowercase
			if (set.contains(c))
				continue;
			set.add(c);
			tmp++;
		}
		ans = Math.max(ans, tmp);
		System.out.println(ans);
	}
}