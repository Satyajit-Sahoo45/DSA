import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		dasasd(t);
	}

	public static void dasasd(int t) {
		
		if (t>=1 && t<=9) {
			System.out.println(t);
		}
		else {
			int r = t%10;
			int q = t/10;
			
			
		}
	}

}
