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

		int n = Integer.valueOf(st.nextToken());

		int a[] = new int[105];
		a[1] = 1;
		a[2] = 2;
		for (int i = 3; i <= 100; i++)
			a[i] = i + a[i - 2];
		System.out.println(a[n]);

	}
}