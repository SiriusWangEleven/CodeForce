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
		 int n = Integer.valueOf(st.nextToken());
		 StringBuffer sb = new StringBuffer(br.readLine());
		 sb.append(" ");
//		 System.out.println(sb);
//		 System.out.println(sb.length());
		 
		 n ++;
		 
		 int volume = 0;
		 int vw = 0;
		 for(int i=0;i<sb.length();i++)
		 {
			 if(sb.charAt(i)==' ')
			 {
				 volume = Math.max(volume, vw);
				 vw = 0;
				 continue;
			 }
			 if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
				 vw ++ ;
		 }
		 System.out.println(volume);
	}

}