import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int claw[] = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = n; i >= 1; i--)
			claw[i] = Integer.valueOf(st.nextToken());

		br.close();

		int cnt = 0;
		int now = 1;
		int endPoint = 0;
		boolean alive = true;
		while (now <= n) {
			if (now <= endPoint)
				alive = false;
			else
				alive = true;

			if (alive)
				cnt++;
			endPoint = Math.max(endPoint, now + claw[now]);
			now++;
		}
		System.out.println(cnt);
	}

}