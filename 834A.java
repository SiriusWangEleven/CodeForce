import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Character> cw;
	static ArrayList<Character> ccw;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		ini();
		char st = in.next().charAt(0);
		char ed = in.next().charAt(0);
		int time = in.nextInt() % 4;

		String ans = "undefined";
		boolean checkCW = checkList(st, ed, time, cw);
		boolean checkCCW = checkList(st, ed, time, ccw);
		if (checkCCW && !checkCW)
			ans = "ccw";
		if (checkCW && !checkCCW)
			ans = "cw";
		System.out.println(ans);
	}

	static boolean checkList(char st, char ed, int time,
			ArrayList<Character> list) {
		int stPos = getPos(list, st);
		int edPos = (stPos + time) % 4;
		if (list.get(edPos) == ed)
			return true;
		return false;
	}

	static int getPos(ArrayList<Character> list, char c) {
		int pos = 0;
		for (int i = 0; i < list.size(); i++) {
			if (c == list.get(i)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	static void ini() {
		char a = (char) 60, b = (char) 62, c = (char) 94, d = (char) 118;
		cw = new ArrayList<>();
		cw.add(d);
		cw.add(a);
		cw.add(c);
		cw.add(b);
		ccw = new ArrayList<>();
		ccw.add(d);
		ccw.add(b);
		ccw.add(c);
		ccw.add(a);
	}

}