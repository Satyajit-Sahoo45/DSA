import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> al3 =  SwapNo(n,m);
		System.out.println(al3);
	}
	public static ArrayList<Integer> SwapNo(int n, int m) {
		ArrayList<Integer> al = new ArrayList<>();
		n=n^m;
		m=n^m;
		n=n^m;
		al.add(n);
		al.add(m);		
		return al;
	}
}
