import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int d = in.nextInt();

		int[] cnt = new int[105];
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			int tmp = in.nextInt();
			if (cnt[tmp] == 0)
				list.add(tmp);

			cnt[tmp]++;
		}
		
		Collections.sort(list);
		
		int ans = 100;
		for (int i = 0; i < list.size(); i++) {
			int remove = 0;
			int k = i;
			for (int j = list.size() - 1; j >= i; j--) {
				if (list.get(j) - list.get(i) > d)
					remove += cnt[list.get(j)];
				else {
					break;
				}
			}
			
			for(int j = 0;j<k;j++)
				remove += cnt[list.get(j)];
			
			ans = Math.min(ans, remove);
		}
		
		System.out.println(ans);
	}

}