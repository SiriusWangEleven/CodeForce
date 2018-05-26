import java.util.Scanner;

public class Main
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int d,L,v1,v2;
		d = in.nextInt();
		L = in.nextInt();
		v1 = in.nextInt();
		v2 = in.nextInt();
		
		double ans = 1.0*(L-d)/(v1+v2);
		System.out.println(ans);
		
	}
}