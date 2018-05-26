import java.io.IOException;
import java.util.Comparator;
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
		int x = in.nextInt();
		while (x % 10 == 0) {
			x /= 10;
		}

		String a = String.valueOf(x);

		String b = new StringBuilder(a).reverse().toString();

		if (a.compareTo(b) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}