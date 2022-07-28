package Basic_Prog.com;

import java.util.*;

public class maxValueAfter_m_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //test cases.
		while(t-- > 0) {
			int n =sc.nextInt(); //size Of an array.
			int m =sc.nextInt(); //no. of operation.
			
			int[] a = new int[m];
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			int[] b = new int[m];
			for(int i=0;i<b.length;i++) {
				b[i]=sc.nextInt();
			}
			int[] k = new int[m];
			for(int i=0;i<k.length;i++) {
				k[i]=sc.nextInt();
			}
			int result = findMax(n,m,a,b,k);
			System.out.println(result);
		}
	}

	public static int findMax(int n, int m, int[] a, int[] b, int[] k) {
		int[] arr =new int[n];
		
		for(int i=0;i<m;i++) {
			int lowerbound=a[i];
			int upperbound=b[i];
			
			for(int j=lowerbound;j<=upperbound;j++) {
				arr[j]+=k[i];
			}
		}
		int max = Integer.MIN_VALUE;
//		System.out.println("max : " +max);
		for(int i=0;i<arr.length;i++) {
			 max = Math.max(max , arr[i]);
		}
		return max;
	}

}
