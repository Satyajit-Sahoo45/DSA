package Basic_Prog.com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[m];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		Solution(a,b,n,m);
	}

	private static void Solution(int[] a, int[] b, int n, int m) {
		Set<Integer> hs = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			hs.add(a[i]);
		}
		for(int i=0;i<m;i++) {
			hs.add(b[i]);
		}
		
		System.out.println("size = " + hs.size());
	    System.out.println(hs);
	}

}
