import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String string = in.nextLine();
		String[] time = string.split(":");
		int hh = Integer.valueOf(time[0]);
		int mm = Integer.valueOf(time[1]);
		int sum = in.nextInt();
		mm += sum;

		hh += mm / 60;
		hh %= 24;
		mm %= 60;
		String zeroH = hh < 10 ? "0" : "";
		String zeroM = mm < 10 ? "0" : "";
		System.out.println(zeroH + hh + ":" + zeroM + mm);
	}
}