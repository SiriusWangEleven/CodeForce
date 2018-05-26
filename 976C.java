import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static class Seg {
		int id, left, right;

		Seg(int id, int left, int right) {
			this.id = id;
			this.left = left;
			this.right = right;
		}

		public String toString() {
			return "(id==" + id + ", left==" + left + ", right==" + right + ")";
		}
	}

	static Comparator<Seg> cmp = new Comparator<Seg>() {
		public int compare(Seg seg1, Seg seg2) {
			return seg1.left - seg2.left;
		}
	};

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		ArrayList<Seg> segs = new ArrayList<>();
		HashMap<Integer, ArrayList<Integer>> leftIdMap = new HashMap<>();
		int findSameLeft = -1;

		for (int i = 1; i <= n; i++) {
			int left = in.nextInt();
			int right = in.nextInt();
			segs.add(new Seg(i, left, right));
			if (findSameLeft != -1) {
				continue;
			}
			if (null == leftIdMap.get(left)) {
				ArrayList<Integer> idList = new ArrayList<>();
				idList.add(i);
				leftIdMap.put(left, idList);
			} else {
				leftIdMap.get(left).add(i);
				findSameLeft = left;
			}
		}

		if (findSameLeft != -1) {
			int id0 = leftIdMap.get(findSameLeft).get(0);
			int id1 = leftIdMap.get(findSameLeft).get(1);
			int right1 = segs.get(id0 - 1).right;
			int right2 = segs.get(id1 - 1).right;
			if (right1 <= right2) {
				System.out.println(id0 + " " + id1);
			} else {
				System.out.println(id1 + " " + id0);
			}
		} else {
			// every seg has different left value
			segs.sort(cmp);
//			System.out.println(segs);
			int[] maxRight = new int[n];
			int tmpMax = -1;
			for (int i = 0; i < n; i++) {
				tmpMax = Math.max(tmpMax, segs.get(i).right);
				maxRight[i] = tmpMax;
			}
//			System.out.println(Arrays.toString(maxRight));
			int id0 = -1, id1 = -1;
			int findRight = -1;
			for (int i = n - 1; i >= 1; i--) {
				int nowRight = segs.get(i).right;
//				System.out.println("now right==" + nowRight);
				if (nowRight <= maxRight[i - 1]) {
					id0 = segs.get(i).id;
					findRight = maxRight[i - 1];
					break;
				}
			}
//			System.out.println(findRight);
			if (findRight != -1) {
				for (int i = 0; i < n; i++) {
					if(segs.get(i).right == findRight){
						id1 = segs.get(i).id;
						break;
					}
				}
			}
			System.out.println(id0 + " " + id1);
		}

	}
}