import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		long sum = 1L * (n + 1) * n / 2;
		//System.out.println(sum);
		long dis = sum - sum / 2 - sum / 2;

		sum /= 2;
		long start = Math.min(sum, n);
		List<Long> list = new LinkedList<Long>();
		while (sum != 0) {
			list.add(start);
			sum -= start;
			start = Math.min(sum, start - 1);
		}
		System.out.println(dis);
		System.out.print(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
		System.out.println();

	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}