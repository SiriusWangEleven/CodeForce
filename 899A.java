import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cnt2 = 0, cnt1 = 0;
		for (int i = 0; i < n; i++) {
			int tmp = Integer.valueOf(st.nextToken());
			if (tmp == 2)
				cnt2++;
			else {
				cnt1++;
			}
		}
		int ans = Math.min(cnt1, cnt2);
		ans += (cnt1 - ans) / 3;
		System.out.println(ans);
	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}