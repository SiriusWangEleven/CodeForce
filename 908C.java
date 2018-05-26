import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double r = in.nextDouble();
		LinkedList<Double> list = new LinkedList<>();

		LinkedList<Double>[] circles = new LinkedList[1005];
		for (int i = 1; i <= 1000; i++)
			circles[i] = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			double y = r;
			for (int j = x; j >= 1; j--) {
				int size = circles[j].size();
				if (size > 0) {
					y = Math.max(y, getY(x, r, j, circles[j].get(size - 1)));
				}
			}
			for (int j = x + 1; j <= 1000; j++) {
				int size = circles[j].size();
				if (size > 0) {
					y = Math.max(y, getY(x, r, j, circles[j].get(size - 1)));
				}
			}
			circles[x].add(y);
			list.add(y);
		}

		in.close();
		for (int i = 0; i < list.size() - 1; i++)
			System.out.print(list.get(i) + " ");
		System.out.println(list.get(list.size() - 1));

	}

	public static double getY(double x, double r, double x1, double y1) {
		if ((x - x1) * (x - x1) > 4 * r * r)
			return r;
		double y = 4 * r * r - (x - x1) * (x - x1);
		y = Math.sqrt(y) + y1;
		return y;
	}

}