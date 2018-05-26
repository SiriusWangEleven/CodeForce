import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static Comparator<Long> cmp = new Comparator<Long>() {
		@Override
		public int compare(Long o1, Long o2) {
			// TODO Auto-generated method stub
			
			if(o2 - o1 > 0)
				return 1;
			else if (o2-o1 == 0)
				return 0;
			else 
				return -1;
			
		}
	};

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());

			int[] a = new int[n];
			int[] b = new int[m];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				a[i] = Integer.valueOf(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++)
				b[i] = Integer.valueOf(st.nextToken());

			List<PriorityQueue<Long>> queList = new LinkedList<PriorityQueue<Long>>();
			for (int i = 0; i < n; i++) {
				PriorityQueue<Long> que = new PriorityQueue<>(cmp);
				for (int j = 0; j < m; j++) {
					que.add(1L * a[i] * b[j]);
				}
				queList.add(que);
			}

			PriorityQueue<Long> que = new PriorityQueue<>(cmp);
			for (int i = 0; i < queList.size(); i++) {
				que.add(queList.get(i).poll());
			}

			que.poll();
			System.out.println(que.poll());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}