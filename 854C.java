import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static class Node {
		int id, cost;
		int takeoff;

		public Node(int id, int cost) {
			this.id = id;
			this.cost = cost;
			this.takeoff = -1;
		}

		public String toString() {
			return "id==" + this.id + ", cost==" + this.cost + ", takeoff=="
					+ this.takeoff;
		}
	}

	static int now;

	static class MyComparator implements Comparator<Node> {
		public int compare(Node o1, Node o2) {
			return o2.cost - o1.cost;
		}
	}

	static Scanner in = new Scanner(System.in);

	// static final double EPS = 1e-7;
	// static final double HALFPI = Math.PI / 2.0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		MyComparator comp = new MyComparator();
		PriorityQueue<Node> que = new PriorityQueue<>(comp);

		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		Node nodes[] = new Node[n + 1];
		st = new StringTokenizer(br.readLine());
		long sumCost = 0;
		for (int i = 1; i <= n + k; i++) {
			if (i <= n) {
				int cost = Integer.valueOf(st.nextToken());
				Node newNode = new Node(i, cost);
				nodes[i] = newNode;
				que.offer(newNode);
			}
			if (i > k) {
				Node top = que.poll();
				top.takeoff = i;
				sumCost += (long) top.cost * (top.takeoff - top.id);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; i++) {
			sb.append(nodes[i].takeoff);
			sb.append(" ");
		}
		sb.append(nodes[n].takeoff);
		System.out.println(sumCost);
		System.out.println(sb);
	}

	public static void test() {
		MyComparator comp = new MyComparator();
		Node node1 = new Node(1, 4);
		Node node2 = new Node(2, 2);
		Node node3 = new Node(3, 1);
		Node node4 = new Node(4, 10);
		TreeSet<Node> treeSet = new TreeSet<>(comp);
		now = 1;
		now++;
		treeSet.add(node1);
		now++;
		treeSet.add(node2);
		now++;
		treeSet.add(node3);
		now++;
		treeSet.add(node4);

		System.out.println();
		System.out.println(treeSet);
		Iterator<Node> it = treeSet.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}