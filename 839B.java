import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] a = new int[k];

		int seat4 = n;
		int seat2 = n * 2;

		int[] left = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			int loop = a[i] / 4;
			if (seat4 >= loop)
				seat4 -= loop;
			else {
				loop -= seat4;
				seat4 = 0;
				seat2 -= loop * 2;
			}
			left[a[i] % 4]++;
		}

		if (seat4 >= left[3]) {
			seat4 -= left[3];
		} else {
			left[3] -= seat4;
			seat4 = 0;
			seat2 -= left[3] * 2;
		}
		
//		System.out.println(seat4 + " " + seat2);
		int seat1 = 0;
		if(seat4 >= left[2]){
			seat4 -= left[2];
			seat1 += left[2];
		}else {
			left[2] -= seat4;
			seat1 += seat4;
			seat4 = 0;
		}
//		System.out.println(seat4 + " " + seat2);
//		System.out.println(left[2]);
		int x = seat2, y = left[2];
		seat2 -= Math.min(x, y);
		left[2] -= Math.min(x, y);
		left[1] += left[2] * 2;
		

		if (left[1] <= seat2 + seat1 + seat4 * 2)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}